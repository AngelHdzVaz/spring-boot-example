package com.example.demo.comandosP

import com.example.demo.domain.Person

class Persona{

	String name
	String lastName
	Integer age
	String fullName 

	static Persona toPersonCommand(Person person){
		new Persona(
			name: person.name,
			lastName: person.lastName,
			age: person.age,
			fullName: "${person.name} ${person.lastName}"
		)

	}

}