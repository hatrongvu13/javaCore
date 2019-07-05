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
public class Foodtb {
    public String name;
    public int soluong, dongia;

    public Foodtb() {
    }

    public Foodtb(String name, int soluong, int dongia) {
        this.name = name;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
}
