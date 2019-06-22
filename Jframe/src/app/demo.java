/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JFrame;

/**
 *
 * @author hatro
 */
public class demo extends JFrame {
    public demo(){
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        demo h = new demo();
    }
}
