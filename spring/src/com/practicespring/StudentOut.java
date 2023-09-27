package com.practicespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentOut {

	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student s=con.getBean("student",Student.class);
		
		s.display();
	}

}
