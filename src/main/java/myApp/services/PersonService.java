package myApp.services;

import myApp.controlers.jsons.PersonJson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public List<PersonJson> findAll() {
        PersonJson personJson1 = new PersonJson();
        personJson1.setCnp(1);
        personJson1.setName("ion");
        PersonJson personJson2 = new PersonJson();
        personJson2.setCnp(2);
        personJson2.setName("maria");

        List<PersonJson> people = new ArrayList<>();
        people.add(personJson1);
        people.add(personJson2);
        return people;
    }

    public PersonJson findById(Integer id) {
        PersonJson personJson = new PersonJson();
        personJson.setCnp(id);
        personJson.setName("persoana cu id");
        return personJson;
    }

    public void save(PersonJson personJson) {
        System.out.println("save this " + personJson);
    }
}
