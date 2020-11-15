package myApp.spring.singleton;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MySingleton {//lifecicle
    @PostConstruct
    public void construct() {
        System.out.println("initializeaza " + this);
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Distruge tot "+ this);
    }
}
