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
    @GetMapping
    public List<PersonJson> findAll() {
        return personService.findAll();
    }
    @GetMapping("/{id}")
    public PersonJson findById(@PathVariable("id") Integer id) {
        return personService.findById(id);
    }
    @PutMapping
    public void save(@RequestBody PersonJson personJson) {
        personService.save(personJson);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        personService.deleteById(id);
    }
}
