/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.BanHang.jpBanHang;
import Main.Home.JpTrangChu;
import javax.swing.JPanel;
/**
 *
 * @author hatro
 */
public class fmMain extends javax.swing.JFrame {

    public JPanel jp;
    /**
     * Creates new form fmMain
     */
    public fmMain() {
        initComponents();
        jp = new JpTrangChu();
        JpHome.removeAll();
        JpHome.add(jp);
        JpHome.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpHome = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnQuanLy = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jpTime = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JLname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpHome.setLayout(new java.awt.BorderLayout());

        btnTrangChu.setText("Trang chủ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnBanHang.setText("Bán hàng");
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnQuanLy.setText("Quản lý");
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });

        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnKho.setText("Kho");
        btnKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoActionPerformed(evt);
            }
        });

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTimeLayout = new javax.swing.GroupLayout(jpTime);
        jpTime.setLayout(jpTimeLayout);
        jpTimeLayout.setHorizontalGroup(
            jpTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        jpTimeLayout.setVerticalGroup(
            jpTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jLabel1.setText("Xin chào :");

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnBanHang)
                .addGap(62, 62, 62)
                .addComponent(btnQuanLy)
                .addGap(86, 86, 86)
                .addComponent(btnThongKe)
                .addGap(77, 77, 77)
                .addComponent(btnKho)
                .addGap(41, 41, 41)
                .addComponent(jpTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDangXuat)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JLname, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBanHang, btnKho, btnQuanLy, btnThongKe, btnTrangChu});

        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLy)
                            .addComponent(btnThongKe)
                            .addComponent(btnKho)
                            .addComponent(btnBanHang))
                        .addComponent(jpTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(JLname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDangXuat)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jpMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBanHang, btnKho, btnQuanLy, btnThongKe, btnTrangChu});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JpHome, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
        jp = new JpTrangChu();
        JpHome.removeAll();
        JpHome.add(jp);
        JpHome.updateUI();
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        jp = new jpBanHang();
        JpHome.removeAll();
        JpHome.add(jp);
        JpHome.updateUI();
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Program.lg();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        // TODO add your handling code here:
        JpHome.removeAll();
        JpHome.updateUI();
    }//GEN-LAST:event_btnQuanLyActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        JpHome.removeAll();
        JpHome.updateUI();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoActionPerformed
        // TODO add your handling code here:
        JpHome.removeAll();
        JpHome.updateUI();
    }//GEN-LAST:event_btnKhoActionPerformed

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
            java.util.logging.Logger.getLogger(fmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLname;
    private javax.swing.JPanel JpHome;
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnQuanLy;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpTime;
    // End of variables declaration//GEN-END:variables
}