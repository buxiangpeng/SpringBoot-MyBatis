package com.example.model;

import com.example.base.BaseModel;

public class User extends BaseModel {
	
	private static final long serialVersionUID = -6294981775286222491L;

	private Integer id;

    private Object info;

    private String name;

    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}