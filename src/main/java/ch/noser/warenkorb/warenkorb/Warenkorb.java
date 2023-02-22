package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.products.Product;
import ch.noser.warenkorb.user.User;
import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@Entity
@Table(name = "warenkoerbe")
public class Warenkorb {

    @Id
    @GeneratedValue
    private int id;



    @OneToOne(mappedBy = "warenkorb")
    private User user;


    @OneToMany(mappedBy = "warenkorb")
    private List<Product> products;

}
