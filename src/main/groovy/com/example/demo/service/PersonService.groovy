package com.example.demo.service
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
	List<PersonCommand>getPeople(){
		List<Person>people = personRepository.findAll()
		people.collect(){ Perso person ->
			PersonCommand.toPersonCommand(person)
		}
	}
}