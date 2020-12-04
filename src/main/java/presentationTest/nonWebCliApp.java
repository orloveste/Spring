package presentationTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import presentationTest.beans.MyBean;
import presentationTest.beans.SecondName;
import presentationTest.config.AppConfig;

@SpringBootApplication
public class nonWebCliApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(nonWebCliApp.class, args);
    }
    public void run(String... args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean.sayHello());

        bean.setName(new SecondName());
        System.out.println(bean.sayHello());
    }
}
