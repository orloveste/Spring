package myApp.controlers;

import myApp.controlers.jsons.PersonJson;
import myApp.services.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest {

    //@InjectMocks //ii spune lui mockito ca sa creeze o instanta de person controler
    // care sa aiba o referintacatre person service
    //si-l invoca singur
    PersonController controller;
//    {// nu ai nevoie de constructor pentru ca ai injectie pe campuri
//        controller = new PersonController(mock); // asta este versiunea manuala
//    }

    //@Mock //am nevoie de acest personservice pe care il creezi tu
    PersonService service;
//    PersonService service = Mockito.mock(PersonService.class); //creare mock manual
// surogat care se preface ca este un obiect in personservice
    // cate mock-uri ai le seteaza pe inject daca poate

    @Test
    public void testFindAll() {
        //1
        //2
        ResponseEntity<List<PersonJson>> responseEntity = controller.findAll(null,null);
        //3
    }
}
