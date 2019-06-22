/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addBTN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hatro
 */
public class Connect {
    public String user;
    public String password;
    public String dbName;
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;

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
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            System.out.println("connected !");
        } catch (Exception e) {
            System.out.println("Loi ket noi");
        }
        return conn;
    }
    public ResultSet getData(){
        try {
            stmt = conn.createStatement();
            String sql = "select * from ban";
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("ko lay dc data");
        }
        return rs;
    }
}
