package hrakuun.ja.projekt2.controller;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.service.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    UserHandler userHandler;
    @PostMapping("user")
    public void createUser(@RequestBody User user) {
        userHandler.createUser(user);
    }

}
