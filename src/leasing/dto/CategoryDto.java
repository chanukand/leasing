/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open 
 *the template in the editor.
 */
package leasing.dto;

import java.util.Date;

/**
 * @author Home
 */
public class CategoryDto extends SuperDTO{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoryDto(String desc, String name, String code, String date, String remark, int user, int id) {
        this.desc = desc;
        this.name = name;
        this.code = code;
        this.date = date;
        this.remark = remark;
        this.user = user;
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    private String desc;
    private String name;
    private String code;
    private String date;
    private String remark;
    private int user;
    private int id;
}
