/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hatro
 */
public class User {
    public String user;
    public String pass;
    public int power;

    public User() {
        user = "";
        pass = "";
        power = 0;
    }

    public User(String user, String pass, int power) {
        this.user = user;
        this.pass = pass;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }   
}
