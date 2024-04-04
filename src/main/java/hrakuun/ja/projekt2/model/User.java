package hrakuun.ja.projekt2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private String id;
    @NotBlank(message = "Name is not valid")
    private String name;
    private String surname;
    @Size(min = 12, max = 12,message = "personID must be 12 characters")
    private String personId;
    private String uuid;

    public User() {
    }

    public User(String id, String name, String surname, String personId, String uuid) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personId = personId;
        this.uuid = uuid;
    }

    public User(String id, String name, String surname) {
        this(id, name, surname, null, null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
