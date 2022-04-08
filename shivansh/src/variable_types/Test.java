package variable_types;

public class Test {
	int a=90;
	static int b=80;
	
public static void main(String[] args) {
	Test t=new Test();
	int sum=10+t.a;
	System.out.println("Sum is "+sum);
	int sub=80-b;
	System.out.println("sub is "+sub);
	int sub1=b-t.a;
	System.out.println("sub1 is "+sub1);
	

	}

}
