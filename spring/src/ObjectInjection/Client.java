package ObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ObjectInjection.xml");
		
		Student s=context.getBean("student",Student.class);
		
		s.displayInfo();
		
		AnotherStudent s1=context.getBean("anotherstudent",AnotherStudent.class);
		
		s1.cheat();

	}

}
