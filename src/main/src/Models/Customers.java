package Models;

import java.sql.Date;
import java.sql.Timestamp;

public class Customers extends BaseModelORM {
    Integer id;

    String tableName = "customers";
    private String lastName;
    private String firstName;
    private String mail;
    private Integer phone;
    private Float debt;
    private Integer income;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Date birthdate;
    private Boolean is_customer;
    private Boolean existing_contract;
    private String familly_situation;
    private String professionnal_situation;
    private String contract_type;


    public String getTableName() {
        return tableName;
    }

    public String getLastName() {
        return lastName;
    }

    public Customers setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customers setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getContract_type() {
        return contract_type;
    }

    public Customers setContract_type(String contract_type) {
        this.contract_type = contract_type;
        return this;
    }
}
