/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hatro
 */
public class conn {
    public static Connection getMySQLConnection()
            throws ClassNotFoundException,SQLException{
        String hostName= "localhost";
        String dbName ="";
        String userName = "root";
        String pass = "";
        return getMySQLConnection(hostName, dbName, userName, pass);
    }
    public static Connection getMySQLConnection(String hostName,String dbName, String userName, String pass)
        throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306" + dbName;   
        Connection conn = DriverManager.getConnection(connectionURL,userName,pass);
        return conn;
        
    }
}
