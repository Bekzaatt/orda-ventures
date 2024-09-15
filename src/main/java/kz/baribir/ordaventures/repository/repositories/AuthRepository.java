package kz.baribir.ordaventures.repository.repositories;

import kz.baribir.ordaventures.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<User, Long> {
}
