package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

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
		model.addAttribute("people",this.getPeople());
		return EXAMPLE;
	}

	//Segunda forma
	@RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	public ModelAndView exampleMAV(){
		ModelAndView model = new ModelAndView(EXAMPLE);
		model.addObject("people",this.getPeople());
		return model;
	}
	private List<Person> getPeople() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Enrique",29));
		people.add(new Person("Juan",21));
		people.add(new Person("Pedro",89));
		people.add(new Person("Sofia",27));
		people.add(new Person("Miguel",72));
		return people;
	}
}
