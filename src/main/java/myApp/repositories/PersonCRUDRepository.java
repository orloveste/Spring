package myApp.repositories;

import myApp.controlers.jsons.PersonJson;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class PersonCRUDRepository extends SimpleJpaRepository<PersonJson, Integer> {
    EntityManager em;
    public PersonCRUDRepository(EntityManager em) {
        super(PersonJson.class, em);
        this.em=em;
    }
    List f() {
        return em.createNamedQuery("xxx").getResultList();
    }

}
//spring boot data get hibernate session