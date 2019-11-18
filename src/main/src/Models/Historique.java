package Models;


import java.sql.Timestamp;

public class Historique extends BaseModelORM{

    private Integer id;

    String tableName = "Historique";
    private Integer id_customer;
    private Integer id_product;
    private Float note_calculéé;
    private Timestamp created_at = Timestamp.valueOf("now");
    private Timestamp updated_at;
    private Boolean is_enabled = true;


    public String getTableName() {
        return tableName;
    }

    public Integer getId_customer() {
        return id_customer;
    }

    public Historique setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
        return this;
    }

    public Integer getId_product() {
        return id_product;
    }

    public Historique setId_product(Integer id_product) {
        this.id_product = id_product;
        return this;
    }

    public Float getNote_calculéé() {
        return note_calculéé;
    }

    public Historique setNote_calculéé(Float note_calculéé) {
        this.note_calculéé = note_calculéé;
        return this;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Historique setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Historique setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Historique setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }
}
