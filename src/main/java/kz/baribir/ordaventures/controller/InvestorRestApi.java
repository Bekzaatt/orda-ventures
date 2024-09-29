package kz.baribir.ordaventures.controller;

import kz.baribir.ordaventures.model.Investor;
import kz.baribir.ordaventures.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InvestorRestApi {

    InvestorService investorService;

    @Autowired
    public InvestorRestApi(InvestorService investorService) {
        this.investorService = investorService;
    }

    @GetMapping("/investors")
    public List<Investor> getAllInvestors(){
        return investorService.getAllInvestors();
    }

    @GetMapping("/investors/{id}")
    public Investor getInvestorById(@PathVariable long id){
        return investorService.getInvestorByUserId(id);
    }

    @PostMapping("/investors")
    public Investor createInvestor(@RequestBody Investor investor){
        return investorService.create(investor);
    }

    @PutMapping("/investors")
    public Investor updateInvestor(@RequestBody Investor updatedInvestor){
        return investorService.update(updatedInvestor);
    }

    @DeleteMapping("/investors/{id}")
    public void deleteInvestor(@PathVariable Long id){
        investorService.delete(id);
    }




}
