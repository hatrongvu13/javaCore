/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdemo;

/**
 *
 * @author hatro
 */
public class Ban {
    public String tbName;
    public String tbStatus;
    public int tbId;

    public Ban() {
    }

    public Ban(String tbName, String tbStatus, int tbId) {
        this.tbName = tbName;
        this.tbStatus = tbStatus;
        this.tbId = tbId;
    }

    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public String getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(String tbStatus) {
        this.tbStatus = tbStatus;
    }

    public int getTbId() {
        return tbId;
    }

    public void setTbId(int tbId) {
        this.tbId = tbId;
    }
    
}
