/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

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
    public String password;
    public String dbName;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public connect() {
    }

    public connect(String user, String password, String dbName) {
        this.user = user;
        this.password = password;
        this.dbName = dbName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
            conn = DriverManager.getConnection(url, this.user, this.password);
            stmt = conn.createStatement();
//            JOptionPane.showMessageDialog(null, "Connected !");
            System.out.println("connected !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi ket noi toi db");
        }
        return conn;
    }
    public ResultSet getData(String tbName){
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM " + tbName;
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("loi");
        }
        return rs;
    }
    public ResultSet getPower(String txtuser){
        try {
            stmt = conn.createStatement();
            String sql = "select * from taikhoan where name = '"+ txtuser+"'";
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("ko lay dc power !");
        }
        return rs;
    }
    public boolean check(String txtuser,String txtpass, String tbName){
        try {
            stmt = conn.createStatement();
            String sql = "Select * from " + tbName + " where name = '" + txtuser + "' and password = '" + txtpass + "'";
            rs = stmt.executeQuery(sql);
            if (rs.isBeforeFirst() == true) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khong check dc user");
            return false;
        }
    }
    public boolean demo(String txtuser,String txtpass, String tbName){
        try {
            stmt = conn.createStatement();
            String sql = "Select * from " + tbName + " where name = '" + txtuser + "' and password = '" + txtpass + "'";
            rs = stmt.executeQuery(sql);
            if (rs.isBeforeFirst() == true) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khong check dc user");
            return false;
        }
    }
}
