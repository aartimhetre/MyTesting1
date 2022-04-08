package inheritance;

public class Hierarachial {

	public static void main(String[] args) {
		Son1 s1=new Son1();
		s1.laptop();
		s1.money();
		Son2 s2=new Son2();
		s2.mobile();
		s2.money();
        Son1.car();
	}

}
