package hrakuun.ja.projekt2.repository;

import hrakuun.ja.projekt2.model.User;
import hrakuun.ja.projekt2.service.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class DatabaseHandler {
    @Autowired
    JdbcTemplate database;

    public void addUser(User user){
        database.update("INSERT INTO users (name,surname,personId,uuid) VALUES(?,?,?,?)",user.getName(),user.getSurname(),user.getPersonId(),user.getUuid());
    }

    public Boolean isPersonIdTaken(String personId) {
        String sql = "SELECT COUNT(*) FROM users WHERE personId = '"+personId+"'";
        return database.queryForObject(sql, Boolean.class);
    }

    public User getUserById(String id){
        String sql = "SELECT * FROM users WHERE personId = ?";
        return database.queryForObject(sql,new UserRowMapper(), id);
    }
    public List<User> getUsersAsList(){
        String sql = "SELECT * FROM users";
        List<User> usersAsList = database.query(sql,new UserRowMapper());
        return usersAsList;
    }

    public void updateUser(User user) {
        database.update("UPDATE users SET name = ?, surname = ? where id = ?", user.getName(),user.getSurname(),user.getId());
    }
}