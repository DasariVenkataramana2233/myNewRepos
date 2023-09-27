package configpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "controllerpackage")
public class MomCafeConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();

		viewresolver.setPrefix("/WEB-INF/views/");
		viewresolver.setSuffix(".jsp");

		return viewresolver;

	}

}
