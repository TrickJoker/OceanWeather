package com.aster.oceanweather.util;

import android.text.TextUtils;

import com.aster.oceanweather.db.City;
import com.aster.oceanweather.db.County;
import com.aster.oceanweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 处理接口返回的json数据的工具
 */
public class Utility {

    /**
     * 解析处理请求返回的省级数据
     * 注意 id 变量不需要赋值，框架自动处理
     *
     * @return 处理结果
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObj = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObj.getString("name"));
                    province.setProvinceCode(provinceObj.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析处理请求返回的市级数据
     *
     * @param provinceId 注意这个值传入的是 Province 的 id 字段（不是 provinceCode 字段）-索引，这样使省市数据相互关联，方便数据库查询
     * @return 处理结果
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCity = new JSONArray(response);
                for (int i = 0; i < allCity.length(); i++) {
                    JSONObject cityObj = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObj.getString("name"));
                    city.setCityCode(cityObj.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析处理请求返回的县级数据
     *
     * @param cityId 注意这个值传入的是 City 的 id 字段-索引，这样使市县数据相互关联，方便数据库查询
     * @return 处理结果
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounty = new JSONArray(response);
                for (int i = 0; i < allCounty.length(); i++) {
                    JSONObject countryObj = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countryObj.getString("name"));
                    county.setWeatherId(countryObj.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
