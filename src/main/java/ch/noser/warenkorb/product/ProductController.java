package ch.noser.warenkorb.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ResourceBundle;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @PostMapping({"", "/"})
    public ResponseEntity<Product> create(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @DeleteMapping({"/{id}"})
    public void deleteProductById(@PathVariable("id") int id){
        productService.deleteProductById(id);
    }

    @PostMapping({"/{id}"})
    public ResponseEntity<Product> updateProductById(@PathVariable("id") int id, Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.updateProductById(id, product));
    }
}
