package ch.noser.warenkorb.user.dto;

import ch.noser.warenkorb.warenkorb.Warenkorb;
import ch.noser.warenkorb.warenkorb.dto.WarenkorbDTO;

import java.util.UUID;

public class UserDTO {
    private UUID id;

    private String username;

    public static class WithPassword extends UserDTO{
        private String password;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
