/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.student_details;

import com.spm.timetablemanagement.models.GroupNo;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hvdil
 */
public class enterGNo extends javax.swing.JPanel {

    Connection connection;
    private int gnId;
    PreparedStatement pstGn;
    ResultSet rs;
    /**
     * Creates new form enterGNo
     */
    public enterGNo() {
        initComponents();
        showGNList();
        txt_id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_gNo = new javax.swing.JTextField();
        txt_error = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_addGno = new javax.swing.JButton();
        btn_editGn = new javax.swing.JButton();
        btn_deleteGn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Gn = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();

        setBackground(new java.awt.Color(186, 148, 243));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 148, 243));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setAlignmentY(0.0F);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Group Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txt_gNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_gNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_gNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gNoActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 51, 51));
        txt_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btn_addGno.setBackground(new java.awt.Color(255, 255, 255));
        btn_addGno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_addGno.setForeground(new java.awt.Color(51, 51, 51));
        btn_addGno.setText("Instert");
        btn_addGno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addGno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addGnoActionPerformed(evt);
            }
        });
        jPanel4.add(btn_addGno);

        btn_editGn.setBackground(new java.awt.Color(255, 255, 255));
        btn_editGn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_editGn.setText("Update");
        btn_editGn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editGnActionPerformed(evt);
            }
        });
        jPanel4.add(btn_editGn);

        btn_deleteGn.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteGn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteGn.setText("Delete");
        btn_deleteGn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteGnActionPerformed(evt);
            }
        });
        jPanel4.add(btn_deleteGn);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_gNo, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                    .addComponent(txt_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_gNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 720, 250));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tbl_Gn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_Gn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Gn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_GnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Gn);
        if (tbl_Gn.getColumnModel().getColumnCount() > 0) {
            tbl_Gn.getColumnModel().getColumn(0).setResizable(false);
            tbl_Gn.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 480, 411));

        txt_id.setText("ID");
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 26, 33));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 820, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_GnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_GnMouseClicked
        // TODO add your handling code here:
        int i = tbl_Gn.getSelectedRow();
        TableModel model = tbl_Gn.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_gNo.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_tbl_GnMouseClicked

    private void btn_deleteGnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteGnActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        int whileWorking = 0;

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_Gn.getModel();
            Statement smt = connection.createStatement();
            
            if(txt_gNo.getText().equals("")){
                txt_error.setText("Select Group Number**");
            }
            else{
                txt_error.setText("");
             
            
            String getGnQuery = "select gId from generated_group_id WHERE gnoId = '"+id+"'";
            pstGn = connection.prepareStatement(getGnQuery);
            rs = pstGn.executeQuery();
            while(rs.next())
            {    

                    int x = JOptionPane.showConfirmDialog(this,"You have this related data,is it ok?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (x == 0){
                        ResultSet rs = smt.executeQuery("select id from generated_group_id where gnoId = "+id);
                        String id_G="";
                        while(rs.next()){
                            id_G = rs.getString(1);
                            System.out.println(id_G);
                        }
                        smt.execute("DELETE FROM generated_sub_group_id WHERE gId = '"+id_G+"'");
                        smt.execute("DELETE FROM generated_group_id WHERE gnoId = "+id); 
                        smt.execute("DELETE FROM group_number WHERE id = "+id);
                        smt.execute("DELETE FROM all_details WHERE gNo = '"+txt_gNo.getText().toString()+"'");
                        
                        JOptionPane.showMessageDialog(this, "Record Deleted!");

                        
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Delete Canceled!");
                        
                    }
                    whileWorking++;
                
            }
            if(whileWorking == 0){
                smt.execute("DELETE FROM group_number WHERE id = "+id);
                JOptionPane.showMessageDialog(this, "Record Deleted!");

            }
            model.setRowCount(0);
            showGNList();
            txt_gNo.setText("");

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deleteGnActionPerformed

    private void btn_editGnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editGnActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();

        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_Gn.getModel();
            Statement smt = connection.createStatement();

            if(txt_gNo.getText().equals("")){
                txt_error.setText("Select Group Number*");
            }
            else{
                txt_error.setText("");

                smt.execute("UPDATE group_number SET gNo = '"+txt_gNo.getText()+"' WHERE id = "+id);
                model.setRowCount(0);
                showGNList();
                txt_gNo.setText("");
                JOptionPane.showMessageDialog(this, "Record Updated!");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_editGnActionPerformed

    private void btn_addGnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addGnoActionPerformed
        // TODO add your handling code here:
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_Gn.getModel();
            connection = DBconnection.getConnection();

            if(txt_gNo.getText().equals("")){
                txt_error.setText("Enter Group Number*");
            }
            else{
                txt_error.setText("");

                PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_GROUP_NUMBER_TABLE));

                statement.setString(1, txt_gNo.getText());

                statement.executeUpdate();
                model.setRowCount(0);
                showGNList();
                txt_gNo.setText("");
                JOptionPane.showMessageDialog(null, "Inserting Successful!");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_addGnoActionPerformed

    private void txt_gNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gNoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_gNoActionPerformed

    public ArrayList<GroupNo> getGNList()
    {
        ArrayList<GroupNo> list = new ArrayList<GroupNo>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from group_number";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        GroupNo groupN;
        while(rs.next())
        {
            groupN = new GroupNo(rs.getInt("id"), rs.getString("gNo"));
            list.add(groupN);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showGNList()
    {
        ArrayList<GroupNo> list = getGNList();
        DefaultTableModel model = (DefaultTableModel)tbl_Gn.getModel();
        Object[] row = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getGn();
            
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addGno;
    private javax.swing.JButton btn_deleteGn;
    private javax.swing.JButton btn_editGn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Gn;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_gNo;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
