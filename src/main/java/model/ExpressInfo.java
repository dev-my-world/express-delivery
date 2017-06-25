package model;

public class ExpressInfo {
    private Long id;
    private String real_name;
    private String express_name;
    private Long station;
    private String address;
    private Long pickup_code;
    private String remark;
    private Long phone_tail;

    private Long user_id;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getExpress_name() {
        return express_name;
    }

    public void setExpress_name(String express_name) {
        this.express_name = express_name;
    }

    public Long getStation() {
        return station;
    }

    public void setStation(Long station) {
        this.station = station;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPickup_code() {
        return pickup_code;
    }

    public void setPickup_code(Long pickup_code) {
        this.pickup_code = pickup_code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getPhone_tail() {
        return phone_tail;
    }

    public void setPhone_tail(Long phone_tail) {
        this.phone_tail = phone_tail;
    }


    @Override
    public String toString() {
        return "ExpressInfo{" +
                "id=" + id +
                ", real_name='" + real_name + '\'' +
                ", express_name='" + express_name + '\'' +
                ", station=" + station +
                ", address='" + address + '\'' +
                ", pickup_code=" + pickup_code +
                ", remark='" + remark + '\'' +
                ", phone_tail=" + phone_tail +
                '}';
    }
}
