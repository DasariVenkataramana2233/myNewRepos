package com.practicespring;

import org.springframework.stereotype.Component;

@Component("sciexam")
public class SciExam implements Exam {

	@Override
	public void examName() {

		System.out.println("science Exam");

	}

}
