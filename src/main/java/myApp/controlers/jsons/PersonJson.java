package myApp.controlers.jsons;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "persoana")
public class PersonJson {
    @Id
    @Column(name = "cnp")
    private Integer cnp;

    @Column(name = "name")
    private String name;

}
