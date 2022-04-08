package this_use;

public class Dell extends Laptop {
int a=10;

	public static void main(String[] args) {
	Dell d=new Dell();
	d.display();

	}
public void display()
{
	int a=10;
	int sum=10+a;
	System.out.println("sum is using local variable a "+sum);
	int sum1=10+this.a;//by using global variable
	System.out.println("sum is using global variable a "+sum1);
	int sum2=10+super.a;//by using global variable from supar class
	System.out.println("sum is using supar class g.variable "+sum2);
	}
}
