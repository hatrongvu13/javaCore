/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author hatro
 */
public class CollectMoneyInternet extends CollectMoney {
    final double dongia = 285000;
    int soThang;

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public double getDongia() {
        return dongia;
    }

    public int getSoThang() {
        return soThang;
    }
    @Override
    public double caculateMoney() {
        double Money;
        if(this.soThang < 3){
            Money = this.soThang * this.dongia;
        }else if(this.soThang >= 3 & this.soThang < 6){
            Money = this.soThang * this.dongia * 0.95;
        }else{
            Money = this.soThang * this.dongia * 0.9;
        }
        return Money;
    }
    
}
