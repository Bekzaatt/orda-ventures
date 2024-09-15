package kz.baribir.ordaventures.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

    enum Role {
        STARTUPER,
        INVESTOR
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private Role role;

}
