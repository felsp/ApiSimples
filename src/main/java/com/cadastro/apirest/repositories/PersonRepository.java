package com.cadastro.apirest.repositories;


import com.cadastro.apirest.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {
}
