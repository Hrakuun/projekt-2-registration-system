package hrakuun.ja.projekt2.service;

import hrakuun.ja.projekt2.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id = rs.getString("id");
        String personId = rs.getString("personId");
        String name = rs.getString("name");
        String surname = rs.getString("surname");
        String uuid = rs.getString("uuid");
        return new User(id, name, surname, personId, uuid);
    }
}
