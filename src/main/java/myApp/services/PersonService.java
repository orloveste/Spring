package myApp.services;

import lombok.RequiredArgsConstructor;
import myApp.controlers.jsons.PersonJson;
import myApp.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    final private PersonRepository personRepository;
    public List<PersonJson> findAll() {
        return personRepository.findAll();
    }
    public PersonJson findById(Integer id) {
        return personRepository.findById(id).get();
    }
    public void save(PersonJson personJson) {
        personRepository.save(personJson);
    }
    public void deleteById(Integer id) {
        personRepository.deleteById(id);
    }
    public void audit() {

    }

}
