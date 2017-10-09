package Com.Aartek.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
import Com.Aartek.Model.User;
import Com.Aartek.Service.RegistrationService;
 


@Controller
public class RegistrationController {

	@Autowired
	RegistrationService regservice;
	
	
	@RequestMapping("/Registration")
	public String showlogin(Map<String, Object> map){
		
		System.out.println("inside controller Registartion");
		map.put("registartion", new User());
		
		return "Registration";
	}
	
	
	@RequestMapping(value = "/Registered", method = RequestMethod.POST)
	public String checklogin(@ModelAttribute("registartion") User registered) {
		
		System.out.println("inside registration controller checkregistration");
	
		regservice.regservice(registered);
		
		return "Registered";
	}
}
