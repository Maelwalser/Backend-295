package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.product.dto.ProductDTO;
import ch.noser.warenkorb.product.dto.ProductMapper;
import ch.noser.warenkorb.user.dto.UserDTO;
import ch.noser.warenkorb.user.dto.UserMapper;
import ch.noser.warenkorb.warenkorb.dto.WarenkorbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("warenkoerbe")
public class WarenkorbController {
    private WarenkorbService warenkorbService;
    private UserMapper userMapper;
    private ProductMapper productMapper;

    @Autowired
    public WarenkorbController(WarenkorbService warenkorbService, UserMapper userMapper, ProductMapper productMapper) {
        this.warenkorbService = warenkorbService;
        this.userMapper = userMapper;
        this.productMapper = productMapper;
    }

    @PostMapping({"","/"})
    public ResponseEntity<Warenkorb> create(@RequestBody Warenkorb warenkorb){
        return ResponseEntity.status(HttpStatus.CREATED).body(warenkorbService.create(warenkorb));
    }

    @DeleteMapping({"{id}"})
    public void deleteWarenkorbById(@PathVariable("id") UUID id){
        warenkorbService.deleteWarenkorbById(id);
    }


    @GetMapping({"/all"})
    public ResponseEntity<List<ProductDTO>> getAllProducts(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(productMapper.productMakeAllDTO(warenkorbService.getAllProducts(userMapper.userGetDTO(userDTO))));
    }

}

