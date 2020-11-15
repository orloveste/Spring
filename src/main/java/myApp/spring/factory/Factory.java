package myApp.spring.factory;

import myApp.spring.di.InjectionDI3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {
    @Bean
    Product createProduct(InjectionDI3 injectionDI3) {
        return new Product();
    }
}
