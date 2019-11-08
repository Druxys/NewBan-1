package Models;

import org.json.JSONObject;

import java.sql.Timestamp;

public class Advisor extends BaseModelORM {
    private Integer id;

    String tableName = "advisor";
    private String name;
    private String firstName;
    private String email;
    private String password;
    private JSONObject roles;
    private Timestamp created_at = Timestamp.valueOf("now");
    private Timestamp updated_at;
    private Boolean is_enabled = true;


    public String getTableName() {
        return tableName;
    }

    public String getName() {
        return name;
    }

    public Advisor setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Advisor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Advisor setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Advisor setPassword(String password) {
        this.password = password;
        return this;
    }

    public JSONObject getRoles() {
        return roles;
    }

    public Advisor setRoles(JSONObject roles) {
        this.roles = roles;
        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Advisor setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Advisor setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Advisor setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }
}
