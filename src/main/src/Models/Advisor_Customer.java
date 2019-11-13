package Models;

public class Advisor_Customer extends BaseModelORM{

    private Integer id;
    private Integer id_advisor;
    private Integer id_customer;

    public Integer getId_Advisor() {
        return id_advisor;
    }

    public Advisor_Customer setId_Advisor(Integer id_advisor) {
        this.id_advisor = id_advisor;
        return this;
    }
    public Integer getId_Customer() {
        return id_customer;
    }

    public Advisor_Customer setId_Customer(Integer id_customer) {
        this.id_customer = id_customer;
        return this;
    }
}
