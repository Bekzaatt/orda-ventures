package kz.baribir.ordaventures.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Investor {
    private Long id;

    private String name;

    private String userId; // Связь с пользователем
}
