package Models;


public class Advisor_Customer extends BaseModelORM {
    Integer id;

    String tableName = "advisor_customer";
    private Integer id_customer;
    private Integer id_advisor;


    public String getTableName() {
        return tableName;
    }

    public Integer getId_customer() {
        return id_customer;
    }

    public Advisor_Customer setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
        return this;
    }

    public Integer getId_advisor() {
        return id_advisor;
    }

    public Advisor_Customer setId_advisor(Integer id_advisor) {
        this.id_advisor = id_advisor;
        return this;
    }
}
