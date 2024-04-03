package hrakuun.ja.projekt2.controller;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.service.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    UserHandler userHandler;
    @PostMapping("user")
    public ResponseEntity<HttpStatus> createUser(@RequestBody User user) {
        return userHandler.createUser(user);
    }


}
