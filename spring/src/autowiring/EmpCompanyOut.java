package autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpCompanyOut {

	public static void main(String[] args) {

         Resource resource=new ClassPathResource("Autowire1.xml");
         
         BeanFactory factory=new XmlBeanFactory(resource);
         
         Employee ee=(Employee)factory.getBean("employee");
         
         ee.infoDisplay();
         
         

	}

}
