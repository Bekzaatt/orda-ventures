package kz.baribir.ordaventures.model;

import lombok.Data;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private Role role;

}
enum Role {
    STARTUPER,
    INVESTOR
}