/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class Connect {
    public String username;
    public String pass;
    public String dbName;
    public String TbName;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Connect() {
    }

    public Connect(String username, String pass, String dbName, String TbName) {
        this.username = username;
        this.pass = pass;
        this.dbName = dbName;
        this.TbName = TbName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTbName() {
        return TbName;
    }

    public void setTbName(String TbName) {
        this.TbName = TbName;
    }
    public Connection getConnect(){
        try {
            System.out.println("Connecting ......");
            String url = "jdbc:mysql://localhost:3306/" + this.dbName;
            conn = DriverManager.getConnection(url, this.username, this.pass);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ascasdnclajnsdc");
        }
        return conn;
    }
    public ResultSet getData(){
        try {
            stmt = conn.createStatement();
            String sql = "select * from " + this.TbName;
            rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                int id = rs.getInt("id");
//                System.out.println(id);
//            }
            
        } catch (Exception e) {
        }
        return rs;
    }
    public ResultSet getTotal(){
        try {
            stmt = conn.createStatement();
            String sql = "select * from " + this.TbName;
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "htvhtvhthvhthvhthvthvthvthvhthvthvthvthvhtvht");
        }
        return rs;
    }
}
