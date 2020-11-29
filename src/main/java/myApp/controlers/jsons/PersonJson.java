package myApp.controlers.jsons;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persoana")
@NamedQueries(name = "xxx", query = "select t from PersonJson t")
public class PersonJson {
    @Id
    @Column(name = "cnp")
    private Integer cnp;

    @Column(name = "name")
    private String name;

}
