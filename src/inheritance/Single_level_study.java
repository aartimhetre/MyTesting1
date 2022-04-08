package inheritance;

public class Single_level_study {
 static int i=60;//global variable
 static float value=125.45f;//global variable

	public static void main(String[] args) {
		Daughter d=new Daughter();//creating object of sub class
		d.mobile();//calling non static method from sub class or child class
		d.money();// calling nonstatic method from sub class or child class but its having in base or parents class
		d.look();//calling nonstatic method from sub class or child class but its having in base or parents class
		Daughter.addition();//calling static method from dub class but which is having actually in parent or base class
        d.String();//calling static method from dub class but which is having actually in parent or base class
        System.out.println("the value is "+(i* value));
	}

}
