package com.practicespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {

	@Value("${student.id}")
	private int id;

	@Autowired
	@Qualifier("sciexam")
	private Exam exam;

	public void setId(int id) {
		this.id = id;
	}

	public void display() {

		System.out.println(this.id);
		if (this.exam != null) {
			exam.examName();

		} else {

			System.out.println("exam property object not injected properly");
		}

	}
}
