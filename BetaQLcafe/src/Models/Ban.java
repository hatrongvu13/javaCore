/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hatro
 */
public class Ban {
    public String tenBan;
    public int maban, trangthai;

    public Ban() {
        this.tenBan = "";
        this.trangthai = 0;
        this.maban = 0;
    }

    public Ban(String tenBan, int trangthai, int maban) {
        this.tenBan = tenBan;
        this.trangthai = trangthai;
        this.maban = maban;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getMaban() {
        return maban;
    }

    public void setMaban(int maban) {
        this.maban = maban;
    }
    
}
