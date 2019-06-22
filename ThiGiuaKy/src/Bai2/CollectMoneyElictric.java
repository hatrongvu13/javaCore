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
public class CollectMoneyElictric extends CollectMoney{
    private final double dongia = 2500;
    private double chiSoDau;
    private double chiSoCuoi;

    CollectMoneyElictric() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public final double getdongia(){
        return dongia;
    }
    public double getSoDau(){
        return chiSoDau;
    }
    public double getSoCuoi(){
        return chiSoCuoi;
    }
    public CollectMoneyElictric(double chiSoDau, double chiSoCuoi){
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
    }
    double soTieuThu = chiSoCuoi - chiSoDau;

    @Override
    public double caculateMoney() {
        double SoTieuThu = this.chiSoCuoi - this.chiSoDau;
        double Money;
        if(SoTieuThu < 100){
            Money = SoTieuThu*this.dongia;
        }else if(SoTieuThu >= 100 & SoTieuThu < 300){
            Money = SoTieuThu*this.dongia*1.05;
        }else{
            Money = SoTieuThu*this.dongia*1.1;
        }
        return Money;
    }
        
}
