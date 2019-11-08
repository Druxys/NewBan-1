package Models;


public class Advisors extends BaseModelORM {
    private Integer id;

    String tableName = "Advisors";
    private String name;
    private String firstName;
    private String email;
    private String password;


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

}
