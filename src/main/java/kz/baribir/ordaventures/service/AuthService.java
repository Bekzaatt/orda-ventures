package kz.baribir.ordaventures.service;

import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    boolean login(String username, String password);
    boolean register(String username, String password);

}
