/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapString;

import java.util.Scanner;

/**
 *
 * @author T3H
 */
public class bai4_chuoi_doixung {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String str;
        System.out.println("Mời nhập chuỗi cần kiểm tra:");
        str = nhap.nextLine();
        //tạo chuỗi đảo ngược
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        //so sánh chuỗi ban đầu với chuỗi đảo ngược
        if(str.equalsIgnoreCase(str2.toString()))
            System.out.println("Chuỗi đối xứng");
        else    
            System.out.println("Chuỗi không đối xứng");
    }
}
