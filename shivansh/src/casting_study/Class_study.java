package casting_study;

public class Class_study {

	public static void main(String[] args) {
	//implicit casting lower-->higher
		int a=10;
		System.out.println("the value of a is "+a);
		
		float b=a;
		System.out.println("the value of b is "+b);
		
		//explicit casting higher-->lower
		double c=10.2548;
		System.out.println("the value of c is "+c);
		
		int d=(int)c;
		System.out.println("the value of d is "+d);

	}

}
