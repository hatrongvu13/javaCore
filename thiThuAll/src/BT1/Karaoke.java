/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Scanner;

/**
 *
 * @author hatro
 */
public class Karaoke {
    
    public static double Tinhtien(int start, int end){
        double Money = 0;
        if (end < start & 9 <= start & end <= 24 ) {
            System.out.println("Giờ bắt đầu lớn hơn 9h giờ kết thúc phải nhỏ hơn 24h");
        }else{
            int time = end - start;
            if (time == 1) {
                Money = 60000;
            }else if(time > 1 & time <=3){
                Money =60000 + (time-1)*60000*0.8;
            }else{
                Money =60000 + 2*60000*0.8+(time-3)*60000*0.7;
            }
        }
        return Money;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập giờ bắt đầu");
        int st = scan.nextInt();
        System.out.println("Nhập giờ kết thúc");
        int en = scan.nextInt();
        System.out.println(Tinhtien(st, en));
    }
}
