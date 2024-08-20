package kz.baribir.ordaventures.model;

import lombok.Data;

@Data
public class Investor {

    private String id;
    private String name;
    private String userId; // Связь с пользователем

}
