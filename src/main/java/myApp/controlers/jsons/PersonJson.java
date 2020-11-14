package myApp.controlers.jsons;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PersonJson {
    @Id
    private Integer cnp;
    private String name;
}
