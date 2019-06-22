/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
/**
 *
 * @author hatro
 */
public class sinhvien {
    static Scanner Scan = new Scanner(System.in);
    public String masv;
    public String tensv;
    public double diem;
    public sinhvien(){
        masv = "";
        tensv = "";
        diem = 0;
    }
    public sinhvien(String ma, String ten, double diem){
        masv = ma;
        tensv = ten;
        diem = diem;
    }
    public void nhap(){
        System.out.println("Nhap ma sinh vien");
        masv = Scan.nextLine();
        System.out.println("Nhap ten sinh vien");
        tensv = Scan.nextLine();
        System.out.println("Nhap diem sinh vien");
        diem = Scan.nextDouble();
    }
    public void hienthi(){
        System.out.println("Thong tin cua sinh vien :");
        System.out.println("Ma sinh vien: " + masv);
        System.out.println("Ten sinh vien: " + tensv);
        System.out.println("Diem cua sinh vien: "+ diem);
    }
}

