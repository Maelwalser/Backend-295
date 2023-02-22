package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.Product;

public class WarenkorbDAO {
    private Integer id;
    private Integer userId;
    private Product product;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
