/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class connect {
    public String user;
    public String pass;
    public String dbName;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public connect() {
    }

    public connect(String user, String pass, String dbName) {
        this.user = user;
        this.pass = pass;
        this.dbName = dbName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
        String url ="jdbc:mysql://localhost:3306/" + this.dbName;
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "can't connect !");
        }
        return conn;
    }
    public ResultSet getData(String tbName, String search){
        String sql = "select * from " + tbName + " where tencd like '%" + search +"%'";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khong tim dc du lieu");
        }
        return rs;
    }
    public ResultSet search(String txtSearch, String tbName){
        try {
            stmt = conn.createStatement();
            String sql = " select * from " + tbName +" where tencd like '%"+ txtSearch + "%'";
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khong lay dc du lieu");
        }
        return rs;
    }
    public void Insert(String tenCD, String tenCasy, String soBaiHat, String Gia){
        String sql = "INSERT INTO table_name VALUES ("+ tenCD+","+tenCasy+","+soBaiHat+","+Gia+")";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ko them dc du lieu");
        }
    }
}
