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
public class Mon {
    public int id, idnhom, dongia;
    public String name, loai;

    public Mon() {
    }

    public Mon(int id, int idnhom, int dongia, String name, String loai) {
        this.id = id;
        this.idnhom = idnhom;
        this.dongia = dongia;
        this.name = name;
        this.loai = loai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdnhom() {
        return idnhom;
    }

    public void setIdnhom(int idnhom) {
        this.idnhom = idnhom;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
}
