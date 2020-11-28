package myApp.spring.types;

import myApp.spring.di.TargetDI;
import myApp.spring.factory.Product;
import myApp.spring.factory.TargetDIFactory;
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
        TargetDI bean = applicationContext.getBean(TargetDI.class);
        System.out.println(bean);
        System.out.println(applicationContext.getBean(TargetDIFactory.class));
        System.out.println(applicationContext.getBean(Product.class));
        System.out.println("==================");
        bean.xxx.f();
        bean.xxx.f();
        System.out.println("==================");

        applicationContext.getBean(MySingleton.class).service();

    }
}
