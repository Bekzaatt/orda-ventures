package kz.baribir.ordaventures.controller;

import kz.baribir.ordaventures.model.User;
import kz.baribir.ordaventures.service.AuthService;
import kz.baribir.ordaventures.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthControllerApi {
    @Autowired
    private AuthService authService;

    @PostMapping ("/register")
    public boolean Register(@RequestBody User user){
        return authService.register(user.getUsername(), user.getPassword());

    }

    @GetMapping("/login")
    public boolean Login(@PathVariable("username") String username, @PathVariable("password") String password){
        return authService.login(username, password);
    }


}
