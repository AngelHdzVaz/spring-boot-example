package com.example.demo.service

import groovy.util.logging.Slf4j
import com.example.demo.comandosP.Persona
import org.springframework.stereotype.Service
import com.example.demo.domain.Person
import com.example.demo.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional


@Slf4j
@Service
class PersonaService{
	@Autowired
	PersonRepository personRepository

	@Transactional(readOnly = true)
	List<Persona>getPeople(){
		List<Person>people = personRepository.findAll()
		people.collect(){ Person person ->
			Persona.toPersonCommand(person)
		}
	}
}