package kz.baribir.ordaventures.model;

import lombok.Data;

@Data
public class Startup {

    private String id;
    private String name;
    private String description;
    private String userId; // Связь с пользователем (стартапером)
}
