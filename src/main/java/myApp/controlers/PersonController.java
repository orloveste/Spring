package myApp.controlers;

import myApp.controlers.jsons.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// https://ro.wikipedia.org/wiki/Model-view-controller
@RequestMapping("/person")
public class PersonController {
    @GetMapping
    public List<Person> findAll() {
        Person person1 = new Person();
        person1.setCnp(1);
        person1.setName("ion");
        Person person2 = new Person();
        person2.setCnp(2);
        person2.setName("maria");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        return people;
    }
}
