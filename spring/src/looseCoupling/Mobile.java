package looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

    ApplicationContext context=new  ClassPathXmlApplicationContext("looseCoupling.xml");
    
     Airtel airtel=context.getBean("airtel",Airtel.class);
     
     airtel.serve();

	}

}
