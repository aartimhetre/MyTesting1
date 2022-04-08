package casting_study;

public class Son extends Father{
//up casting example
	public static void main(String[] args) {
		Son s=new Son();//creating subclass object
		s.money();//calling subclass method
		s.bike();//calling subclass method
		
		Father f=new Father();//creating superclass object
		f.money();//calling superclass method
		
		Father f1=new Son();//creating subclass object by using as a reference superclass
		f1.money();//calling subclass
//f1.bike();we can"t call the method which is not common
	}

	public void money()
	{
		System.out.println("sons money 1lac");
	}
	public void bike()
	{
		System.out.println("sons bike pulsur");
	}
}
