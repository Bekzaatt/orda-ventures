package kz.baribir.ordaventures.service.serviceImpl;

import kz.baribir.ordaventures.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class AuthServiceImpl implements AuthService {
    private final HashMap<String, String> authorithes = new HashMap<>();

    @Override
    public boolean login(String username, String password){
        for(Map.Entry<String, String> auth : authorithes.entrySet()){
            if(auth.getKey().equals(username) && auth.getValue().equals(password)){
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean register(String username, String password) {
        authorithes.put(username, password);
        return true;
    }
}
