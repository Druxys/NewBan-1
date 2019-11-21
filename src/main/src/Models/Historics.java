package Models;

import java.sql.Timestamp;

public class Historics extends BaseModelORM{

    private Integer id;

    String tableName = "historics";
    private Integer id_customer_product;
    private String resume;
    private String type_contact;
    private Timestamp created_at = Timestamp.valueOf("now");
    private Timestamp updated_at;
    private Boolean is_enabled = true;
    private String contact_taken;

    public String getTableName() {
        return tableName;
    }

    public Integer getId_customer_product() {
        return id_customer_product;
    }

    public Historics setId_customer_product(Integer id_customer_product) {
        this.id_customer_product = id_customer_product;
        return this;
    }

    public String getResume() {return resume;}

    public Historics setResume(String resume) {
        this.resume = resume;
        return this;
    }

    public String getType_contact() {
        return type_contact;
    }

    public Historics setType_contact(String type_contact) {
        this.type_contact = type_contact;
        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Historics setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Historics setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Historics setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }

    public String getContact_taken() {
        return contact_taken;
    }

    public void setContact_taken(String contact_taken) {
        this.contact_taken = contact_taken;
    }
}