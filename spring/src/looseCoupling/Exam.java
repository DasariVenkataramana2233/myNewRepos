package looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("looseCoupling1.xml");

		Student s=context.getBean("student", Student.class);
		
		s.cheat();

	}

}
