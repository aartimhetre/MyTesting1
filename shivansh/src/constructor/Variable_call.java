package constructor;

public class Variable_call {
int a=10;//non-static variable 
static int b=20;//static variable
String name="Velocity";
	public static void main(String[] args) {
		Variable_call v=new Variable_call();//creating object for non-static method
		System.out.println("value of variable a is "+v.a);//calling non static variable
		System.out.println("value of variable b is "+b);//calling static variable
		System.out.println("value of name is "+v.name  );//calling non static variable
		

	}

}
