package ch.noser.warenkorb.warenkorb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("warenkoerbe")
public class WarenkorbController {
    private WarenkorbService warenkorbService;

    @Autowired
    public WarenkorbController(WarenkorbService warenkorbService) {
        this.warenkorbService = warenkorbService;
    }

    @PostMapping({"","/"})
    public ResponseEntity<Warenkorb> create(@RequestBody Warenkorb warenkorb){
        return ResponseEntity.status(HttpStatus.CREATED).body(warenkorbService.create(warenkorb));
    }

    @DeleteMapping({"{id}"})
    public void deleteWarenkorbById(@PathVariable("id") int id){
        warenkorbService.deleteWarenkorbById(id);
    }
}
