/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addBTN;

import java.awt.Component;
import java.sql.ResultSet;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author hatro
 */
public class user extends JFrame{
    public static JFrame f;
    public static JLabel lb;
    public static JButton btn;
    
    public user(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        int k= JOptionPane.showConfirmDialog(null, "có chắc là thoát","hỏi lại",JOptionPane.YES_NO_OPTION);
        System.out.println(k);
        Connect conn = new Connect("root","", "qlcafe");
        try {
            conn.getConnect();
            ResultSet rs = conn.getData();
            int i = 0;
            while(rs.next()){
                System.out.println(rs.getString("MaBan"));
               i++;
//                f.add(lb);
;
            }
        } catch (Exception e) {
            System.out.println("loi a");
        }
    }
}
