/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.dto;

/**
 *
 * @author Home
 */
public class item extends SuperDTO {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public item(String name, String desc, double price, double cost, String itemCode, String branch) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.cost = cost;
        this.itemCode = itemCode;
        this.branch = branch;
    }
    private String name;
    private String desc;
    private double price;
    private double cost;
    private String itemCode;
    private String branch;
}
