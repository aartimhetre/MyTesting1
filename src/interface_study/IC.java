package interface_study;

public class IC implements Myinterface{

	public static void main(String[] args) {
		IC ic=new IC();//creating object of implimentation class
		ic.test();
		ic.test1();
		ic.test2();
		ic.test3();//called method from same class

	}

	@Override
	public void test() {
		System.out.println("test method completed in implementation class");
		
	}

	@Override
	public void test1() {
		System.out.println("test1 method completed in implementation class");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 method completed in implementation class");
		
	}
public void test3()
{
	System.out.println("test3 method called from same class");}
}
