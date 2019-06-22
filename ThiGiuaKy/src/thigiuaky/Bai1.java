/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thigiuaky;

import java.util.Scanner;

/**
 *
 * @author hatrongvu
 */
public class Bai1 {   
    public static void main(String[] args) {
        int s = 0;
        int e = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tien karaoke");
        System.out.println("Gio vao");
        s = scan.nextInt();
        System.out.println("Gio ra");
        e = scan.nextInt();
        if (9 <= s & s < e & e <= 24) {
			System.out.println("Chuong trinh dang chay");
			TinhTien t = new TinhTien(s, e);
			System.out.println("tien karaoke: "+t.tinhtien());
			} else {
			System.out.println("Gio nhap khong hop le");
		}
    }
}
