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

//    @OneToOne
//    @JoinColumn(name = "warenkorb_id")
//    @RestResource(path = "userWarenkorb", rel = "warenkorb")
//    private Warenkorb warenkorb;

    @OneToOne(mappedBy = "user")
    private Warenkorb warenkorb;



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
