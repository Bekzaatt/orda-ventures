package kz.baribir.ordaventures.service;

import kz.baribir.ordaventures.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);
    User get(Long id);
    void delete(Long id);
}
