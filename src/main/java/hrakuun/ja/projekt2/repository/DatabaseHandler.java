package hrakuun.ja.projekt2.repository;

import hrakuun.ja.projekt2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseHandler {
    @Autowired
    JdbcTemplate database;

    public void addUser(User user){
        database.update("INSERT INTO USERS VALUES(?,?,?,?)",user.getPersonId(),user.getName(),user.getSurname(),user.getUuid());
    }

    public Boolean isPersonIdTaken(String personId) {
        String sql = "SELECT COUNT(*) FROM users WHERE personId = '"+personId+"'";
        return database.queryForObject(sql, Boolean.class);
    }

}
