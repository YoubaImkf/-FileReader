import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String resp = "";
		
		while(!resp.equals("Q")) {
		System.out.println("Read File = 'R'  | Play Music = 'M' " );
		System.out.println( "- 'Q' for quit -" );
		resp = scanner.next();//sinon ne se lance pas
		resp = resp.toUpperCase();
		
		switch(resp){
		
		case "R":
			ReaderInterface file = new ReadTxt("txt.txt");
			file.read();
			file.display();
		break;
		
		case "V":
			ReaderInterface rf = new ReadReverseTxt("txt.txt");
			rf.read();
			rf.display();
		break;
		
		case "M":
			System.out.println("\n↓----------MUSIC------------↓");			
			ReaderInterface wav = new ReadWav("wav.wav");
			wav.read();
		break;
		
		case "Q":
			System.out.println("See you again");
//			System.exit(0); //bug ici
		break;
		default: System.out.println("Wrong!!");
		
			
			}

		
		}

		
	}

}
