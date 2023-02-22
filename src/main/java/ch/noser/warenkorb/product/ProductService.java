package ch.noser.warenkorb.product;

import java.util.List;

public interface ProductService {


    Product create(Product product);
    List<Product> getAllProducts();
    void deleteProductById(int id);

    Product getProductById(int id);
    Product updateProductById(int id, Product product);
}
