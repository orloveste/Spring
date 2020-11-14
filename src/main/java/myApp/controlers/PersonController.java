package myApp.controlers;

import lombok.RequiredArgsConstructor;
import myApp.controlers.jsons.PersonJson;
import myApp.services.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// https://ro.wikipedia.org/wiki/Model-view-controller
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    final private PersonService personService;

    @GetMapping //expune serviciul REST si il implementeaza
    public List<PersonJson> findAll() {
        return personService.findAll();
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
