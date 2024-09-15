package kz.baribir.ordaventures.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
public class Startup {

    private Long id;

    private String name;

    private String description;

    private String userId; // Связь с пользователем (стартапером)


}
