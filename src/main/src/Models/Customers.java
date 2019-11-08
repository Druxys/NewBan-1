package Models;

import org.json.JSONObject;

import java.sql.Timestamp;

public class Customers extends BaseModelORM {
    private Integer id;

    String tableName = "Customers";
    private String name;
    private String firstName;
    private String email;
    private Integer phone;
    private Float debt;
    private JSONObject family_situation;
    private JSONObject professional_situation;
    private Integer income;
    private Timestamp created_at = Timestamp.valueOf("now");
    private Timestamp updated_at;
    private Timestamp birthdate;
    private Boolean is_customer = false;
    private Boolean existing_contract = false;
    private JSONObject contract_type;



    public String getTableName() {
        return tableName;
    }

    public String getName() {
        return name;
    }

    public Customers setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customers setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customers setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getPhone() {
        return phone;
    }

    public Customers setPhone(Integer phone) {
        this.phone = phone;
        return this;
    }

    public Float getDebt() {
        return debt;
    }

    public Customers setDebt(Float debt) {
        this.debt = debt;
        return this;
    }

    public JSONObject getFamily_situation() {
        return family_situation;
    }

    public Customers setFamily_situation(JSONObject family_situation) {
        this.family_situation = family_situation;
        return this;
    }

    public JSONObject getProfessional_situation() {
        return professional_situation;
    }

    public Customers setProfessional_situation(JSONObject professional_situation) {
        this.professional_situation = professional_situation;
        return this;
    }

    public Integer getIncome() {
        return income;
    }

    public Customers setIncome(Integer income) {
        this.income = income;
        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Customers setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Customers setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Timestamp getBirthdate() {
        return birthdate;
    }

    public Customers setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public Boolean getIs_customer() {
        return is_customer;
    }

    public Customers setIs_customer(Boolean is_customer) {
        this.is_customer = is_customer;
        return this;
    }

    public Boolean getExisting_contract() {
        return existing_contract;
    }

    public Customers setExisting_contract(Boolean existing_contract) {
        this.existing_contract = existing_contract;
        return this;
    }

    public JSONObject getContract_type() {
        return contract_type;
    }

    public Customers setContract_type(JSONObject contract_type) {
        this.contract_type = contract_type;
        return this;
    }
}
