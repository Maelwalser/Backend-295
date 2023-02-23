package ch.noser.warenkorb.product;


import ch.noser.warenkorb.warenkorb.Warenkorb;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name= "products")
public class Product {

    @Id
    @UuidGenerator
    private UUID id;
    @Column(name = "product_name")
    private String product_name;



    @ManyToOne
    @JoinColumn(name = "warenkorb_id")
    private Warenkorb warenkorb;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }





    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }


}
