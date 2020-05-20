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
public class inventory extends SuperDTO{

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

    public inventory(String itemCode, double qty) {
        this.itemCode = itemCode;
        this.qty = qty;
    }
    private String itemCode;
    private double qty;
}
