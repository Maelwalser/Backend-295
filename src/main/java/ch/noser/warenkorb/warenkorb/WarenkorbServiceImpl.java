package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.Product;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class WarenkorbServiceImpl implements WarenkorbService{
    private WarenkorbRepository warenkorbRepository;

    @Override
    public Warenkorb create(Warenkorb warenkorb) {
        return warenkorbRepository.save(warenkorb);
    }

    @Override
    public void deleteWarenkorbById(int id) {
        Optional<Warenkorb> warenkorbOptional = warenkorbRepository.findById(id);
        if(warenkorbOptional.isPresent()){
        warenkorbRepository.deleteById(id);
        }
        throw new NoSuchElementException("Warenkorb doesnt exist");

    }

//    @Override
//    public Product getAllProducts() {
//
//    }
}
