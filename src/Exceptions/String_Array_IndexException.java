package Exceptions;

public class String_Array_IndexException {

	public static void main(String[] args) {
		String s="aarti";
		
		//s.charAt(0);
		//System.out.println(s.charAt(0));
try {
	s.charAt(5);
	
} catch (StringIndexOutOfBoundsException e) {
//	e.printStackTrace();
	System.out.println("index should have between 0-4");
}
	}

}
