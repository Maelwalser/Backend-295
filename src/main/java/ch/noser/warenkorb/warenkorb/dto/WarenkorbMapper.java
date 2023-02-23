package ch.noser.warenkorb.warenkorb.dto;

import ch.noser.warenkorb.warenkorb.Warenkorb;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface WarenkorbMapper {
    WarenkorbDTO warenkorbMakeDTO(Warenkorb warenkorb);
    Warenkorb warenkorbGetDTO(WarenkorbDTO warenkorbDTO);
}
