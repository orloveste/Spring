package myApp.mvc.controlers;

import myApp.controlers.jsons.PersonJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/persons")
public class PersonMVCController {
    @GetMapping(value = "list")
    public String listPersons(Model model) {//parte din semnatura de metoda - model
        List<PersonJson> list = new ArrayList<>();
        {
            PersonJson personJson = new PersonJson();
            personJson.setCnp(1);
            personJson.setName("ion");
            list.add(personJson);
        }
        {
            PersonJson personJson = new PersonJson();
            personJson.setCnp(2);
            personJson.setName("ghe");
            list.add(personJson);
        }
        model.addAttribute("persons", list);//controller-ul gestioneaza modelul si view-ul care trebui desenat

        return "persons";//textul returnat trebuie sa fie un nume de template - match cu nume de fisier din folder de template
    }
    @GetMapping(value = "/createPerson")
    public String createPerson (Model model){
        PersonJson personJson = new PersonJson();
        model.addAttribute("person", personJson);
        return "personCreate";
    }
    @PostMapping(value = "/savePerson")
    public String savePerson (Model model, @ModelAttribute PersonJson personJson, BindingResult errors){
        model.addAttribute("person", personJson);
        System.out.println("saving " + personJson);
        return "personCreate";
    }
}
