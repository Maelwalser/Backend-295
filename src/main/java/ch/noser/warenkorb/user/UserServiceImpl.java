package ch.noser.warenkorb.user;

import ch.noser.warenkorb.product.Product;
import ch.noser.warenkorb.warenkorb.Warenkorb;
import ch.noser.warenkorb.warenkorb.WarenkorbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void deleteUserById(int id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
        userRepository.deleteById(id);
        }
        throw new NoSuchElementException("User doesnt exist");
    }

    @Override
    public User updateUserById(int id, User user) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()) {
            user.setId(optionalUser.get().getId());
            return userRepository.save(user);
        }
        throw new NoSuchElementException("User doesnt exist");
    }


}
