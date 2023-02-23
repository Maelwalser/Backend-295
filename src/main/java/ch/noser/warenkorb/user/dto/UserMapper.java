package ch.noser.warenkorb.user.dto;

import ch.noser.warenkorb.user.User;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {
    UserDTO userMakeDTO(User user);

    User userGetPasswordDTO(UserDTO.WithPassword user);
    User userGetDTO(UserDTO userDTO);

}
