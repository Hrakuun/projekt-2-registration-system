package hrakuun.ja.projekt2.service;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.repository.DatabaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserHandler {
    @Autowired
    UuidGenerator uuid;
    @Autowired
    PersonIdHandler personIdHandler;
    @Autowired
    DatabaseHandler database;

    public void createUser(User user){
        user.setUuid(uuid.generateUuid().toString());
        database.addUser(user);
    }


}
