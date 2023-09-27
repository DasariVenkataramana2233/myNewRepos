package allAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		College college=context.getBean("college",College.class);
		
		college.test();
		
		((AnnotationConfigApplicationContext)context).close();//or else use Annotation config child class direcclty and use context.close()
		
		
		
	}

}
