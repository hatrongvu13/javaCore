/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.BanHang;

import Models.Loai;
import Models.Mon;
import Models.goimon;
import SQL.connect;
import java.awt.Event;
import java.awt.ItemSelectable;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hatro
 */
public class jpChonMon extends javax.swing.JPanel {

    Vector header = new Vector();
    Vector data = new Vector();
    /**
     * Creates new form jpChonMon
     */
    int maban = -1;
    public jpChonMon(int maban) {
        initComponents();
        this.maban = maban;
        header.add("Tên món");
        header.add("Số lượng");
        header.add("Đơn giá");
        DefaultTableModel model = (DefaultTableModel) jtbMon.getModel();
        model.setDataVector(data, header);
        System.out.println(maban);
        addLoaiMon();
        getdata();
    }

    public void getdata(){
        connect conn = new connect("root", "", "ql_cafe");
        conn.getConnect();
        ArrayList<goimon> arr = null;
        arr = conn.getGoiMon();
        DefaultTableModel model = (DefaultTableModel) jtbMon.getModel();
        if (arr!=null) {
            System.out.println("lay dc ròi");
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getIdban()== maban) {
                    Vector row = new Vector();
                    row.add(arr.get(i).getTenmon());
                    row.add(arr.get(i).getSoluong());
                    row.add(arr.get(i).getDongia());
                    data.add(row);
                }
            }
        }else{
            data = new Vector();
            System.out.println("khong lay dc cai vejop gif car");
        }
        model.setDataVector(data, header);
        data = new Vector();
    }
    public void addLoaiMon(){
        connect conn = new connect("root", "", "ql_cafe");
        conn.getConnect();
        ArrayList<Loai> arr = null;
        arr = conn.getLoai();
        System.out.println(arr.size());
        if (arr!= null) {
            for (int i = 0; i < arr.size(); i++) {
                this.cbLoai.addItem(arr.get(i).getNameLoai());
            }
        }
    }
    public int getIdFood(String nameFood){
         System.out.println(cbMon.getSelectedItem().toString());
        connect conn = new connect("root", "", "ql_cafe");
        conn.getConnect();
        int id = -1;
        ArrayList<Mon> arr = conn.getMon("");
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(nameFood)) {
                id = arr.get(i).getId();
            }
        }
        return id;
    }
    public int getdongia(String nameFood){
         System.out.println(cbMon.getSelectedItem().toString());
        connect conn = new connect("root", "", "ql_cafe");
        conn.getConnect();
        int id = -1;
        ArrayList<Mon> arr = conn.getMon("");
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(nameFood)) {
                id = arr.get(i).getDongia();
            }
        }
        return id;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAddMon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        number = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        cbLoai = new javax.swing.JComboBox();
        cbMon = new javax.swing.JComboBox();

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jtbMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên món", "Số lượng", "Đơn giá", "Khuyến mãi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbMon);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAddMon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddMon.setText("Thêm");
        btnAddMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên món :");

        jLabel2.setText("Số lượng :");

        number.setModel(new javax.swing.SpinnerNumberModel(0, -100, 100, 1));

        jLabel3.setText("Loại đồ uống :");

        cbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51)
                .addComponent(btnAddMon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAddMon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiActionPerformed
        System.out.println("ababcabcac");
        System.out.println(cbLoai.getSelectedIndex());
        this.cbMon.removeAllItems();
        connect conn = new connect("root", "", "ql_cafe");
        conn.getConnect();
        ArrayList<Mon> arr = conn.getMontheoNhom(cbLoai.getSelectedIndex());
        System.out.println(arr.size());
        if (arr!= null) {
            for (int i = 0; i < arr.size(); i++) {
                this.cbMon.addItem(arr.get(i).getName());
            }
        }
        arr = new ArrayList<Mon>();
    }//GEN-LAST:event_cbLoaiActionPerformed

    private void btnAddMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMonActionPerformed
        // TODO add your handling code here:
        String tenmon = cbMon.getSelectedItem().toString();
        int id = getIdFood(tenmon);
        int dg = getdongia(tenmon);
        int soluong = 0;
        soluong = (int) number.getValue();
        System.out.println(id);
        System.out.println(dg);
        System.out.println(" max ban "+maban);
        goimon gm = new goimon(tenmon, soluong, id, dg, maban);
        connect conn = new connect("root", "", "ql_cafe");
        conn.getConnect();
        conn.addGoiMon(gm);
        getdata();
    }//GEN-LAST:event_btnAddMonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMon;
    private javax.swing.JComboBox cbLoai;
    private javax.swing.JComboBox cbMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbMon;
    private javax.swing.JSpinner number;
    // End of variables declaration//GEN-END:variables
}
