import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ReadWav extends ReaderAbstract implements ReaderInterface {
	
	public ReadWav(String fileName) {
		super.fileName = fileName;
	}

	@Override
	public void read() {
		try {
			super.readWav(fileName);
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void display() {
		// TODO Auto-generated method stub
	}


}
