package hrakuun.ja.projekt2.service;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.repository.DatabaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserHandler {
    @Autowired
    UuidGenerator uuid;
    @Autowired
    PersonIdHandler personIdHandler;
    @Autowired
    DatabaseHandler database;

    public ResponseEntity<HttpStatus> createUser(User user) {
        if (personIdHandler.isPersonIdTaken(user.getPersonId())) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else if (!personIdHandler.isPersonIdValid(user.getPersonId())) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        } else {
            user.setUuid(uuid.generateUuid().toString());
            database.addUser(user);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    public User getUserById(String id, boolean withDetails) {
        User userById = database.getUserById(id);
        if (withDetails) {
            return userById;
        } else {
            return new User(userById.getId(), userById.getName(), userById.getSurname());
        }
    }

    public List<User> getUsers(boolean withDetails) {
        List<User> usersAsList = database.getUsersAsList();
        if (!withDetails) {
            for (User user : usersAsList) {
                user.setPersonId(null);
                user.setUuid(null);
            }
        }
        return usersAsList;
    }

    public void updateUser(User user) {
        database.updateUser(user);
    }

    public ResponseEntity<HttpStatus> deleteUser(String id) {
        database.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
}
