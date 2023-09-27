package basicspringinto;

public class Vodafone implements Sim{
	
	public Vodafone() {
		
		System.out.println("vodafone constructor called");
	}

	@Override
	public void calling() {

         System.out.println("Calling method in VOdafone");
	}

	@Override
	public void data() {

      System.out.println("data method in Vodafone");
		
	}

}
