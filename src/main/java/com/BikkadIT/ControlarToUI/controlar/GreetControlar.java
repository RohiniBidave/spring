package com.BikkadIT.ControlarToUI.controlar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetControlar {
	
	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		
		String message = "Good Evening All";
		ModelAndView mav =new ModelAndView();
		mav.addObject("MSSEG", message);
		mav.setViewName("greet");
		return mav;
		
		
	}
	
	@GetMapping("/goodmorning")
	public String greetmag (Model model) {
		
		String mgmsg ="Good Morning All";
		model.addAttribute("GM", mgmsg);
		
		
		
		
		return "morning";
		
		
	}

}
