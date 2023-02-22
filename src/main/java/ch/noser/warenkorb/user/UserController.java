package ch.noser.warenkorb.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping({"", "/"})
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }


    @DeleteMapping({"/{id}"})
    public void deleteUserById(@PathVariable("id") int id){
        userService.deleteUserById(id);
    }


    @PostMapping({"{id}"})
    public ResponseEntity<User> updateUserById(@PathVariable("id") int id, @RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUserById(id, user));
    }
}
