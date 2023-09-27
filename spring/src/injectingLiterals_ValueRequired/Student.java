package injectingLiterals_ValueRequired;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name ;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
	
	public void StudentInfo() {
		
		System.out.println("Student name : " + this.name);
		
		System.out.println("Interested Course : " + this.interestedCourse);
		
		System.out.println("Hobby of mine is : " + this.hobby);
	}
	

}
