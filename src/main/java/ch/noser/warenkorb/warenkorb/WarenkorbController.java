package ch.noser.warenkorb.warenkorb;

import ch.noser.warenkorb.products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("warenkoerbe")
public class WarenkorbController {
    private WarenkorbService warenkorbService;

    @Autowired
    public WarenkorbController(WarenkorbService warenkorbService){
        this.warenkorbService = warenkorbService;
    }
}
