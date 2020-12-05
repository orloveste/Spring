package myApp.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //poti sa il setezi ca si contor
public class LoggingAspect { //elemente AOP wiki
    @Before(value = "execution(* myApp.spring.types.*.*(..))")
    void aspectExecutedBeforeExecutingTargetedMethods() {
        System.out.println("before executing method call BEFORE");
    }
}
