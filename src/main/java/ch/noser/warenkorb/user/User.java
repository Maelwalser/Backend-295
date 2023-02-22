package ch.noser.warenkorb.user;


import ch.noser.warenkorb.products.Product;
import ch.noser.warenkorb.warenkorb.Warenkorb;
import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "firstname")
    private String firstname;


    @Column(name = "lastname")
    private String lastname;

    @OneToOne
    @JoinColumn(name = "warenkorb_id")
    @RestResource(path = "userWarenkorb", rel = "warenkorb")
    private Warenkorb warenkorb;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



}
