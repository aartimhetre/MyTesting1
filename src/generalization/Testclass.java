package generalization;

public class Testclass {

	public static void main(String[] args) {
		Jio j=new Jio();
		j.call();
		j.msgs();
		j.data();
		j.jiotv();
		System.out.println("jio sim "+TRAI.SIM);
		
		AirTel a=new AirTel();
		a.call();
		a.msgs();
		a.data();
		a.Airtel_d2h();
		System.out.println("Airtel sim "+TRAI.SIM);
		
		VI v=new VI();
		v.call();
		v.msgs();
		v.data();
		v.VI_TV();
		System.out.println("VI sim "+TRAI.SIM);

	}

}
