package myApp.mvc.controlers;

import myApp.controlers.jsons.PersonJson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldMVC {

    @GetMapping()
    public String hello(Model model) {//parte din semnatura de metoda - model
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
        model.addAttribute("persons", list);
        return "hello";//textul returnat trebuie sa fie un nume de template - match cu nume de fisier din folder de template
    }
}
