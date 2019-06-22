/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class Connect {
    public String userName;
    public String password;
    public String dbName;
    
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;

    public Connect() {
    }

    public Connect(String userName, String password, String dbName) {
        this.userName = userName;
        this.password = password;
        this.dbName = dbName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
            String url = "jdbc:mysql://localhost:3306/" + this.dbName + "?useUnicode=true&characterEncoding=utf8";
            conn = DriverManager.getConnection(url,this.userName, this.password);
            stmt = conn.createStatement();
            System.out.println("connected !");
        } catch (Exception e) {
            System.out.println("Can't connect .....! ");
        }
        return conn;
    }
    public ResultSet getData(String tbName){
        String sql = "select * from " + tbName;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("connected ! ");
        } catch (Exception e) {
            System.out.println("Can't select data in SQL ! ");
        }
        return rs;
    }
    public boolean check(String user, String passw, String tbName){
        String Sql = "select * from " + tbName +" where name = ? AND pass = ?";
        try {
            PreparedStatement stm = conn.prepareStatement(Sql);
            stm.setString(1, user);
            stm.setString(2, passw);
            rs = stm.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"không thể check được user tại file connect");
            return false;
        }
    }
}
