package kz.baribir.ordaventures.service.serviceImpl;

import kz.baribir.ordaventures.model.Investor;
import kz.baribir.ordaventures.repository.repositories.InvestorRepository;
import kz.baribir.ordaventures.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InvestorServiceImpl implements InvestorService {
    @Autowired
    InvestorRepository investorRepository;
    @Override
    public Investor create(Investor investor) {
        return investorRepository.save(investor);

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
