package kz.baribir.ordaventures.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Investor")
public class Investor {
    @Transient
    public static final String SEQUENCE_NAME = "investor_sequence";

    @Id
    private String id;

    private String name;

    private String userId; // Связь с пользователем
}
