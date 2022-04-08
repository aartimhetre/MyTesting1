package constructor;

public class CS3 {
String city="pune";
String name;
public CS3()
{
	name="Velocity";
	}
public static void main(String[] args) {
	CS3 c3=new CS3();
	display1();
	c3.display();
	}
public void display() {
System.out.println("I am non static display method");
System.out.println("My city name is "+city);
System.out.println("My name is "+name);
}
public static void display1()
{
	System.out.println("I am static display1 method");
	
	}

}