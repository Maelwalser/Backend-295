package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.Product;
import ch.noser.warenkorb.user.User;
import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@Entity
@Table(name = "warenkoerbe")
public class Warenkorb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @RestResource(path = "warenkorbUser", rel = "user")
    private User user;


//    @OneToOne(mappedBy = "warenkorb", cascade = CascadeType.ALL)
//    private User user;


    @OneToMany(mappedBy = "warenkorb")
    private List<Product> products;

}
