package ch.noser.warenkorb.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProductById(UUID id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()) {
            productRepository.deleteById(id);
        }
        throw new NoSuchElementException("Product not found");
    }

    @Override
    public Product getProductById(UUID id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
        return optionalProduct.get();
        }
        throw new NoSuchElementException("Product not found");
    }

    @Override
    public Product updateProductById(UUID id, Product product) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            product.setId(optionalProduct.get().getId());
            return productRepository.save(product);
        }
        throw new NoSuchElementException("Product not found");
    }


}
