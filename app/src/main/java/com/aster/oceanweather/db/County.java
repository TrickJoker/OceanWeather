package com.aster.oceanweather.db;

import org.litepal.crud.DataSupport;

/**
 * 县
 */
public class County extends DataSupport {
    private int id;
    private int cityId;//该县所属的市id
    private String countyName;
    private String weatherId;//该县具体天气id

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countryName) {
        this.countyName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
