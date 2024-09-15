package kz.baribir.ordaventures.controller;

import kz.baribir.ordaventures.model.Startup;
import kz.baribir.ordaventures.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StartupRestApi {
    @Autowired
    StartupService startupService;

    @GetMapping("/startups")
    public List<Startup> getAllStartups(){
        return startupService.getAllStartups();
    }

    @GetMapping("/startups/{id}")
    public Startup getStartupById(@PathVariable("id") Long id){

        return startupService.getStartupByUserId(id);
    }

    @PostMapping("/startups")
    public void createStartup(@RequestBody Startup startup){
        startupService.create(startup);
    }

    @PutMapping("/startups")
    public void updateStartup(@RequestBody Startup updatedStartup){
        startupService.update(updatedStartup);
    }

    @DeleteMapping("/startups/{id}")
    public void deleteStartup(@PathVariable String id){

        startupService.deleteStartup(id);
    }

}
