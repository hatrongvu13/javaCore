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
public class use_menu {
    static Scanner Scan = new Scanner(System.in);
    public static int menuAll(){
        int n;
        System.out.println("Chuong trinh tong hop");
        System.out.println("1. quan ly sinh vien");
        System.out.println("2. xu ly chuoi");
        System.out.println("3. quan ly tu dien");
        System.out.println("4. thoat");
        System.out.println("Moi chon 1-4: ");
        n = Scan.nextInt();
        return n;
    }
    public static int menuSV(){
        int n;
        System.out.println("Chuong trinh quan ly sinh vien");
        System.out.println("1. nhap sinh vien");
        System.out.println("2. xem danh sach sinh vien");
        System.out.println("3. xoa sinh vien");
        System.out.println("4. sua thong tin");
        System.out.println("5. thoat");
        System.out.println("Moi chon 1-5 ");
        n = Scan.nextInt();
        return n;
    }
    public static int menuStr(){
        int n;
        System.out.println("Chuong trinh xu ly chuoi");
        System.out.println("1. Dem ky tu cua chuoi");
        System.out.println("2. xem ky tu trung lap");
        System.out.println("3. tim kiem ky tu");
        System.out.println("4. thoat");
        System.out.println("Moi chon 1-4:");
        n = Scan.nextInt();
        return n;
    }
    public static String nhapchuoi(){
        System.out.println("Moi ban nhap chuoi");
        String str = Scan.nextLine();
        return str;
    }
    public static void Hienthichuoi(String str){
        System.out.println("danh sach dư lieu da nhap tu truoc");
        System.out.println(str);
    }
    public static void program1(){
        // quan ly sinh vien
        int n;
            System.out.println("Nhap so sinh vien toi da");
            n = Scan.nextInt();
            sinhvien[] arr = new sinhvien[n];
        int c;
        do {
            c = menuSV();
            switch(c){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("ket thuc chuong trinh quan ly sinh vien");
                    break;
                default:
                    System.out.println("Nhap sai roi");
            }
        } while(c!=5);
    }
    public static void program2(){
        System.out.println("chuong trinh 2");
        int c;
        do {            
            c = menuStr();
            switch(c){
                case 1:
                    System.out.println("Chuong trinh nay có van đề nhé");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Chuong trinh kiem tra chuoi ket thuc");
                    break;
            }
        } while (c!=4);
    }
    public static void program3(){
        System.out.println("chuong trinh 3");
    }
}
