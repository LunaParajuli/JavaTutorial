package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping(value ="/SimpleForm", method = RequestMethod.GET)
	public void SimpleForm(Model model) {
		model.addAttribute(new UserForm());
	}
	
	@RequestMapping(value ="/displayForm", method = RequestMethod.POST)
	public void displayForm(@ModelAttribute("user") User user, Model model) {
		model.addAttribute("user",user);
	}
	
}

