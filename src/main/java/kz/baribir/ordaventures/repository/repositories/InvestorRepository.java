package kz.baribir.ordaventures.repository.repositories;

import kz.baribir.ordaventures.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, String> {
}
