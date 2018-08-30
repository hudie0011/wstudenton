package com.weatherstuone.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    /**
     * id : 1
     * name : 北京
     */

    private int id;
    private String name;

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