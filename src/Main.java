import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String resp = "";
	      
		while(!resp.equals("Q")) {
		System.out.println("Read Txt = 'T'  | Read backwardsTxt 'B' | Read PalindromeTxt 'P'" );
		System.out.println("          ---------- Play Music = 'M'----------" );
		System.out.println( "                   - 'Q' for quit -" );
		resp = scanner.next();//sinon boucle
		resp = resp.toUpperCase();
		
		switch(resp){
		
		case "T":
			ReaderInterface file = new ReadTxt("txt.txt");
			file.read();
			file.display();
		break;
		
		case "B":
			ReaderInterface rf = new ReadReverseTxt("txt.txt");
			rf.read();
			rf.display();
		break;
		
		case "P":
			ReaderInterface rp = new ReadPalindrome("txt.txt");
			rp.read();
			rp.display();
		break;
		
		case "M":
			System.out.println("\n↓----------MUSIC------------↓");			
			ReaderInterface wav = new ReadWav("wav.wav");
			wav.read();
		break;
		
		case "Q":
			System.out.println("See you again");
			//[1]apres avoir choisi Musique si Q ?bug cuz 2 switch: nope? idk 
		break;
		default: System.out.println("Wrong!!");
		
			
			}

		
		}

		
	}

}
