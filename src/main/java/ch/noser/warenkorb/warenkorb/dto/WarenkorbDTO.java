package ch.noser.warenkorb.warenkorb.dto;


import ch.noser.warenkorb.product.dto.ProductDTO;

import java.util.List;
import java.util.UUID;

public class WarenkorbDTO {


    private UUID id;

    public static class WithProducts{
    private List<ProductDTO> products;


    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
