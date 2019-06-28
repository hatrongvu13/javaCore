/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hatro
 */
public class Run {
    public static login lg;
    public static Main m;
    public static void login(){
        lg = new login();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
    }
    public static void main(){
        m = new Main();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
    public static void main(String[] args) {
        login();
    }
}
