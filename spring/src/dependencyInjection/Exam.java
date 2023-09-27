package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

          ApplicationContext context=new ClassPathXmlApplicationContext("dependecnyinjection.xml");
          
          Student s=context.getBean("student",Student.class);
          
          s.displayInfo();
    
//          Student s2=context.getBean("student1",Student.class);
//          
//          s2.displayInfo();

	}

}
