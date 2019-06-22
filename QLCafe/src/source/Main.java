/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import SQL.Connect;
/**
 *
 * @author hatro
 */
public class Main {
    
    public static void main(String[] args) {
        Connect conn = new Connect("root", "", "qlcafe");
        conn.getConnect();
        lg();
    }
    public static void lg(){
        Login lg = new Login();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
    }
}
