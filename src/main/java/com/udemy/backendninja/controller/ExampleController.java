package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	private static final String EXAMPLE = "example";

	//primera forma
	@RequestMapping(value="/exampleString",method=RequestMethod.GET)
	public String exampleString(Model model){
		model.addAttribute("person",new Person("Fernando",30));
		return EXAMPLE;
	}

	//Segunda forma
	@RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	public ModelAndView exampleMAV(){
		ModelAndView model = new ModelAndView(EXAMPLE);
		model.addObject("person",new Person("Enrique",29));
		return model;
	}
}
