package myApp.spring.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {
    @Bean// metoda asta este un factory
    Product createProduct() {
        return new Product();
    }
}
