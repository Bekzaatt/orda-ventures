package kz.baribir.ordaventures.service.serviceImpl;

import kz.baribir.ordaventures.model.DatabaseSequence;
import kz.baribir.ordaventures.model.Startup;
import kz.baribir.ordaventures.repository.mongo.StartupRepository;
import kz.baribir.ordaventures.service.StartupService;
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
public class StartupServiceImpl implements StartupService {
    @Autowired
    StartupRepository startupRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;
    @Override
    public Startup create(Startup startup) {
        Startup startupTemp = new Startup();
        startupTemp.setId(sequenceGeneratorService.generateSequence(Startup.SEQUENCE_NAME));
        startupTemp.setName(startup.getName());
        startupTemp.setDescription(startup.getDescription());
        startupTemp.setUserId(startup.getUserId());
        return startupRepository.save(startupTemp);
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
    public void deleteStartup(Long id) { // URL-da String-pen beru kk
        startupRepository.deleteById(id.toString());
    }

//    public String generateSequence(String seqName) {
//        DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
//                new Update().inc("seq",1), options().returnNew(true).upsert(true),
//                DatabaseSequence.class);
//        return String.valueOf(!Objects.isNull(counter) ? counter.getSeq() : 1);
//    }
}
