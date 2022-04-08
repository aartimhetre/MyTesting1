package generalization;

public class Jio implements TRAI{

	@Override
	public void call() {
		System.out.println("jio calling=1rs/min");
		
	}

	@Override
	public void msgs() {
		System.out.println("jio msgs=100msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("jio data=1GB/day");
		
	}
	public void jiotv()
	{
		System.out.println("jio= 10 channels extra");
	}

}
