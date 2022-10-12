
public class ReadPalindrome extends ReaderAbstract implements ReaderInterface {

	
	public ReadPalindrome(String FileName){
		super.fileName=FileName;
	}
	
	@Override
	public void read() {
		super.readTxt(fileName);
	}

	@Override
	public void display() {	
		String reverse ="";
		 for ( int i = super.text.toString().length() - 1; i >= 0; i-- )  
	         reverse += super.text.toString().charAt(i);
		 System.out.println(reverse);
		 
			//System.out.println(new StringBuilder(text).reverse().toString());
	}
	
//mrche pas alors que dans le main avec un string oui
//	private boolean isPalindrome(String original) {
//		String reverse ="";
//		 for ( int i = original.toString().length() - 1; i >= 0; i-- )  
//	         reverse  += original.toString().charAt(i);  
//	      if (original.toString().equals(reverse))  
//	         return true; 
//	      else  
//	         return false;   
//		   
//	}
}
