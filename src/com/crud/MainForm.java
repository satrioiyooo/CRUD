/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lepkom3-38
 */
public class MainForm extends javax.swing.JFrame {

    private final Koneksi connect;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        connect = new Koneksi();
        
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
        jPanel1 = new javax.swing.JPanel();
        lblNpmIns = new javax.swing.JLabel();
        lblNamaIns = new javax.swing.JLabel();
        lblKelasIns = new javax.swing.JLabel();
        LblUtsIns = new javax.swing.JLabel();
        lblUasIns = new javax.swing.JLabel();
        txtNpmIns = new javax.swing.JTextField();
        txtNamaIns = new javax.swing.JTextField();
        txtKelasIns = new javax.swing.JTextField();
        txtUtsIns = new javax.swing.JTextField();
        txtUasIns = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNpmIns1 = new javax.swing.JLabel();
        txtNpmSel = new javax.swing.JTextField();
        btnCariSelect = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        btnRefreshData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Mahasiswa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNpmIns.setText("NPM");

        lblNamaIns.setText("Nama");

        lblKelasIns.setText("Kelas");

        LblUtsIns.setText("UTS");

        lblUasIns.setText("UAS");

        btnTambah.setText("Tambahkan");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNpmIns)
                            .addComponent(lblNamaIns)
                            .addComponent(lblKelasIns)
                            .addComponent(LblUtsIns)
                            .addComponent(lblUasIns))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUasIns)
                            .addComponent(txtUtsIns)
                            .addComponent(txtKelasIns)
                            .addComponent(txtNamaIns)
                            .addComponent(txtNpmIns)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 373, Short.MAX_VALUE)
                        .addComponent(btnTambah)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNpmIns)
                    .addComponent(txtNpmIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamaIns)
                    .addComponent(txtNamaIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKelasIns)
                    .addComponent(txtKelasIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUtsIns)
                    .addComponent(txtUtsIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUasIns)
                    .addComponent(txtUasIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Insert", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNpmIns1.setText("NPM");

        txtNpmSel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNpmSelKeyReleased(evt);
            }
        });

        btnCariSelect.setText("Cari");
        btnCariSelect.setEnabled(false);
        btnCariSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNpmIns1)
                        .addGap(30, 30, 30)
                        .addComponent(txtNpmSel, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCariSelect)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNpmIns1)
                    .addComponent(txtNpmSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(btnCariSelect)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Select", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("NPM");

        jLabel2.setText("Nama");

        jLabel3.setText("Kelas");

        jLabel4.setText("UTS");

        jLabel5.setText("UAS");

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 151, Short.MAX_VALUE))
                    .addComponent(jTextField5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("NPM");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete", jPanel4);

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelData);

        btnRefreshData.setText("Refresh Data");
        btnRefreshData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefreshData)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnRefreshData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshDataActionPerformed
        String query = "SELECT * FROM `mhs`";
        ResultSet rs;
        int jumlahBaris = 0;
        
        try {
            rs = connect.getStatement().executeQuery(query);
            
            while (rs.next()) {
                jumlahBaris++;
            }
            
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        String[][] data = new String[jumlahBaris][5];
        String[] kolom = { "NPM", "Nama", "Kelas", "UTS", "UAS" };
        try {
            int i = 0;
            rs = connect.getStatement().executeQuery(query);
            
            while (rs.next()) {
                data[i][0] = rs.getString("npm");
                data[i][1] = rs.getString("nama");
                data[i][2] = rs.getString("kelas");
                data[i][3] = String.valueOf(rs.getInt("uts"));
                data[i][4] = String.valueOf(rs.getInt("uas"));
                i++;
            }
            
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            DefaultTableModel model = new DefaultTableModel(data, kolom);
            tabelData.setModel(model);
        }
    }//GEN-LAST:event_btnRefreshDataActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String query = "INSERT INTO `mhs` VALUES (?,?,?,?,?)";
        
        boolean fail = false; 
        String npm = txtNpmIns.getText();
        String nama = txtNamaIns.getText();
        String kelas = txtKelasIns.getText();
        int uts = Integer.parseInt(txtUtsIns.getText());
        int uas = Integer.parseInt(txtUasIns.getText());
        try {
            PreparedStatement ps = connect.getConnection().prepareStatement(query);
            ps.setString(1, npm);
            ps.setString(2, nama);
            ps.setString(3, kelas);
            ps.setInt(4, uts);
            ps.setInt(5, uas);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            fail = true;
            System.out.println(ex.getMessage());
        } finally {
            if (fail == true) {
                JOptionPane.showMessageDialog(null, "Insert gagal :( \nSilakan cek log");
            } else {
                JOptionPane.showMessageDialog(null, "Berhasil menambah data");
                
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCariSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariSelectActionPerformed
        String npm = txtNpmSel.getText();
        String query = "SELECT * FROM `mhs` WHERE `npm` = ?";
        ResultSet rs;
        int jumlahBaris = 0;
        
        try {
            PreparedStatement ps = connect.getConnection().prepareStatement(query);
            ps.setString(1, npm);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                jumlahBaris++;
            }
            
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal mencari NPM :( \nSilakan cek log");
            System.out.println(ex.getMessage());
        }
        
        if (jumlahBaris > 0) {
            String[][] data = new String[jumlahBaris][5];
            String[] kolom = { "NPM", "Nama", "Kelas", "UTS", "UAS" };
            try {
                int i = 0;
                PreparedStatement ps = connect.getConnection().prepareStatement(query);
                ps.setString(1, npm);
                rs = ps.executeQuery();

                while (rs.next()) {
                    data[i][0] = rs.getString("npm");
                    data[i][1] = rs.getString("nama");
                    data[i][2] = rs.getString("kelas");
                    data[i][3] = String.valueOf(rs.getInt("uts"));
                    data[i][4] = String.valueOf(rs.getInt("uas"));
                    i++;
                }

                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } finally {
                DefaultTableModel model = new DefaultTableModel(data, kolom);
                tabelData.setModel(model);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NPM tidak ditemukan");
        }
    }//GEN-LAST:event_btnCariSelectActionPerformed

    private void txtNpmSelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNpmSelKeyReleased
        if (txtNpmSel.getText().length() > 0) {
            btnCariSelect.setEnabled(true);
        } else {
            btnCariSelect.setEnabled(false);
        }
    }//GEN-LAST:event_txtNpmSelKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Koneksi connect = new Koneksi();
        
        String npm = jTextField1.getText();
        String nama, kelas, uts, uas;
        
        ResultSet data = null;
        
        String query = "select * from mhs where npm= '"+npm+"'";
        try{
            data = connect.getStatement().executeQuery(query);
            
            if(data.next()){
                nama=data.getString("nama");
                kelas=data.getString("kelas");
                uts=data.getString("uts");
                uas=data.getString("uas");
                
                jTextField2.setText(nama);
                jTextField3.setText(kelas);
                jTextField4.setText(uts);
                jTextField5.setText(uas);

            }
            else{
                JOptionPane.showMessageDialog(null, "data tidak ditemukan");
            }
            
        }catch(SQLException ex){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Koneksi connect = new Koneksi();
        
        String npm= jTextField1.getText();
        String nama= jTextField2.getText();
        String kelas= jTextField3.getText();
        String uts= jTextField4.getText();
        String uas= jTextField5.getText();
        
        String query =  "update mhs set nama ='"+nama+"', kelas ='"+kelas+"', uts='"+uts+"', uas ='"+uas+"' where npm ='"+npm+"'";
        
        try{
            connect.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "update berhasil");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "update gagal");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Koneksi connect = new Koneksi();
        
        String npm= jTextField6.getText();
        String query = "delete from mhs where npm= '"+npm+"'";
        
        try {
        int konfirmasi = JOptionPane.showConfirmDialog(null, "ingin dihapus?");
        
        if (konfirmasi == 0){
            
                connect.getStatement().executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            }
        }catch(SQLException ex){
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblUtsIns;
    private javax.swing.JButton btnCariSelect;
    private javax.swing.JButton btnRefreshData;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblKelasIns;
    private javax.swing.JLabel lblNamaIns;
    private javax.swing.JLabel lblNpmIns;
    private javax.swing.JLabel lblNpmIns1;
    private javax.swing.JLabel lblUasIns;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField txtKelasIns;
    private javax.swing.JTextField txtNamaIns;
    private javax.swing.JTextField txtNpmIns;
    private javax.swing.JTextField txtNpmSel;
    private javax.swing.JTextField txtUasIns;
    private javax.swing.JTextField txtUtsIns;
    // End of variables declaration//GEN-END:variables
}
