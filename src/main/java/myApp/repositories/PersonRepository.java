package myApp.repositories;

import myApp.controlers.jsons.PersonJson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<PersonJson, Integer> {
    @Query("select t from PersonJson t where id = :id")
    PersonJson getIt(@Param("id") Integer id);
}
