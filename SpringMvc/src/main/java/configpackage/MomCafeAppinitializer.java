package configpackage;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class MomCafeAppinitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webapplicationContext = new AnnotationConfigWebApplicationContext();

		webapplicationContext.register(MomCafeConfig.class);

		DispatcherServlet dispatcher = new DispatcherServlet(webapplicationContext);

		ServletRegistration.Dynamic mycustom = servletContext.addServlet("mydispatcher", dispatcher);
		
		mycustom.addMapping("/home.com/*");
		
		mycustom.setLoadOnStartup(1);
		

	}

}
