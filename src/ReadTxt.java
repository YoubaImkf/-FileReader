
public class ReadTxt extends ReaderAbstract implements ReaderInterface {
	
	public ReadTxt(String file) {
		super.fileName = file; //must change file to protected
	}
	

	public @Override void read() {
		super.readTxt(fileName);
	}
	
	public void display() {
		 System.out.println(super.text);
	}
	
	
}
