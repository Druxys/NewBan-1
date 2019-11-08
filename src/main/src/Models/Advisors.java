package Models;


import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.Array;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Advisors extends BaseModelORM {
    private Integer id;

    String tableName = "Advisors";
    private String name;
    private String firstName;
    private String email;
    private String password;
    private JSONObject roles;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Boolean is_enabled = true;


    public String getTableName() {
        return tableName;
    }

    public String getName() {
        return name;
    }

    public Advisors setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Advisors setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Advisors setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Advisors setPassword(String password) {
        this.password = password;
        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Advisors setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Advisors setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Advisors setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }

    public JSONObject getRoles() {
        return roles;
    }

    public Advisors setRoles(JSONObject roles) {
        this.roles = roles;
        return this;
    }
}
