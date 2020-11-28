package myApp.spring.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TargetDIFactory {
    @Autowired
    Product product;//nu se creaza instanta de produs - apeleaza instanta ca sa o creeze
    /*se utilizeaza ca sa faci ceva prin factory*/
}
