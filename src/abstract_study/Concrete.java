package abstract_study;

public class Concrete extends Sample{

	public static void main(String[] args) {
		Concrete c=new Concrete();
		c.test1();//from sample class
		c.test2();//from sample class
		c.test3();//from sample class incomplet method 
		c.test4();//from concrete class

	}


	public void test3()
	{
	System.out.println("test3 method completed in concrete class");
		}
public void test4()
{
	System.out.println("method from concrete class");
	}
}