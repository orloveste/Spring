package myApp.spring.types;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")//managed by spring but create new instance
@Component
public class MyPrototype {

}
