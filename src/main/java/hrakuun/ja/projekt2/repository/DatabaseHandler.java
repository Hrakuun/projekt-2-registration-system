package hrakuun.ja.projekt2.repository;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.service.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

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

    public User getUserById(String id){
        String sql = "SELECT * FROM users WHERE personId = ?";
        return database.queryForObject(sql,new UserRowMapper(), id);

    }

}
