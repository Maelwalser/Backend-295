package ch.noser.warenkorb.products;


import ch.noser.warenkorb.warenkorb.Warenkorb;
import jakarta.persistence.*;

@Entity
@Table(name= "products")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "product_name")
    private String product_name;



    @ManyToOne
    @JoinColumn(name = "warenkorb_id")
    private Warenkorb warenkorb;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }


}
