package ch.noser.warenkorb.product;


import ch.noser.warenkorb.product.dto.ProductDTO;
import ch.noser.warenkorb.product.dto.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ProductMapper productMapper;

    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper){
        this.productService = productService;
        this.productMapper= productMapper;
    }


    @PostMapping({"", "/"})
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(productMapper.productMakeDTO(productService.create(productMapper.productGetDTO(productDTO))));
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        return ResponseEntity.ok(productMapper.productMakeAllDTO(productService.getAllProducts()));
    }

    @DeleteMapping({"/{id}"})
    public void deleteProductById(@PathVariable("id") UUID id){
        productService.deleteProductById(id);
    }

    @PostMapping({"/{id}"})
    public ResponseEntity<ProductDTO> updateProductById(@PathVariable("id") UUID id,  ProductDTO productDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(productMapper.productMakeDTO(productService.updateProductById(id, productMapper.productGetDTO(productDTO))));
    }
}
