package myApp.mvc.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldMVC {

    @GetMapping()
    public String hello(Model model) {//parte din semnatura de metoda - model
        return "hello";//textul returnat trebuie sa fie un nume de template - match cu nume de fisier din folder de template
    }
}
