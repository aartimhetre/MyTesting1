package daily_practice;

public class Applications implements Flipcart,Amazon{

	public static void main(String[] args) {
		Applications a=new Applications();
		a.grocery();
		a.electronics();
		a.shopping();

	}

	@Override
	public void electronics() {
		// TODO Auto-generated method stub
		Amazon.super.electronics();
		Flipcart.super.electronics();
	}

	@Override
	public void grocery() {
		System.out.println("grocery from amazon");
		
	}

	@Override
	public void shopping() {
	System.out.println("shopping from amazon");
		
	}

}
