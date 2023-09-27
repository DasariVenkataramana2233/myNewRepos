package autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("heartObject1")
	private Heart heart;
	
	//we don't need to use the constructors and setters if we use the @autowire in Dependecy
	
	/*
	 * public Human() {
	 * 
	 * }
	 * 
	 * public Human(Heart heart) { super(); this.heart = heart; }
	 * 
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */

	public void startPump() {

		if (heart != null) {
		
			heart.pump();
		} else {
			System.out.println("you are dead");
		}

	}
}
