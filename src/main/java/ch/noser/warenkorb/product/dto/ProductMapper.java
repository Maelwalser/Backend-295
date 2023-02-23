package ch.noser.warenkorb.product.dto;


import ch.noser.warenkorb.product.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface ProductMapper {
    ProductDTO productMakeDTO(Product product);
    Product productGetDTO(ProductDTO productDTO);

    List<ProductDTO> productMakeAllDTO(List<Product> products);



}
