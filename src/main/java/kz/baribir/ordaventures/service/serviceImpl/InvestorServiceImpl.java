package kz.baribir.ordaventures.service.serviceImpl;

import kz.baribir.ordaventures.model.DatabaseSequence;
import kz.baribir.ordaventures.model.Investor;
import kz.baribir.ordaventures.repository.mongo.InvestorRepository;
import kz.baribir.ordaventures.repository.postgre.UserRepository;
import kz.baribir.ordaventures.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class InvestorServiceImpl implements InvestorService {
    @Autowired
    private InvestorRepository investorRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    SequenceGeneratorService sequenceGeneratorService;
    @Override
    public Investor create(Investor investor) {


        Investor investorTemp = new Investor();
        investorTemp.setId(sequenceGeneratorService.generateSequence(Investor.SEQUENCE_NAME));
        investorTemp.setName(investor.getName());
        investorTemp.setUserId(investor.getUserId());

        return investorRepository.save(investorTemp);
    }

    @Override
    public Investor getInvestorByUserId(Long id) {
        Optional<Investor> optional = investorRepository.findById(id.toString());
        if(optional.isPresent()){
            return optional.get();
        }else return null;

    }

    @Override
    public List<Investor> getAllInvestors() {

        return investorRepository.findAll();

    }

    @Override
    public Investor update(Investor updatedInvestor) {
        return investorRepository.save(updatedInvestor);
    }

    @Override
    public void delete(Long id) {
        investorRepository.deleteById(id.toString());
    }

}
