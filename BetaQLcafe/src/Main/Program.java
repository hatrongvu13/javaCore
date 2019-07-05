/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author hatro
 */
public class Program {
    public static login log;
    public static fmMain main;
    public static void lg(){
        log = new login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }
    public static void m(String user, int power){
        main = new fmMain();
        if(user != null){
        main.setName(user);
        }else{
            main.setName("noname");
        }
        main.setPower(power);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
    public static void main(String[] args) {
        lg();
    }
}
