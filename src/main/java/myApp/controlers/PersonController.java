package myApp.controlers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myApp.controlers.exceptions.MyException;
import myApp.controlers.jsons.PersonJson;
import myApp.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@RestController
// https://ro.wikipedia.org/wiki/Model-view-controller
@RequestMapping("/person")
@RequiredArgsConstructor
@Validated //va trebui sa valideze clasa
@Slf4j//lombok log
public class PersonController {
//http://localhost:8080/person Json
    final private PersonService personService;

    @GetMapping
    public ResponseEntity<List<PersonJson>> findAll(HttpServletRequest request, HttpServletResponse response) {
        if (false) {
            return ResponseEntity.ok(personService.findAll());//debug and see //proxi surogat chemi testul mok
            //dependinta exterioara - mokito
            //statusul implicit prin server - cerere primita, procesata, raspuns si trimis la client
        } else {
            return  ResponseEntity.ok(new ArrayList<>());
        }

    }

// @valid la nivel de parametru si regula de validare
    @GetMapping("/{id}")
    public PersonJson findById(@PathVariable("id") @Valid @Min(0) Integer id) {// cauti pe net exemplu pom dependency
        return personService.findById(id);
    }


    @PutMapping
    public void save(@RequestBody @Valid PersonJson personJson) {
        personService.save(personJson);
        /*System.out.println(" mesaj in consola");//specificatiile interzic asta de obicei*/
        log.error("eroare raportata");//poate fi customizat in fisiere separate dar o persoana trebuie sa analizeze
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        personService.deleteById(id);
    }

    //aspect care contorizeaza
    @GetMapping("/error")
    public void error() {
        throw new MyException("belea eroare");
    }
}
