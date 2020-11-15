package myApp.spring.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {
    @Bean
    Product createProduct() {
        return new Product();
    }
}
