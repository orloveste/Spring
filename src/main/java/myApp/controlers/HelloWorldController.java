package myApp.controlers;

import myApp.spring.Singletone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    private Singletone singletone;

    //injectie la nivel de constructor dependinte
    public HelloWorldController(Singletone singletone) {
        this.singletone = singletone;
    }

    @GetMapping
    public String hello() {
        return singletone.hello();
    }
}
