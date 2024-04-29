package com.example.UserMicroservicess.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDto {

    private int userid;

    private String username;

    private String address;

    private int mobile;

    public UserDto(int userid,String username,String address,int mobile){
        this.userid=userid;
        this.username=username;
        this.address=address;
        this.mobile=mobile;
    }
    public UserDto(){
    }

    public int getUserid(){
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
