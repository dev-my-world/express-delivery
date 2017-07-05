package model;


import java.util.Date;

public class Express {

    private long id;
    private String name;
    private String express;
    private String message;
    private String remark;
    private String address;
    private long station;
    private long user_Id;
    private String phone;
    private Integer is_Collect;
    private long weight;
    private String description;
    private Date InsertTime;

    public Date getInsertTime() {
        return InsertTime;
    }

    public void setInsertTime(Date insertTime) {
        InsertTime = insertTime;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public long getStation() {
        return station;
    }

    public void setStation(long station) {
        this.station = station;
    }


    public long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(long user_Id) {
        this.user_Id = user_Id;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public int getIs_Collect() {
        return is_Collect;
    }

    public void setIs_Collect(Integer is_Collect) {
        this.is_Collect = is_Collect;
    }


    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
