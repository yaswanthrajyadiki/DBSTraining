package com.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {

	@RequestMapping(value="/calc", method=RequestMethod.GET)
	public ModelAndView calc() {
		return new ModelAndView("calc").addObject("operands", new Operands());
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("operands")Operands operands, ModelMap model) {
		if(operands.getA() != null && operands.getB() != null)
			model.addAttribute("value", (operands.getA() + operands.getB()));
		else
			model.addAttribute("value", "Not recieved any operands. Please check!");
		return "add";
	}
	
}
