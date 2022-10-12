import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadReverseTxt extends ReaderAbstract implements ReaderInterface {
	
	public ReadReverseTxt(String fileName) {
		super.fileName =  fileName;
	}
	
	@Override
	public void read() {
		super.readTxt(fileName);
	}
	
	public void display() {
		ArrayList<String> texte = new ArrayList<>();
		Scanner bufferedReader = new Scanner(new StringReader(text));
		
		while (bufferedReader.hasNext()) {
			texte.add(bufferedReader.nextLine()); 
		}
		
		Collections.reverse(texte); // inverse mon array :[Le Lorem Ipsum est., kayak, ca fonctionne ?]
		//for-each loop (boucle for améliorée)
		for (String texteLigne : texte) {
			System.out.println(texteLigne);
		}
			
	}

}
