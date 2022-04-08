package generalization;

public class VI implements TRAI {
	
	@Override
	public void call() {
		System.out.println("VI calling=0.5rs/min");
		
	}

	@Override
	public void msgs() {
		System.out.println("VI msgs=100msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("VI data=2GB/day");
		
	}
	public void VI_TV()
	{
		System.out.println("VI= 30 channels extra");
	}
}
