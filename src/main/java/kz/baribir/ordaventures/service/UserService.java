package kz.baribir.ordaventures.service;

import kz.baribir.ordaventures.model.User;

public interface UserService {

    void save(User user);
    User get(String id);
    void delete(String id);
}
