package Models;

import java.sql.Timestamp;

public class Customer_product extends BaseModelORM{
    private Integer id;

    String tableName = "customer_product";
    private Integer id_customer;
    private Integer id_product;
    private Float mark;
    private Boolean is_enabled = true;
    private Boolean is_subscribed = false;
    private Timestamp contract_beg;
    private Timestamp contract_end;
    private String subscription;

    public String getTableName() {
        return tableName;
    }

    public Integer getId_customer() {
        return id_customer;
    }

    public Customer_product setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
        return this;
    }

    public Integer getId_product() {
        return id_product;
    }

    public Customer_product setId_product(Integer id_product) {
        this.id_product = id_product;
        return this;
    }

    public Float getMark() {
        return mark;
    }

    public Customer_product setMark(Float mark) {
        this.mark = mark;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Customer_product setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }

    public Boolean getIs_subscribed() {
        return is_subscribed;
    }

    public Customer_product setIs_subscribed(Boolean is_subscribed) {
        this.is_subscribed = is_subscribed;
        return this;
    }

    public Timestamp getContract_beg() {
        return contract_beg;
    }

    public Customer_product setContract_beg(Timestamp contract_beg) {
        this.contract_beg = contract_beg;
        return this;
    }

    public Timestamp getContract_end() {
        return contract_end;
    }

    public Customer_product setContract_end(Timestamp contract_end) {
        this.contract_end = contract_end;
        return this;
    }

    public String getSubscription() {
        return subscription;
    }

    public Customer_product setSubscription(String subscription) {
        this.subscription = subscription;
        return this;
    }
}
