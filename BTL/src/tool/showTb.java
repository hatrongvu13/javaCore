/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import javax.swing.JButton;

/**
 *
 * @author hatro
 */
public class showTb {
    public int id;
    public String name;
    public String status;

    public showTb() {
    }

    public showTb(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void showListTb(){
        JButton btn = new JButton();
//        btn.setText( this.name, this.status);
    }
}
