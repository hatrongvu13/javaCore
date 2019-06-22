/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;


public class menu{
    static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
        int m; 
        while(true) {            
            m = use_menu.menuAll();
            switch(m){
                case 1:
                    use_menu.program1();
                    break;
                case 2:
                    use_menu.program2();
                    break;
                case 3:
                    use_menu.program3();
                    break;
                case 4:
                    System.out.println("ket thuc chuong trinh");
                    System.exit(0);
                default: 
                    System.out.println("Chuong trinh khong hop le hoac nhap sai");
            }
        }
    }
}