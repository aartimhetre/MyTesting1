package interface_study;

public class IC2 implements Interface2{

	public static void main(String[] args) {
		IC2 ic=new IC2();
		ic.m1();
		ic.m2();
		ic.m3();
		ic.m4();
		ic.demo();

	}

	@Override
	public void m1() {
		System.out.println("m1 method from interface1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method from intercafe1");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method from interface3");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method from interface4");
		
	}
	public void demo()
	{
		System.out.println("demo method from same class");
	}

}
