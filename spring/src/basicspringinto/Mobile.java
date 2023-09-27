package basicspringinto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		// Basic ways to acess the methods which are present in
		// Classes(Airtel,vodafone).

		/*
		 * Airtel airtel=new Airtel(); airtel.calling(); airtel.data();
		 * 
		 * Vodafone vodafone=new Vodafone(); vodafone.calling(); vodafone.data();
		 */

		// OR BY USing Interface

		/*
		 * Sim sim=new Airtel(); Sim sim1=new Vodafone(); sim.calling();
		 * sim.data();sim1.calling();sim1.data();
		 */

//BY using Spring we don't need to create objects,it will create an objects for us.If we have config file(XML file)

		// IF we introduce any class we can able to handle it very easily.

		ApplicationContext context = new ClassPathXmlApplicationContext("BasicIntro.xml");

//		        Airtel airtel=(Airtel) context.getBean("airtel");

		// Airtel airtel1=context.getBean("airtel",Airtel.class); no need conversion we
		// use Airtel.class here

		/*
		 * airtel.calling();airtel.data();
		 * 
		 * Vodafone voda=context.getBean("vodafone",Vodafone.class);
		 * 
		 * voda.calling();voda.data();
		 */
		
		Sim sim=context.getBean("sim",Sim.class);
		
		sim.calling();sim.data();
		
		Sim simm=context.getBean("sim1",Sim.class);
		
		simm.calling();simm.data();
		
		Sim simmm=context.getBean("jio",Sim.class);
		
		simmm.calling();simmm.data();

		Sim bsnl=context.getBean("bsnl",Sim.class);
		
		bsnl.calling();bsnl.data();
	}

}
