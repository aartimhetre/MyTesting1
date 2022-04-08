package generalization;

public class AirTel implements TRAI{

	@Override
	public void call() {
		System.out.println("Airtel calling=1.5rs/min");
		
	}

	@Override
	public void msgs() {
		System.out.println("Airtel msgs=150msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel data=1.5GB/day");
		
	}
	public void Airtel_d2h()
	{
		System.out.println("Airtel d2h= 20 channels extra");
	}
	

}
