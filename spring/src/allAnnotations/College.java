package allAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Autowired
	private Principal prinicipal;

	@Value("${college.Name}")
	private String collegeName;

	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	/*
	 * public College(Principal prinicipal) {
	 * 
	 * this.prinicipal = prinicipal; }
	 * 
	 */

	public void test() {

		prinicipal.principalMethod();

		teacher.teach();

		System.out.println("My college name is : " + collegeName);

	}

	/*
	 * public void setPrinicipal(Principal prinicipal) { this.prinicipal =
	 * prinicipal; System.out.println("setter method in Setprincipal"); }
	 * 
	 * 
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * System.out.println("setter method in SetTeacher"); }
	 */

}
