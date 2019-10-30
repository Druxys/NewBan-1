package Models;

public class RelationShips extends BaseModelORM {
    private Integer id;

    String tableName = "RelationShips";
    private Integer users_id;
    private Integer categories_id;

    public String getTableName(){
        return tableName;
    }

    public Integer getUsers_id() {
        return users_id;
    }

    public RelationShips setUsers_id(Integer users_id) {
        this.users_id = users_id;

        return this;
    }

    public Integer getCategories_id() {
        return categories_id;
    }

    public RelationShips setCategories_id(Integer categories_id) {
        this.categories_id = categories_id;

        return this;
    }
}
