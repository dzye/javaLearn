package com.lagou.task17;

public class User implements java.io.Serializable {
    private String name;
    private String password;
    private transient String phoneNum;
    public User(String name, String password, String phoneNum) {
        setName(name);
        setPassword(password);
        setPhoneNum(phoneNum);
    }
    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
