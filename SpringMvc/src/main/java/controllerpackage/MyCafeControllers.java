package controllerpackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cafe")
public class MyCafeControllers {
	
	
	@RequestMapping("/homeCafe")
	public String getWelcomePage() {
			
		return "wel-come";
	}
	
	@RequestMapping("/processOrder")
	public String getOrderPage(HttpServletRequest req,Model model) {
		
		String orderedName=req.getParameter("name");
		
		model.addAttribute("order", orderedName);
		
		return "process-order";
	}

}
