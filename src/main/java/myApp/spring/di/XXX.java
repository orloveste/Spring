package myApp.spring.di;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class XXX {
    public void f() {
        System.out.println(this + " executed by " + Thread.currentThread());
    }
}
