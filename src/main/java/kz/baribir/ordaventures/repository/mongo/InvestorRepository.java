package kz.baribir.ordaventures.repository.mongo;

import kz.baribir.ordaventures.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends MongoRepository<Investor, String> {
}
