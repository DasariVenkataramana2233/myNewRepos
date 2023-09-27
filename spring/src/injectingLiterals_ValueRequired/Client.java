package injectingLiterals_ValueRequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		  
		  ApplicationContext context=new
		  ClassPathXmlApplicationContext("injectingLiterals.xml");
		  
		  Student student=context.getBean("student",Student.class);
		  
		  student.StudentInfo();
		  
		 

	}

}
