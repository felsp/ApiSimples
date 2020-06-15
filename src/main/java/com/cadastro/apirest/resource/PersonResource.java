package com.cadastro.apirest.resource;

import java.util.ArrayList;
import java.util.List;

import com.cadastro.apirest.models.Person;
import com.cadastro.apirest.repositories.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping(path= "/pessoas")
public class PersonResource {

    private PersonRepository personRepository;

    public PersonResource(PersonRepository personRepository){
        super();
        this.personRepository = personRepository;
    }
    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person) {
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll(){
        List<Person> persons = new ArrayList<>();
        persons = personRepository.findAll();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }
}
