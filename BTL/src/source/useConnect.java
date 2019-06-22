/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class useConnect {
    public static void main(String[] args) {
        connect Conn = new connect("root", "","qlcafe");
        try {
            Conn.getConnect();
            ResultSet rs =  Conn.checkUser("admin", "admin", "admin");
            if(rs.next()){;
                JOptionPane.showMessageDialog(null,"đăng nhập thành công ! ");
            }else{
                JOptionPane.showMessageDialog(null, "Lỗi đăng nhập !");
            };
        } catch (Exception e) {
        }
    }
}
