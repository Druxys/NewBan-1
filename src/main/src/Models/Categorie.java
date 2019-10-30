package Models;

public class Categorie extends BaseModelORM {
    private Integer id;

    private String tableName = "Categories";
    private String name;

    public String getTableName(){
        return tableName;
    }

    public String getName() {
        return name;
    }

    public Categorie setName(String name) {
        this.name = name;

        return this;
    }
}
