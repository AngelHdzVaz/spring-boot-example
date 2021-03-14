package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody
import com.example.demo.comandosP.Persona
import com.example.demo.service.PersonaService
import org.springframework.beans.factory.annotation.Autowired

@Controller

public class HomeController{
 
 @Autowired
 PersonaService personaService
 
 @ResponseBody
 @RequestMapping("/list_people")
 	List<Persona> listPeople(){
 		personaService.getPeople()

	}

}

