package kz.baribir.ordaventures.service.serviceImpl;

import kz.baribir.ordaventures.model.User;
import kz.baribir.ordaventures.repository.repositories.UserRepository;
import kz.baribir.ordaventures.service.AuthService;
import kz.baribir.ordaventures.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User get(String id) {
        Optional<User> optional = userRepository.findById(Long.parseLong(id));
        if(optional.isPresent()){
            return optional.get();
        }
        else return null;
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(Long.parseLong(id));
    }

}
