import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadReverseLineTxt extends ReaderAbstract implements ReaderInterface {
	
	public ReadReverseLineTxt(String fileName) {
		super.fileName =  fileName;
	}
	
	@Override
	public void read() {
		super.readTxt(fileName);
	}
	
	public void display() {
		ArrayList<String> texte = new ArrayList<>();
		Scanner scanner = new Scanner(new StringReader(text));
		
		while (scanner.hasNext()) {
			texte.add(scanner.nextLine()); 
		}
		
		Collections.reverse(texte); // inverse mon array :[Le Lorem Ipsum est., kayak, ca fonctionne ?]
		//for-each loop (boucle for améliorée)
		for (String texteLigne : texte) {
			System.out.println(texteLigne);
		}
			
	}

}
