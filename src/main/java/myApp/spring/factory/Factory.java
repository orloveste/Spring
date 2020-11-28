package myApp.spring.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {
    @Bean// metoda asta este un factory
    Product createProduct() {// daca  pui parametri - spring va incerca sa rezolve cu autowire fara adnotare
        return new Product();
    }
}
