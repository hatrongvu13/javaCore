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
public class Loai {
    public int ma;
    public String nameLoai;

    public Loai() {
    }

    public Loai(int ma, String nameLoai) {
        this.ma = ma;
        this.nameLoai = nameLoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNameLoai() {
        return nameLoai;
    }

    public void setNameLoai(String nameLoai) {
        this.nameLoai = nameLoai;
    }
    
}
