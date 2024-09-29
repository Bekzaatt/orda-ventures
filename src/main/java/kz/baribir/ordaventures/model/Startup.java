package kz.baribir.ordaventures.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Startup")
public class Startup {
    @Transient
    public static final String SEQUENCE_NAME = "startup_sequence";
    
    @Id
    private String id;

    private String name;

    private String description;

    private String userId; // Связь с пользователем (стартапером)


}
