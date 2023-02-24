package ch.noser.warenkorb.product.dto;


import java.util.UUID;

public class ProductDTO {

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    private UUID id;
    private String product_name;

}
