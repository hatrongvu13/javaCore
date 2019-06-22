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
public class bai2_chuanhoa_chuoi {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String str;
        System.out.println("Nhập chuỗi:");
        str = nhap.nextLine();
        str = str.toUpperCase();//chuyen thanh chu hoa
        System.out.println("Chuoi ban dau:" + str);
        //copy sang StringBuilder để xử lý
        StringBuilder str2 = new StringBuilder(str);
        for(int i=1; i<str.length();i++)
        {
            char kt1,kt2;
            kt1 = str.charAt(i-1);
            kt2 = str.charAt(i);
            if(kt1 == ' ')// nếu ký tự trước là dấu cách
            {
                kt2 = Character.toLowerCase(kt2);//ký tự sau chuyển sang chữ thường
                str2.setCharAt(i, kt2);
            }
        }
        System.out.println("Chuoi ket qua:" + str2);
    }
}
