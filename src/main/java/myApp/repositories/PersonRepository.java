package myApp.repositories;

import myApp.controlers.jsons.PersonJson;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PersonRepository extends JpaRepository<PersonJson, Integer> {

}
