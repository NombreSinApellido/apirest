package com.Ejemplo.apirest.Person;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPerson(Person person)
    {
        personRepo.save(person);
    }
    public void readPerson(Id Id)
    {
        personRepo.findAllById(null);
    }
    public void updatePerson(Person person)
    {
        personRepo.delete(person);
    }    
    public void deletePerson(Person person)
    {
        personRepo.delete(person);
    }   
}
