package myApp.mvc.controlers;

import myApp.controlers.jsons.PersonJson;
import myApp.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/persons")

public class PersonMVCController {

    @Autowired
    PersonService personService;//populat de spring

    @GetMapping(value = "list")
    public String listPersons(Model model) {//parte din semnatura de metoda - model
        List<PersonJson> list = personService.findAll();//da-mi lista de persoane din DB

        model.addAttribute("persons", list);//controller-ul gestioneaza modelul si view-ul care trebui desenat

        return "persons";//textul returnat trebuie sa fie un nume de template - match cu nume de fisier din folder de template
    }
    @GetMapping(value = "/createPerson")// desemneaza pagina
    public String createPerson (Model model){
        PersonJson personJson = new PersonJson();
        model.addAttribute("person", personJson);
        return "personCreate";
    }
    @PostMapping(value = "/savePerson")//salveaza pagina din form - personCreate.html
    public String savePerson (Model model, @ModelAttribute PersonJson personJson, BindingResult errors){
        //scopul este diferit Rest - mai simplu
        model.addAttribute("person", personJson);
        personService.save(personJson);// de la url /persons/createPerson - mergi in pagina person.create.html
        //le salveaza in serviciu si le trimite inapoi
        List<PersonJson> list = personService.findAll();//da-mi lista de persoane din DB
        model.addAttribute("persons", list);//controller-ul gestioneaza modelul si view-ul care trebui desenat
        return "persons";//savePerson
    }
}
