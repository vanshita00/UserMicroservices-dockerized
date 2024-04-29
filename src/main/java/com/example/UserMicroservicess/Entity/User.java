package com.example.UserMicroservicess.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="user")


public class User {

    @Id
    @Column(name="user_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column(name="user_name",length=255)
    private String username;
    @Column(name = "address",length=255)
    private String address;
    @Column(name="mobile",length=20)
    private int mobile;

    public User(int userid,String username,String address,int mobile){
        this.userid=userid;
        this.username=username;
        this.address=address;
        this.mobile=mobile;
    }
    public User(){
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
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
