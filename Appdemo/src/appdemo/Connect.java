/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class Connect {
    public String user;
    public String password;
    public String dbName;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Connect() {
    }

    public Connect(String user, String password, String dbName) {
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
    public ArrayList<Ban> getBan(int Maban){
        ArrayList<Ban> array = null;
        String sql;
        if (Maban == 0) {
            sql = "select * from ban";
        }else{
            sql = "select * from ban where id = '" + Maban +"'";
        }
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            array = new ArrayList<Ban>();
            while(rs.next()){
                Ban ban = new Ban(rs.getString("name"),rs.getString("status"),rs.getInt("id"));
                array.add(ban);
            }
        } catch (Exception e) {
            System.out.println("loi khong lay dc ban");
        }
        return array;
    }
}
