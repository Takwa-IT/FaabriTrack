package com.example.stagebackend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String client_name;

    private String phone_number;


    private String city;

    private String status;

    private Date enter_time;

    public client(){
        this.client_name=client_name;
        this.phone_number=phone_number;
        this.city=city;
        this.status=status;
        this.enter_time=enter_time;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEnter_time() {
        return enter_time;
    }

    public void setEnter_time(Date enter_time) {
        this.enter_time = enter_time;
    }

    public String getName() {
        return client_name;
    }

    public void setName(String client_name) {
        this.client_name = client_name;
    }

}