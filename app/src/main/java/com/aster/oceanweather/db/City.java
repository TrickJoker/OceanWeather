package com.aster.oceanweather.db;

import org.litepal.crud.DataSupport;

/**
 * 市
 */
public class City extends DataSupport {
    private int id;//索引
    private int provinceId;//该市所属的省id-也就是省的索引
    private String cityName;
    private int cityCode;//接口中的id字段

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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
