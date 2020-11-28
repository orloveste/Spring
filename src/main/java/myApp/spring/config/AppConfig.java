package myApp.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${dummyProperty")
    private String dummyProperty;

    public String getDummyProperty() {
        return dummyProperty;
    }
}
