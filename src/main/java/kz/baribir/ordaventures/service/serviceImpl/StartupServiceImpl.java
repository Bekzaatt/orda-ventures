package kz.baribir.ordaventures.service.serviceImpl;

import kz.baribir.ordaventures.model.Startup;
import kz.baribir.ordaventures.repository.repositories.StartupRepository;
import kz.baribir.ordaventures.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StartupServiceImpl implements StartupService {
    @Autowired
    private StartupRepository startupRepository;
    @Override
    public Startup create(Startup startup) {
        startupRepository.save(startup);
        return startup;
    }

    @Override
    public Startup getStartupByUserId(Long id) {
        Optional<Startup> optional = startupRepository.findById(id.toString());
        if(optional.isPresent()){
            return optional.get();
        }
        else return null;
    }

    @Override
    public List<Startup> getAllStartups() {
        return startupRepository.findAll();
    }

    @Override
    public Startup update(Startup updatedStartup) { // Id ozgermeidy dep karadyk
        return startupRepository.save(updatedStartup);
    }

    @Override
    public void deleteStartup(String id) { // URL-da String-pen beru kk
        startupRepository.deleteById(id);
    }
}
