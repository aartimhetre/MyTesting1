package daily_practice;

public class Jio extends Airtel{

	public static void main(String[] args) {
            Jio j=new Jio();
            j.calling();
            j.Internet();
            
            Airtel a=new Airtel();
            a.Internet();
            
            Airtel ja=new Jio();
            ja.Internet();

	}

	public void Internet()
	{
		System.out.println("jio internet is fast");
	}
	public void calling()
	{
		System.out.println(" jio calling is good");
	}
}
