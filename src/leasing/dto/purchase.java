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
public class purchase extends SuperDTO{

    public purchase(String itemCode, double qty, int user, double price) {
        this.itemCode = itemCode;
        this.qty = qty;
        this.user = user;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private String itemCode;
    private double qty;
    private int user;
    private double price;
}
