package autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {

       ApplicationContext context=new  ClassPathXmlApplicationContext("annotation.xml");
       
       Human human=context.getBean("Human",Human.class);
       
       human.startPump();

	}

}
