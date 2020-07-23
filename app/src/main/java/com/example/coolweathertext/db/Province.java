package com.example.coolweathertext.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;

    //省名
    private String provinceName;

    //省代号
    private int proivnceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProivnceCode() {
        return proivnceCode;
    }

    public void setProivnceCode(int proivnceCode) {
        this.proivnceCode = proivnceCode;
    }
}
