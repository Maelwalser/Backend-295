package ch.noser.warenkorb.product;

import java.util.List;
import java.util.UUID;

public interface ProductService {


    Product create(Product product);
    List<Product> getAllProducts();
    void deleteProductById(UUID id);

    Product getProductById(UUID id);
    Product updateProductById(UUID id, Product product);
}
