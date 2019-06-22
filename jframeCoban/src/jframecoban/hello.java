/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecoban;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author hatro
 */
public class hello extends JFrame {
    JButton button;
    public hello(){
        createAndShow();
    }
    public void createAndShow(){
        button = new JButton("OK");
        setSize(300, 400);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        
    }
}
