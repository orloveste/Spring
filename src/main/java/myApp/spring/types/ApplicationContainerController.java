package myApp.spring.types;

import myApp.spring.di.TargetDI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/container")
public class ApplicationContainerController {
    @Autowired
    ApplicationContext applicationContext;

    @GetMapping
    public void play() {
        System.out.println(applicationContext);//pune mana pe container-ul de spring si poate fi interogat
        System.out.println(applicationContext.getBean(MySingleton.class));
        System.out.println(applicationContext.getBean(MyPrototype.class));
        System.out.println(applicationContext.getBean(TargetDI.class));
    }
}
