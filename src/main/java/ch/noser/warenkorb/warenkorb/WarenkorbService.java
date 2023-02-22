package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.Product;

public interface WarenkorbService {

    Warenkorb create(Warenkorb warenkorb);
    void deleteWarenkorbById(int id);


//    Product getAllProducts();
}