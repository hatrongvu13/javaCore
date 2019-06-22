/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class Connect {
    private String userName;
    private String password;
    private String dbName;
    private String tbName;

    public Connect() {
    }

    public Connect(String userName, String password, String dbName, String tbName) {
        this.userName = userName;
        this.password = password;
        this.dbName = dbName;
        this.tbName = tbName;
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

    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }
    public static Connection getConnection(String dbName, String userName, String password){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        try {
            Class.forName("com.jdbc.mysql.Driver");
            conn = (Connection) DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can't connected to db !!");
            e.printStackTrace();
        }
        return conn;
    }
    
}
