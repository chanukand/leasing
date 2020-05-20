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
public class user extends SuperDTO{

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public user(String userName, String password, String nic, String tel, int type, int branch) {
        this.userName = userName;
        this.password = password;
        this.nic = nic;
        this.tel = tel;
        this.type = type;
        this.branch = branch;
    }
    private String userName;
    private String password;
    private String nic;
    private String tel;
    private int type;
    private int branch;
}
