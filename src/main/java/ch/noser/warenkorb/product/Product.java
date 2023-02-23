package ch.noser.warenkorb.product;


import ch.noser.warenkorb.warenkorb.Warenkorb;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name= "products")
public class Product {

    @Id
    @UuidGenerator
    private UUID id;
    @Column(name = "product_name")
    private String product_name;



    @ManyToMany(mappedBy = "products")
    private List<Warenkorb> warenkoerb;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public List<Warenkorb> getWarenkoerb() {
        return warenkoerb;
    }

    public void setWarenkoerb(List<Warenkorb> warenkoerb) {
        this.warenkoerb = warenkoerb;
    }





    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }


}
