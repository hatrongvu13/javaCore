/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapString;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author T3H
 */
public class bai3_Tinhtong2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String str;
        System.out.println("Mời nhập chuỗi các số phân biệt bởi dấu chấm phẩy:");
        str = nhap.nextLine();
        //tách lấy từng số với mỗi dấu chấm phẩy
        String[] arr = str.split(";");
        int n = arr.length;
        System.out.println("Số chuỗi tách được là:" + n);
        double tong = 0;
        for(int i=0; i<n;i++)//lặp từng từ tách được
        {
            String s = arr[i];//lấy từ hiện tại ra
            System.out.println(s);
            tong +=  Double.parseDouble(s);//chuyển chuỗi thành số double
        }
        System.out.println("Tổng là:" + tong);
    }
}
