package kz.baribir.ordaventures.controller;


import kz.baribir.ordaventures.model.User;
import kz.baribir.ordaventures.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestApi {
    UserService userService;

    @Autowired
    public UserRestApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.get(id);
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.delete(id);
    }

}
