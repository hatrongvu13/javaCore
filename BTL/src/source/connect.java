/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

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
public class connect {
   public String username;
    public String pass;
    public String dbName;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public connect() {
    }

    public connect(String username, String pass, String dbName) {
        this.username = username;
        this.pass = pass;
        this.dbName = dbName;
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
    public Connection getConnect(){
        try {
            String url = "jdbc:mysql://localhost:3306/" + this.dbName;
            conn = DriverManager.getConnection(url, this.username, this.pass);
            stmt = conn.createStatement();
//            JOptionPane.showMessageDialog(null, "Connected !");
            System.out.println("connected !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi ket noi toi db");
        }
        return conn;
    }
    public ResultSet checkUser(String user, String passw, String tbName){
        String Sql = "select * from " + tbName +" where name = ? AND pass = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(Sql);
            stm.setString(1, user);
            stm.setString(2, passw);
            rs = stm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"không thể check được user tại file connect");
        }
        return rs;
    }
    public void ChangeUser(){}
}
