package autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class COut {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowireCout.xml");
		
		Employee e=context.getBean("emp",Employee.class);
		
		e.Display();

	}

}
