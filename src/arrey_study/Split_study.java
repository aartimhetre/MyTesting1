package arrey_study;

public class Split_study {

	public static void main(String[] args) {
		String s="I :LOVE :MY :INDIA ";
		String sp=":";
		String[] required=s.split(sp);
	
		System.out.println(required[0]);
		System.out.println(required[1]);
		System.out.println(required[2]);
		System.out.println(required[3]);
		
		System.out.println("====================");
		
		String p="my name is Aarti";
		String q=" ";
		String[] finaly=p.split(q);
		System.out.println(finaly[0]);
		System.out.println(finaly[1]);
		System.out.println(finaly[2]);
		System.out.println(finaly[3]);
	}

}
