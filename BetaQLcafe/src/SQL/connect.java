/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Models.Ban;
import Models.Loai;
import Models.Mon;
import Models.User;
import Models.goimon;
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
            String url = "jdbc:mysql://localhost:3306/" + this.dbName +"?useUnicode=true&characterEncoding=utf8";
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
    public int getPower(String txtuser){
        int p = 0;
        try {
            stmt = conn.createStatement();
            String sql = "select * from taikhoan where name = '"+ txtuser+"'";
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                p = rs.getInt("power");
            }else{
                System.out.println("loi");
            }
        } catch (Exception e) {
            System.out.println("ko lay dc power !");
        }
        return p;
    }
    public int getStatus(String name){
        int status = -1;
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM `banan` WHERE name = '"+ name +"'";
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                status = rs.getInt("power");
            }else{
                System.out.println("loi");
            }
        } catch (Exception e) {
            System.out.println("ko lay dc power !");
        }
        return status;
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
    
    public void addGoiMon(goimon m){
        String sql = "INSERT INTO `goimon` VALUES (null,"+m.getIdban()+",'"+m.getTenmon()+"',"+m.getIdmon()+","+m.getDongia()+","+ m.getSoluong()+")";
        try {
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "KHoong the them mosn dc !");
        }
    }
    public ArrayList<User> getTaiKhoan(){
        ArrayList<User> arr = null;
        String sql = "select * from taikhoan";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<User>();
            while (rs.next()) {                
                User u = new User(rs.getString("name"), rs.getString("password"), rs.getInt("power"));
                arr.add(u);
            }
        } catch (Exception e) {
        }
        return arr;
    }
    public ArrayList<goimon> getGoiMon(){
        ArrayList<goimon> arr = null;
        String sql = "select * from goimon";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<goimon>();
            while (rs.next()) {                
                goimon gm = new goimon(rs.getString("name"), rs.getInt("quantity_food"), rs.getInt("id_food"),rs.getInt("dongia") , rs.getInt("id_ban"));
                arr.add(gm);
            }
        } catch (Exception e) {
        }
        return arr;
    }        
    public ArrayList<Loai> getLoai(){
        ArrayList<Loai> arr = null;
        String sql = "select * from nhommon";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<Loai>();
            while (rs.next()) {                
                Loai l = new Loai(rs.getInt("id"), rs.getString("name"));
                arr.add(l);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không lấy được loại món !");
        }
        return arr;
    }
    public ArrayList<Mon> getMontheoNhom(int i){
        String sql = "SELECT * FROM `thucdon` WHERE id_nhom =" +i;
        ArrayList<Mon> arr = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<Mon>();
            while (rs.next()) {                
                Mon m = new Mon(rs.getInt("id"), rs.getInt("id_nhom"), rs.getInt("dongia"), rs.getString("name"), rs.getString("loai"));
                arr.add(m);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Khong lay dc mon theo nhom mon !");
        }
        return arr;
    }
    public ArrayList<Ban> getBan(int tenban){
        String sql = "select * from banan where id = '"+ tenban +"'";
        ArrayList<Ban> arr = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<Ban>();
            while (rs.next()) {                
                Ban b = new Ban(rs.getString("name"), rs.getInt("status"), rs.getInt("id"));
                arr.add(b);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khoong lay dc thong tin ban" + tenban);
        }
        return arr;
    }
    public ArrayList<Mon> getMon(String tenMon){
        String sql = "select * from thucdon";
        ArrayList<Mon> arr = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<Mon>();
            while (rs.next()) {                
                Mon b = new Mon(rs.getInt("id"), rs.getInt("id_nhom"), rs.getInt("dongia"), rs.getString("name"), rs.getString("loai"));
                arr.add(b);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "khoong lay dc thong tin ban" + tenMon);
        }
        return arr;
    }
    public int getSoBan(){
        String sql = "select * from banan";
        int cow = 0;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {                
                cow++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ko lay dc so luong ban !");
        }
        return cow;
    }
    public ArrayList<Ban> getAllBan(){
        String sql = "select * from banan";
        ArrayList<Ban> arr = null;
         try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            arr = new ArrayList<Ban>();
            while (rs.next()) {                
                Ban b = new Ban(rs.getString("name"), rs.getInt("status"), rs.getInt("id"));
                arr.add(b);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ko lay dc so ban !");
        }
        return arr;
    }
    public void addTaikhoan(String u, String pas, int p){
        String sql = "INSERT INTO `taikhoan`(`id`, `name`, `password`, `power`) VALUES (null,'"+u+"','"+pas+"',"+p+")";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "thêm thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ko them dc tai khoarn");
        }
    }
    public boolean deleteMon(String name){
        String sql = "DELETE FROM `thucdon` WHERE name ='"+ name+"'";
        try {
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
