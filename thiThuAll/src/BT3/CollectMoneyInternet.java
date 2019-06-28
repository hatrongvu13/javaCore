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
public class CollectMoneyInternet extends CollectMoney {

    public int thang;
    public int dongia = 285000;

    public CollectMoneyInternet() {
    }

    public CollectMoneyInternet(int thang) {
        this.thang = thang;
    }
    
    @Override
    public double calculateMoney() {
        double Money;
        if(thang <3){
            Money = thang*this.dongia;
        }else if (thang >=3 & thang <6) {
            Money = thang*this.dongia*0.95;
        }else{
            Money = thang*this.dongia*0.9;
        }
        return Money;
    }
    
}
