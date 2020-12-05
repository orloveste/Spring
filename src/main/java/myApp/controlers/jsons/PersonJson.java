package myApp.controlers.jsons;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persoana")
@NamedQuery(name = "xxx", query = "select name from PersonJson")
public class PersonJson {
    @Id
    @Column(name = "cnp")
    private Integer cnp;

    @Column(name = "name")
    private String name;
    //put data in  postman and ask id 10
    //use bean validation

}
