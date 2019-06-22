/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrList;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author hatro
 */
public class demo {
    public static void main(String[] args) {
        ArrayList<data> al = new ArrayList<data>();
        Scanner scan = new Scanner(System.in);
        data a = new data("htv", 19, "thai binh");
        al.add(a);
        System.out.println(al.size());
        data b = al.get(0);
        b.hienthi();
    } 
}
