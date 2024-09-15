package kz.baribir.ordaventures.service;

import kz.baribir.ordaventures.model.User;

public interface UserService {

    void save(User user);
    User get(Long id);
    void delete(Long id);
}
