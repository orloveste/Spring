package presentationTest.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    /*public void setName(String miau) {//configurare clasica
    }*/
    private BeanName name; //automatic
    public MyBean(@Qualifier("firstName") BeanName name){
        this.name = name;
    }
    public void setName(BeanName name) {
        this.name = name;
    }

    public String sayHello() {
        return null;
    }
    /*public String sayHello() {
        return "Hello! " + name.getName();
    }*/ // daca nu exista in BeanName - nu are ce sa returneze
}
