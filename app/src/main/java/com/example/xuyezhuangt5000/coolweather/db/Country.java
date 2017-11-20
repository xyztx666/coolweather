package com.example.xuyezhuangt5000.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xuyezhuangT5000 on 2017/11/20.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }
}
