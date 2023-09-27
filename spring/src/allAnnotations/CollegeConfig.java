package allAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "allAnnotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean public College collegeBean() {
	 * 
	 * College college=new College();
	 * 
	 * college.setPrinicipal(principalBean());
	 * 
	 * college.setTeacher(mathTeacherBean());
	 * 
	 * return college; }
	 * 
	 * @Bean public Principal principalBean() {
	 * 
	 * return new Principal(); }
	 * 
	 * @Bean public Teacher mathTeacherBean() {
	 * 
	 * return new MathTeacher(); }
	 */

}