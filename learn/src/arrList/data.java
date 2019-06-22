/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrList;

import java.util.Scanner;
/**
 *
 * @author hatro
 */
public class data {
    public String name;
    public int age;
    public String address;
    public data(){
        name = "";
        age = 0;
        address = "";
    }
    public data( String n, int a, String add){
        name = n;
        age = a;
        address = add;
    }
    public void Nhap(){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        name = Scan.nextLine();
        System.out.println("Moi nhap tuoi: ");
        age = Scan.nextInt();
        String input = Scan.nextLine();
        System.out.println("Moi nhap dia chi: ");
        address = Scan.nextLine();
    }
    public void hienthi(){
        System.out.println("mang gom "+ name +" && " + age + "&& " + address);
    }
}
