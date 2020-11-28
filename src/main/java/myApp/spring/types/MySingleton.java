package myApp.spring.types;

import myApp.spring.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "aaa")

public class MySingleton {//lifecicle

    @Autowired
    AppConfig appConfig;
    MySingleton() {
        System.out.println("construct " + this);

    }

    @Value("${dummyProperty")//obligatoriu ca sa il interpreteze - dute si cauta cheia, iei cheia si valoarea
            private String dummyProperty;



    @PostConstruct//se ruleaza la crearea de instanta
    public void construct() {
        System.out.println("initializeaza " + this);
        System.out.println(appConfig.getDummyProperty());
    }

    @PreDestroy//inainte de a distruge singleton-ul se distruge bean-ul se utilizeaza daca este cazul
    public void destroy() {
        System.out.println("Distruge tot "+ this);
    }

    public void service() {
        System.out.println("business complex");
    }

}
