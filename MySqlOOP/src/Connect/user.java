/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class user {
    public static void main(String[] args) {
        Connect conn = new Connect("root","","qlcafe", "test");
        conn.getConnect();
        ResultSet rs = conn.getData();
        ResultSet total = conn.getTotal();
        
        try {
            while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id + "  " + name);
            }
            int i=0;
            while(total.next()){
                i++;
            }
            System.out.println( "tong cac ban ghi: "+i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Loi ko lay dc du lieu");
        }
        
    }
}
