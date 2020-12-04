package myApp.controlers.jsons;

import lombok.Data;

import javax.persistence.*;

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
