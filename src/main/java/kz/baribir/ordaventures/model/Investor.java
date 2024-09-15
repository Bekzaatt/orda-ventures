package kz.baribir.ordaventures.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
//@Entity

public class Investor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;

    private String name;

    private String userId; // Связь с пользователем
}
