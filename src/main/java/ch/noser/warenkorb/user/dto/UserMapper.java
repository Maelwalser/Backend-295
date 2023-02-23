package ch.noser.warenkorb.user.dto;

import ch.noser.warenkorb.user.User;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {
    UserDTO userMakeDTO(User user);
    User userGetAllDTO(UserDTO.WithPassword.WithCart user);

    User userGetPasswordDTO(UserDTO.WithPassword user);

}
