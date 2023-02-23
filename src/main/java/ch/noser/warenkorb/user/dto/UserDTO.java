package ch.noser.warenkorb.user.dto;

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


        public static class WithCart extends  WithPassword{
        private WarenkorbDTO warenkorb;
        public WarenkorbDTO getWarenkorb() {
        return warenkorb;
    }
        public void setWarenkorb(WarenkorbDTO warenkorb) {
        this.warenkorb = warenkorb;
    }
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
