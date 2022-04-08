package daily_practice;

public class Constructor1 {
String language;
 Constructor1(String lang)
{
	String language=lang;
	System.out.println(language +" programming language");
	}
	
	public static void main(String[] args) {
		//call method from single parameter
		Constructor1 con=new Constructor1("JAVA");
		Constructor1 con1=new Constructor1("PYTHON");
		Constructor1 con2=new Constructor1("c");
		
		}

}
 