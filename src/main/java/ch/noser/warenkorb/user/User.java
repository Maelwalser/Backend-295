package ch.noser.warenkorb.user;


import ch.noser.warenkorb.warenkorb.Warenkorb;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;


    @Column(name = "username")
    private String username;


    @Column(name = "password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @RestResource(path = "userWarenkorb", rel = "warenkorb")
    private Warenkorb warenkorb;



    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
