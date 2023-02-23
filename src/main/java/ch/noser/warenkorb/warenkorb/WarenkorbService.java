package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.Product;
import ch.noser.warenkorb.product.dto.ProductDTO;
import ch.noser.warenkorb.user.User;
import ch.noser.warenkorb.user.dto.UserDTO;

import java.util.List;
import java.util.UUID;

public interface WarenkorbService {

    Warenkorb create(Warenkorb warenkorb);
    void deleteWarenkorbById(UUID id);

    List<Product> getAllProducts(User user);

}