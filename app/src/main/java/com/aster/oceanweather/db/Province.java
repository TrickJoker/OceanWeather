package com.aster.oceanweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省
 */
public class Province extends DataSupport {
    private int id;//索引，每个LitePal实体类中都应该有的字段，实体类赋值时不需要关注，会自动赋值
    private String provinceName;//省名称-接口中的name字段
    private int provinceCode;//接口中的id字段

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

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
