package myApp.controlers;

import myApp.controlers.jsons.PersonJson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
// https://ro.wikipedia.org/wiki/Model-view-controller
@RequestMapping("/person")
public class PersonController {

    @GetMapping ("")//expune serviciul REST si il implementeaza
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

    @GetMapping("/{id}")
    public PersonJson findById(@PathVariable("id") Integer id) {
        PersonJson personJson = new PersonJson();
        personJson.setCnp(id);
        personJson.setName("persoana cu id");
        return personJson;
    }

    @PutMapping
    public void save(@RequestBody PersonJson personJson) {
        System.out.println("save this " + personJson);
    }
}
