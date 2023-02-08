package com.example.UserManagementapp.model;

public class UserModel {
    private int userId;
    private String Name;
    private String UserName;
    private String Address;
    private long PhoneNumber;

    public UserModel(int userId, String Name, String UserName, String Address, long PhoneNumber) {
        this.userId = userId;
        this.Name = Name;
        this.UserName = UserName;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", Name='" + Name + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
