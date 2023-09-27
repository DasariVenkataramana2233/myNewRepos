package basicspringinto;

public class Airtel implements Sim {
	
	public Airtel() {
		
		System.out.println("Airtel constructor called");
	}

	@Override
	public void calling() {
		
		System.out.println("calling method in Airtel");
	}

	@Override
	public void data() {

       System.out.println("data method in Airtel");
		
	}

	
}
