package com.aster.oceanweather.db;

import org.litepal.crud.DataSupport;

/**
 * 市
 */
public class City extends DataSupport {
    private String provinceId;//该市所属的省id
    private int id;//该市的id
    private String cityName;
    private String cityCode;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
