import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public abstract class ReaderAbstract {
	
	protected String fileName;
	protected String text = ""; // ="" sinon "null" apparait en 1er
	
	/**
	 * Méthode pour lire un fichier Texte 
	 * @param fileName
	 */
	public void readTxt(String fileName) {
		try
	    {
	      FileInputStream filePath = new FileInputStream(fileName);   
	      Scanner scanner = new Scanner(filePath,"ISO-8859-1"); //utf8 
	      
	      //si y a une autre ligne à lire = True
	      while(scanner.hasNextLine())
	      {
	    	  this.text += (scanner.nextLine() + "\n");
//	          System.out.println(scanner.nextLine());
	      }
	      scanner.close();    
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	}
	


	/**
	 * Méthode pour lire un fichier .Wav
	 * @param fileName
	 */
	public void readWav(String fileName) throws UnsupportedAudioFileException,
	IOException, LineUnavailableException {
		
		try (Scanner scanner = new Scanner(System.in)) {
			File file = new File(fileName);
			AudioInputStream audio = AudioSystem.getAudioInputStream(file);
			
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
		        
			String resp = "";

			
			while(!resp.equals("Q")) {
				System.out.println("A = play,  P = pause, R = reset, Q = quit");
				System.out.println("Do a choice");
				
				resp = scanner.next();//sinon ne se lance pas
				resp = resp.toUpperCase();
				
				switch(resp) {
					case("A"):
						clip.start();
						break;
					case("P"):
						clip.stop();
						break;
					case("R"):
						clip.setMicrosecondPosition(0);
						break;
					case("Q"):
						clip.close();
						break;
					default: System.out.println("Wrong!!");
					
					
				}
			}
			
			
		}
		
	}
}
