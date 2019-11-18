package Models;

import org.json.JSONObject;

import java.sql.Date;
import java.sql.Timestamp;

public class Customers extends BaseModelORM {
    private Integer id;

    String tableName = "Customers";
    private String name;
    private String firstName;
    private String email;
    private Integer phone;
    private Float debt;
    private String family_situation;
    private String professional_situation;
    private Integer income;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Date birthdate;
    private Boolean is_customer = false;
    private Boolean existing_contract = false;
    private String contract_type;
    private Integer id_advisor;



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

    public String getFamily_situation() {
        return family_situation;
    }

    public Customers setFamily_situation(String family_situation) {
        this.family_situation = family_situation;
        return this;
    }

    public String getProfessional_situation() {
        return professional_situation;
    }

    public Customers setProfessional_situation(String professional_situation) {
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

    public Date getBirthdate() {
        return birthdate;
    }

    public Customers setBirthdate(Date birthdate) {
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

    public String getContract_type() {
        return contract_type;
    }

    public Customers setContract_type(String contract_type) {
        this.contract_type = contract_type;
        return this;
    }

    public Integer getId_advisor() {
        return id_advisor;
    }

    public Customers setId_advisor(Integer id_advisor) {
        this.id_advisor = id_advisor;
        return this;
    }
}
