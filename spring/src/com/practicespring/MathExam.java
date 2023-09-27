package com.practicespring;

import org.springframework.stereotype.Component;

@Component("mathexam")
public class MathExam implements Exam{

	@Override
	public void examName() {
		
		System.out.println("matheExam");
		
	}

	
}
