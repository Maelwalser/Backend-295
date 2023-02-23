package ch.noser.warenkorb.user;

import ch.noser.warenkorb.warenkorb.Warenkorb;

import java.util.UUID;

public interface UserService {

    User create(User user);
    void deleteUserById(UUID id);
    User updateUserById(UUID id, User user);

}
