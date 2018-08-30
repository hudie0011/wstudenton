package com.weatherstuone.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    /**
     * id : 113
     * name : 南京
     */

    private int id;
    private String name;
    private int provinceId;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
