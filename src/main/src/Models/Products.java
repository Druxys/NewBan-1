package Models;

import org.json.JSONObject;

import java.sql.Date;
import java.sql.Timestamp;

public class Products extends BaseModelORM {
    private Integer id;

    String tableName = "Products";
    private String name;
    private Integer rate;
    private Integer cap;
    private Timestamp duration;
    private Integer age_min_preferred;
    private Integer age_max_preferred;
    private Integer income_min_preferred;
    private Integer income_max_preferred;
    private Integer age_min_required;
    private Integer age_max_required;
    private Integer income_min_required;
    private Integer income_max_required;
    private String professionnal_situation_preferred;
    private String familial_situation_preferred;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Boolean is_enabled = true;

    public String getTableName() { return tableName; }

    public String getName() { return name; }

    public  Products setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRate() { return rate; }

    public Products setRate(Integer rate) {
        this.rate = rate;
        return this;
    }

    public Integer getCap() { return cap; }

    public Products setCap(Integer cap) {
        this.cap = cap;
        return this;
    }

    public Timestamp getDuration() { return duration; }

    public Products setDuration(Timestamp duration) {
        this.duration = duration;
        return this;
    }

    public Integer getAge_min_preferred() { return age_min_preferred; }

    public Products setAge_min_preferred(Integer age_min_preferred) {
        this.age_min_preferred = age_min_preferred;
        return this;
    }

    public Integer getAge_max_preferred() { return age_max_preferred; }

    public Products setAge_max_preferred(Integer age_max_preferred) {
        this.age_max_preferred = age_max_preferred;
        return this;
    }

    public Integer getIncome_min_preferred() { return income_min_preferred; }

    public Products setIncome_min_preferred(Integer income_min_preferred) {
        this.income_min_preferred = income_min_preferred;
        return this;
    }

    public Integer getIncome_max_preferred() { return income_max_preferred; }

    public Products setIncome_max_preferred(Integer income_max_preferred) {
        this.income_max_preferred = income_max_preferred;
        return this;
    }

    public Integer getAge_min_required() { return age_min_required; }

    public Products setAge_min_required(Integer age_min_required) {
        this.age_min_required = age_min_required;
        return this;
    }

    public Integer getAge_max_required() { return age_max_required; }

    public Products setAge_max_required(Integer age_max_required) {
        this.age_max_required = age_max_required;
        return this;
    }

    public Integer getIncome_min_required() { return income_min_required; }

    public Products setIncome_min_required(Integer income_min_required) {
        this.income_min_required = income_min_required;
        return this;
    }

    public Integer getIncome_max_required() { return income_max_required; }

    public Products setIncome_max_required(Integer income_max_required) {
        this.income_max_required = income_max_required;
        return this;
    }

    public String getProfessionnal_situation_preferred() { return professionnal_situation_preferred; }

    public Products setProfessionnal_situation_preferred(String professionnal_situation_preferred) {
        this.professionnal_situation_preferred = professionnal_situation_preferred;
        return this;
    }

    public String getFamilial_situation_preferred() { return familial_situation_preferred; }

    public Products setFamilial_situation_preferred(String familial_situation_preferred) {
        this.familial_situation_preferred = familial_situation_preferred;
        return this;
    }

    public Timestamp getCreated_at() { return created_at; }

    public Products setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() { return updated_at; }

    public Products setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public Products setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
        return this;
    }
}