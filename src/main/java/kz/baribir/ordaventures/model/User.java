package kz.baribir.ordaventures.model;

public class User {

    enum Role {
        STARTUPER,
        INVESTOR
    }

    private Long id;
    private String username;
    private String password;
    private Role role;

}
