package Models;


import java.sql.Date;
import java.sql.Timestamp;

public class Customers extends BaseModelORM {
    private Integer id;

    String tableName = "customers";
    private String lastname;
    private String firstname;
    private String mail;
    private Integer phone;
    private Float debt;
    private String familly_situation;
    private String professionnal_situation;
    private Integer income;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Date birthdate;
    private Boolean is_customer = false;
    private Boolean existing_contract = false;
    private String professionnal_contract_type;


    public String getTableName() {
        return tableName;
    }

    public String getLastName() {
        return lastname;
    }

    public Customers setLastName(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getFirstName() {
        return firstname;
    }

    public Customers setFirstName(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public Customers setMail(String mail) {
        this.mail = mail;
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

    public String getFamilly_situation() {
        return familly_situation;
    }

    public Customers setFamilly_situation(String familly_situation) {
        this.familly_situation = familly_situation;
        return this;
    }

    public String getProfessionnal_situation() {
        return professionnal_situation;
    }

    public Customers setProfessionnal_situation(String professionnal_situation) {
        this.professionnal_situation = professionnal_situation;
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

    public String getProfessionnal_contract_type() {
        return professionnal_contract_type;
    }

    public Customers setProfessionnal_contract_type(String professionnal_contract_type) {
        this.professionnal_contract_type = professionnal_contract_type;
        return this;
    }

}
