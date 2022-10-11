
public class ReadReverseTxt extends ReaderAbstract implements ReaderInterface {
	
	public ReadReverseTxt(String fileName) {
		super.fileName =  fileName;
	}
	
	@Override
	public void read() {
		super.readTxt(fileName);
	}
	
	public void display() {
		//https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
		StringBuilder txtReverse = new StringBuilder(super.text);//utf8 ?
		 System.out.println(txtReverse.reverse());
	}

}
