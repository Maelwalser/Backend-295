package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.user.User;
import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "warenkoerbe")
public class Warenkorb {

    @Id
    @GeneratedValue
    private int id;



    @OneToOne
    @JoinColumn(name = "user_id")
    @RestResource(path = "warenkorbUser", rel = "user")
    private User user;
}
