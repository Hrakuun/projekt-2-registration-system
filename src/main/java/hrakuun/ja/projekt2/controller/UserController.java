package hrakuun.ja.projekt2.controller;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.service.UserHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    UserHandler userHandler;

    @PostMapping("user")
    public ResponseEntity<HttpStatus> createUser(@Valid @RequestBody User user) {
        return userHandler.createUser(user);
    }

    @GetMapping("user/{id}")
    public User getUserById(
            @PathVariable(value = "id") String id,
            @RequestParam(name = "detail", required = false, defaultValue = "false") boolean detail
    ) {
        return userHandler.getUserById(id, detail);
    }

    @GetMapping("users")
    public List<User> getUsers(
            @RequestParam(name = "detail", required = false, defaultValue = "false") boolean detail
    ) {
        return userHandler.getUsers(detail);
    }

    @PutMapping("user")
    public void updateUser(@Valid @RequestBody User user) {
        userHandler.updateUser(user);
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable(value = "id") String id) {
        return userHandler.deleteUser(id);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleException(Exception e) {
        return e.getMessage();
    }


}
