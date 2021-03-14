package com.example.demo.comandosP



class Persona{

	String name
	String lastName
	Integer age
	String fullName 

	static PersonCommand toPersonCommand(Person person){
		new PersonCommand={
			name: person.name,
			lastName: person.lastName,
			age: person.age,
			fullName: "${name}.${lastName}";
		}

	}

}