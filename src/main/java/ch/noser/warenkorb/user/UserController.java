package ch.noser.warenkorb.user;


import ch.noser.warenkorb.user.dto.UserDTO;
import ch.noser.warenkorb.user.dto.UserMapper;
import ch.noser.warenkorb.warenkorb.Warenkorb;
import ch.noser.warenkorb.warenkorb.WarenkorbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private UserMapper userMapper;
    private WarenkorbService warenkorbService;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper, WarenkorbService warenkorbService){
        this.userService = userService;
        this.userMapper= userMapper;
        this.warenkorbService = warenkorbService;
    }

    @PostMapping({"", "/"})
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO.WithPassword userDTO){
        warenkorbService.create(userDTO.)
        return ResponseEntity.status(HttpStatus.CREATED).body(userMapper.userMakeDTO(userService.create(userMapper.userGetPasswordDTO(userDTO))));
    }


    @DeleteMapping({"/{id}"})
    public void deleteUserById(@PathVariable("id") UUID id){
        userService.deleteUserById(id);
    }


    @PostMapping({"/{id}"})
    public ResponseEntity<UserDTO> updateUserById(@PathVariable("id") UUID id, @RequestBody UserDTO.WithPassword user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userMapper.userMakeDTO(userService.updateUserById(id, userMapper.userGetPasswordDTO(user))));
    }
}
