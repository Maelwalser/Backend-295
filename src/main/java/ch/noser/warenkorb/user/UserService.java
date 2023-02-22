package ch.noser.warenkorb.user;

import ch.noser.warenkorb.warenkorb.Warenkorb;

public interface UserService {

    User create(User user);
    void deleteUserById(int id);
    User updateUserById(int id, User user);

}
