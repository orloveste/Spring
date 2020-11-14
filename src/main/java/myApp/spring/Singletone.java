package myApp.spring;

import org.springframework.stereotype.Component;

@Component
public class Singletone {
    public String hello() {
        return "je spring";
    }
}
