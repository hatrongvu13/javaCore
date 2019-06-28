/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author hatro
 */
public class CollectMoneyElectric extends CollectMoney {

    public int start;
    public int end;
    public int dongia = 2500;

    public CollectMoneyElectric() {
    }

    public CollectMoneyElectric(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
    @Override
    public double calculateMoney() {
        int time = this.end - this.start;
        double Money;
        if (time <= 100) {
            Money = time*this.dongia;
        }else if (time > 100 & time <=300) {
            Money = 100*this.dongia + (time -100)*2500*1.05;
        }else{
            Money = 100*this.dongia + 200*this.dongia*1.05 + (time-300)*this.dongia*1.1;
        }
        return Money;
    }
    
}
