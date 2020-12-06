package myApp.controlers;

import myApp.controlers.jsons.PersonJson;
import myApp.services.PersonService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest {

    @InjectMocks //ii spune lui mockito ca sa creeze o instanta de person controler
    // care sa aiba o referintacatre person service
    //si-l invoca singur
    PersonController targetObject;
//    {// nu ai nevoie de constructor pentru ca ai injectie pe campuri
//        controller = new PersonController(mock); // asta este versiunea manuala
//    }

    @Mock //am nevoie de acest personservice pe care il creezi tu
    PersonService mock;
//    PersonService service = Mockito.mock(PersonService.class); //creare mock manual
// surogat care se preface ca este un obiect in personservice
    // cate mock-uri ai le seteaza pe inject daca poate

    @Test
    public void testFindAll() {
        //1
        //creare context de testare
        //1.1
        //definim mock-urile + comportamentul acestora
        List<PersonJson> jsons = new ArrayList<>();
        PersonJson personJson = new PersonJson();
        jsons.add(personJson);
        //specific mock-ului sa faca ceva, nu sunt oblicat sa definesc comportament pentru tot
        //doar la ce ma intereseaza
        Mockito.when(mock.findAll()).thenReturn(jsons);
        //2
        //comportamentul mock-urilor
        ResponseEntity<List<PersonJson>> responseEntity = targetObject.findAll(null,null);
        //3
        Assertions.assertTrue(responseEntity.getBody().isEmpty());
    }
}
