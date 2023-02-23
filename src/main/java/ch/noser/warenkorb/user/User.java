package ch.noser.warenkorb.user;


import ch.noser.warenkorb.warenkorb.Warenkorb;
import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "username")
    private String username;


    @Column(name = "password")
    private String password;



    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Warenkorb warenkorb;



    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
