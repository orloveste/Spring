package myApp.spring.types;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "aaa")

public class MySingleton {//lifecicle

    MySingleton() {
        System.out.println("construct " + this);
    }

    @PostConstruct//se ruleaza la crearea de instanta
    public void construct() {
        System.out.println("initializeaza " + this);
    }

    @PreDestroy//inainte de a distruge singleton-ul se distruge bean-ul se utilizeaza daca este cazul
    public void destroy() {
        System.out.println("Distruge tot "+ this);
    }
}
