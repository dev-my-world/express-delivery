package model;

import java.util.List;

public class User {
    private long userId;
    private String userName;
    private String userPhone;
    private String userPsw;

    private List<ExpressInfo> expressInfoList;

    public List<ExpressInfo> getExpressInfoList() {
        return expressInfoList;
    }

    public void setExpressInfoList(List<ExpressInfo> expressInfoList) {
        this.expressInfoList = expressInfoList;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPsw='" + userPsw + '\'' +
                '}';
    }
}
