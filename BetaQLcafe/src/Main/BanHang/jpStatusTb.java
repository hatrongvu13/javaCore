/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.BanHang;

import javax.swing.JPanel;

/**
 *
 * @author hatro
 */
public class jpStatusTb extends javax.swing.JPanel {

    /**
     * Creates new form jpStatusTb
     */
    public jpStatusTb() {
        initComponents();
    }

    public JPanel jp;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JChonMon = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        Tbname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbStatus = new javax.swing.JLabel();
        jpBan_mac_dinh = new javax.swing.JPanel();
        btnDatBan = new javax.swing.JButton();
        btnGoiMon = new javax.swing.JButton();
        jpBan_co_nguoi = new javax.swing.JPanel();

        JChonMon.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Title.setBackground(new java.awt.Color(153, 153, 153));

        Tbname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Tbname.setForeground(new java.awt.Color(153, 0, 0));
        Tbname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tbname.setText("Bàn");

        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Status : ");

        tbStatus.setForeground(new java.awt.Color(51, 0, 51));
        tbStatus.setText("trống ... có người .... đặt trước .. có người");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitleLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TitleLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Tbname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addComponent(Tbname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnDatBan.setText("Đặt bàn");

        btnGoiMon.setText("Gọi món");
        btnGoiMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoiMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBan_mac_dinhLayout = new javax.swing.GroupLayout(jpBan_mac_dinh);
        jpBan_mac_dinh.setLayout(jpBan_mac_dinhLayout);
        jpBan_mac_dinhLayout.setHorizontalGroup(
            jpBan_mac_dinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBan_mac_dinhLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnGoiMon)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jpBan_mac_dinhLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDatBan, btnGoiMon});

        jpBan_mac_dinhLayout.setVerticalGroup(
            jpBan_mac_dinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBan_mac_dinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBan_mac_dinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoiMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpBan_mac_dinhLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDatBan, btnGoiMon});

        javax.swing.GroupLayout jpBan_co_nguoiLayout = new javax.swing.GroupLayout(jpBan_co_nguoi);
        jpBan_co_nguoi.setLayout(jpBan_co_nguoiLayout);
        jpBan_co_nguoiLayout.setHorizontalGroup(
            jpBan_co_nguoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpBan_co_nguoiLayout.setVerticalGroup(
            jpBan_co_nguoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBan_co_nguoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpBan_mac_dinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBan_mac_dinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBan_co_nguoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JChonMon, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JChonMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoiMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoiMonActionPerformed
        // TODO add your handling code here:
        jp = new jpChonMon();
        JChonMon.removeAll();
        JChonMon.add(jp);
        JChonMon.updateUI();
    }//GEN-LAST:event_btnGoiMonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JChonMon;
    private javax.swing.JLabel Tbname;
    private javax.swing.JPanel Title;
    private javax.swing.JButton btnDatBan;
    private javax.swing.JButton btnGoiMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpBan_co_nguoi;
    private javax.swing.JPanel jpBan_mac_dinh;
    private javax.swing.JLabel tbStatus;
    // End of variables declaration//GEN-END:variables
}
