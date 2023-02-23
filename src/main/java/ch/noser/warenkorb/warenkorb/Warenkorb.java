package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.Product;
import ch.noser.warenkorb.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "warenkoerbe")
public class Warenkorb {


    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;



    @OneToOne(mappedBy = "warenkorb", cascade = CascadeType.ALL)
    private User user;


    @ManyToMany
    @JoinTable(
            name = "warenkorb_products",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "warenkorb_id"))
    List<Product> products;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
