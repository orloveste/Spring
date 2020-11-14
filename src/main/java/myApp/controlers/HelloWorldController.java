package myApp.controlers;

import lombok.RequiredArgsConstructor;
import myApp.spring.Singletone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {


    final private Singletone singletone;

    //injectie la nivel de constructor dependinte
//    public HelloWorldController(Singletone singletone) {
//        this.singletone = singletone;
//    }

    @GetMapping
    public String hello() {
        return singletone.hello();
    }
}
