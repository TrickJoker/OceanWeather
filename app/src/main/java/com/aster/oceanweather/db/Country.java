package com.aster.oceanweather.db;

import org.litepal.crud.DataSupport;

/**
 * 县
 */
public class Country  extends DataSupport {
    private String cityId;//该市所属的市id
    private int id;//该县的id
    private String countryName;
    private String weatherId;//改县具体天气id

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
