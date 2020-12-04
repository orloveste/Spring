package presentationTest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//configurezi clasic sau automatic

@ComponentScan("presentationTest.beans")//dai calea automatic
public class AppConfig { //Warning9,14-Application context not configured for this file
    /*@Bean //configurare clasica
    public MyBean myBean() {
        MyBean bean = new MyBean();
        bean.setName("Miau");
        return bean;
    }*/

}
