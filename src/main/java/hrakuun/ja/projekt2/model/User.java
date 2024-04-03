package hrakuun.ja.projekt2.model;

import jakarta.validation.constraints.Size;

public class User {

    private String name;
    private String surname;
    @Size(min = 12, max = 12)
    private String personID;
    private String uuid;

    public User(String name, String surname, String personID, String uuid) {
        this.name = name;
        this.surname = surname;
        this.personID = personID;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
