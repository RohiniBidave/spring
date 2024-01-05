package com.BikkadIT.ControlarToUI.controlar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeControlar {
	
	
	@GetMapping("/welcome")
	public ModelAndView welMsg() {
		String msg ="Welcome to bikkadIT";
		ModelAndView mav =new ModelAndView();
		mav.addObject("MSG", msg);
		mav.setViewName("welcome");
		
		return mav;
		
		
	}
	@GetMapping("/welcome1")
	public String welMsg1(Model model) {
		
		String welMsg= "Welcome to bikkadIT in pune"; 
		model.addAttribute("wel", welMsg);
		return "welcome1";
		
		
	}
	

}
