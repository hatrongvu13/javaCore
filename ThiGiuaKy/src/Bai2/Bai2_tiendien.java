/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import javax.swing.JOptionPane;

/**
 *
 * @author hatro
 */
public class Bai2_tiendien extends javax.swing.JFrame {

    /**
     * Creates new form Bai2_tiendien
     */
    public Bai2_tiendien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TienDien = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDau = new javax.swing.JTextField();
        txtCuoi = new javax.swing.JTextField();
        btnTinhDien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtKQ = new javax.swing.JTextField();
        TienInternet = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        txtSoThang = new javax.swing.JTextField();
        BtnTinhInternet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtKqIntermet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chỉ số đầu");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chỉ số cuối");

        btnTinhDien.setText("Tính tiền điện");
        btnTinhDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhDienActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thành tiền");

        javax.swing.GroupLayout TienDienLayout = new javax.swing.GroupLayout(TienDien);
        TienDien.setLayout(TienDienLayout);
        TienDienLayout.setHorizontalGroup(
            TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TienDienLayout.createSequentialGroup()
                .addGroup(TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TienDienLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnTinhDien, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TienDienLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDau)
                            .addComponent(txtCuoi)
                            .addComponent(txtKQ, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        TienDienLayout.setVerticalGroup(
            TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TienDienLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnTinhDien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(TienDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        TienDien.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienDien.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienDien.setLayer(txtDau, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienDien.setLayer(txtCuoi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienDien.setLayer(btnTinhDien, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienDien.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienDien.setLayer(txtKQ, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Tien dien", TienDien);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Số Tháng");

        BtnTinhInternet.setText("Tính");
        BtnTinhInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTinhInternetActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thành tiền");

        javax.swing.GroupLayout TienInternetLayout = new javax.swing.GroupLayout(TienInternet);
        TienInternet.setLayout(TienInternetLayout);
        TienInternetLayout.setHorizontalGroup(
            TienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TienInternetLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(TienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(TienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoThang)
                    .addComponent(BtnTinhInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKqIntermet, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        TienInternetLayout.setVerticalGroup(
            TienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TienInternetLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(TienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(BtnTinhInternet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(TienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKqIntermet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        TienInternet.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienInternet.setLayer(txtSoThang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienInternet.setLayer(BtnTinhInternet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienInternet.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TienInternet.setLayer(txtKqIntermet, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Tien internet", TienInternet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhDienActionPerformed
        // TODO add your handling code here:
        double dau = Double.parseDouble(txtDau.getText());
        double cuoi = Double.parseDouble(txtCuoi.getText());
        if(dau < cuoi){
            CollectMoneyElictric t = new CollectMoneyElictric(dau,cuoi);
            double tien = t.caculateMoney();
            txtKQ.setText(Double.toString(tien));
        }else{
            JOptionPane.showMessageDialog(null,"Chỉ số cuối phải lớn hơn chỉ số đầu","Lỗi",JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnTinhDienActionPerformed

    private void BtnTinhInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTinhInternetActionPerformed
        // TODO add your handling code here:
        int soThang = Integer.parseInt(txtSoThang.getText());
        
        if(soThang > 12){
            JOptionPane.showMessageDialog(null,"Số tháng không được lớn hơn 12","Lỗi",JOptionPane.OK_OPTION);
        }else{
            CollectMoneyInternet t = new CollectMoneyInternet();
            t.setSoThang(soThang);
            double money;
            money = t.caculateMoney();
            System.out.println(money);
            txtKqIntermet.setText(Double.toString(money));
        }
    }//GEN-LAST:event_BtnTinhInternetActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai2_tiendien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai2_tiendien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai2_tiendien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai2_tiendien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bai2_tiendien main = new Bai2_tiendien();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTinhInternet;
    private javax.swing.JDesktopPane TienDien;
    private javax.swing.JDesktopPane TienInternet;
    private javax.swing.JButton btnTinhDien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCuoi;
    private javax.swing.JTextField txtDau;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtKqIntermet;
    private javax.swing.JTextField txtSoThang;
    // End of variables declaration//GEN-END:variables
}
