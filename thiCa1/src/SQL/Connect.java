/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class Connect {
    public String user;
    public String pass;
    public String dbname;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs= null;

    public Connect() {
    }

    public Connect(String user, String pass, String dbname) {
        this.user = user;
        this.pass = pass;
        this.dbname = dbname;
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

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
    
    public Connection getConnect(){
        try {
            String url ="jdbc:mysql://localhost:3306/" + this.dbname;
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("conect");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't connect !");
        }
        return conn;
    }
    public boolean checklogin(String username, String password){
        String sql = "select * from tbtaikhoan where user ='"+ username+"' and password = '"+ password+"'";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.isBeforeFirst() == true){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi kiểm tra user !");
            return false;
        }
    }
    public ResultSet getTennhom(){
        String sql = "select * from tbnhomsanpham";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không lấy đc tên nhóm !");
        }
        return rs;
    }
    public int add(String TenSP,String img,String gioithieu,String gia,int nhom) {
        int insert = 0;
        String n = String.valueOf(nhom);
        String sql = "Insert into tbsanpham (MaSP, TenSP, HinhanhSP, GioithieuSP, GiaSP, manhom )"
                + " values (null,'"+ TenSP +"','"+ img +"','"+ gioithieu +"','" + gia + "','" + n + "')";
        try {
            stmt = conn.createStatement();
            insert = stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("loi them san pham");
        }
        return insert;
    }
}
