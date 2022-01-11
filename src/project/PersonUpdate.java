/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package project;

// import project.service.PersonService;
import java.sql.ResultSet;

import service.PersonService;

/**
 *
 * @author USER
 */
public class PersonUpdate extends javax.swing.JFrame {
        int key;
        private String nama, catatan, alamat, phone_number;
        /**
         * Creates new form PersonUpdate
         */
        PersonService pService = new PersonService();

        public PersonUpdate() {
                this.setExtendedState(ManagementUpdate.MAXIMIZED_BOTH);
                initComponents();
        }

        public PersonUpdate(int row) {
                try {
                        ResultSet data = pService.getDetailData(row);

                        data.next();

                        key = data.getInt("id");
                        nama = data.getString("name");
                        catatan = data.getString("catatan");
                        alamat = data.getString("alamat");
                        phone_number = String.valueOf(data.getInt("phone_number"));
                } catch (Exception e) {
                        System.out.println(e);
                }

                this.setExtendedState(ManagementUpdate.MAXIMIZED_BOTH);
                initComponents();

                jTextField5.setText(nama);
                jTextField3.setText(alamat);
                jTextField4.setText(phone_number);
                jTextArea1.setText(catatan);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel9 = new javax.swing.JPanel();
                jPanel10 = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jToggleButton11 = new javax.swing.JToggleButton();
                jToggleButton12 = new javax.swing.JToggleButton();
                jToggleButton13 = new javax.swing.JToggleButton();
                jToggleButton14 = new javax.swing.JToggleButton();
                jPanel11 = new javax.swing.JPanel();
                jPanel12 = new javax.swing.JPanel();
                jToggleButton7 = new javax.swing.JToggleButton();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jToggleButton15 = new javax.swing.JToggleButton();
                jTextField5 = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea1 = new javax.swing.JTextArea();
                jToggleButton6 = new javax.swing.JToggleButton();
                jTextField4 = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(
                                new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));

                jLabel11.setBackground(new java.awt.Color(108, 99, 255));
                jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(108, 99, 255));
                jLabel11.setText("TreasuryM");

                jLabel12.setBackground(new java.awt.Color(196, 196, 196));
                jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(196, 196, 196));
                jLabel12.setText("Main menu");

                jToggleButton11.setBackground(new java.awt.Color(197, 197, 197));
                jToggleButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton11.setForeground(new java.awt.Color(197, 197, 197));
                jToggleButton11.setText("Debt menu");
                jToggleButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton11.setBorderPainted(false);
                jToggleButton11.setContentAreaFilled(false);
                jToggleButton11.setFocusPainted(false);
                jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton11ActionPerformed(evt);
                        }
                });

                jToggleButton12.setBackground(new java.awt.Color(197, 197, 197));
                jToggleButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton12.setForeground(new java.awt.Color(197, 197, 197));
                jToggleButton12.setText("Dashboard");
                jToggleButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton12.setBorderPainted(false);
                jToggleButton12.setContentAreaFilled(false);
                jToggleButton12.setFocusPainted(false);
                jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton12ActionPerformed(evt);
                        }
                });

                jToggleButton13.setBackground(new java.awt.Color(197, 197, 197));
                jToggleButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton13.setForeground(new java.awt.Color(197, 197, 197));
                jToggleButton13.setText("Management");
                jToggleButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton13.setBorderPainted(false);
                jToggleButton13.setContentAreaFilled(false);
                jToggleButton13.setFocusPainted(false);
                jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton13ActionPerformed(evt);
                        }
                });

                jToggleButton14.setBackground(new java.awt.Color(108, 99, 255));
                jToggleButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton14.setForeground(new java.awt.Color(108, 99, 255));
                jToggleButton14.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/asset/icon/people_black_24dp.png"))); // NOI18N
                jToggleButton14.setText("Person menu");
                jToggleButton14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton14.setBorderPainted(false);
                jToggleButton14.setContentAreaFilled(false);
                jToggleButton14.setFocusPainted(false);
                jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton14ActionPerformed(evt);
                        }
                });

                jPanel11.setBackground(new java.awt.Color(108, 99, 255));
                jPanel11.setForeground(new java.awt.Color(108, 99, 255));

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                5, Short.MAX_VALUE));
                jPanel11Layout.setVerticalGroup(
                                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                30, Short.MAX_VALUE));

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(jPanel10Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup().addGroup(jPanel10Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel10Layout.createSequentialGroup().addGap(16, 16, 16)
                                                                .addComponent(jLabel12))
                                                .addGroup(jPanel10Layout.createSequentialGroup().addGap(78, 78, 78)
                                                                .addComponent(jLabel11))
                                                .addGroup(jPanel10Layout.createSequentialGroup().addGap(22, 22, 22)
                                                                .addComponent(jPanel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jToggleButton12)
                                                                                .addComponent(jToggleButton13)
                                                                                .addComponent(jToggleButton14)))
                                                .addGroup(jPanel10Layout.createSequentialGroup().addGap(35, 35, 35)
                                                                .addComponent(jToggleButton11)))
                                                .addContainerGap(84, Short.MAX_VALUE)));
                jPanel10Layout.setVerticalGroup(jPanel10Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup().addGap(14, 14, 14)
                                                .addComponent(jLabel11).addGap(31, 31, 31).addComponent(jLabel12)
                                                .addGap(18, 18, 18).addComponent(jToggleButton12).addGap(10, 10, 10)
                                                .addComponent(jToggleButton13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jToggleButton14).addComponent(jPanel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jToggleButton11).addGap(266, 266, 266)));

                jPanel12.setBackground(new java.awt.Color(108, 99, 255));

                jToggleButton7.setBackground(new java.awt.Color(0, 0, 0));
                jToggleButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
                jToggleButton7.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/asset/icon/arrow_back_ios_new_black_24dp 2.png"))); // NOI18N
                jToggleButton7.setText(" Update data");
                jToggleButton7.setBorder(null);
                jToggleButton7.setBorderPainted(false);
                jToggleButton7.setContentAreaFilled(false);
                jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton7ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel12Layout.createSequentialGroup().addGap(314, 314, 314)
                                                                .addComponent(jToggleButton7)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel12Layout.setVerticalGroup(jPanel12Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(12, Short.MAX_VALUE)));

                jLabel14.setText("Peminjam");

                jLabel15.setText("Catatan");

                jToggleButton15.setBackground(new java.awt.Color(108, 99, 255));
                jToggleButton15.setForeground(new java.awt.Color(255, 255, 255));
                jToggleButton15.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/asset/icon/edit_black_24dp 2.png"))); // NOI18N
                jToggleButton15.setText("Update data");
                jToggleButton15.setBorder(null);
                jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton15ActionPerformed(evt);
                        }
                });

                jTextField5.setToolTipText("");

                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);

                jToggleButton6.setBackground(new java.awt.Color(245, 0, 87));
                jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
                jToggleButton6.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/asset/icon/delete_black_24dp 2.png"))); // NOI18N
                jToggleButton6.setText("Delete data");
                jToggleButton6.setBorder(null);
                jToggleButton6.setBorderPainted(false);
                jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton6ActionPerformed(evt);
                        }
                });

                jTextField4.setToolTipText("");

                jLabel8.setText("No. telephone");

                jTextField3.setToolTipText("");

                jLabel7.setText("Alamat");

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(jPanel9Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel14)
                                                                .addComponent(jTextField5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                460,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel15)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                460,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                                .addComponent(jToggleButton15,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                116,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(32, 32, 32)
                                                                                .addComponent(jToggleButton6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                114,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel7)
                                                                .addComponent(jTextField3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                460,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel8).addComponent(jTextField4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                460,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(74, Short.MAX_VALUE))
                                .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel9Layout.setVerticalGroup(jPanel9Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31).addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jToggleButton15,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jToggleButton6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                getContentPane().add(jPanel9);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton7ActionPerformed
                new Person().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton7ActionPerformed

        private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton11ActionPerformed
                new Debt().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton11ActionPerformed

        private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton12ActionPerformed
                new Dashboard().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton12ActionPerformed

        private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton13ActionPerformed
                new Management().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton13ActionPerformed

        private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton14ActionPerformed
                new Person().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton14ActionPerformed

        private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton15ActionPerformed
                String message = pService.updateData(key, jTextField3.getText(),
                                Integer.parseInt(jTextField4.getText()), jTextField5.getText(), jTextArea1.getText());
                new Person(message).setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton15ActionPerformed

        private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton6ActionPerformed
                this.setVisible(false);
                new ConfirmDialog("person", key).setVisible(true);
        }// GEN-LAST:event_jToggleButton6ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new PersonUpdate().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JToggleButton jToggleButton11;
        private javax.swing.JToggleButton jToggleButton12;
        private javax.swing.JToggleButton jToggleButton13;
        private javax.swing.JToggleButton jToggleButton14;
        private javax.swing.JToggleButton jToggleButton15;
        private javax.swing.JToggleButton jToggleButton6;
        private javax.swing.JToggleButton jToggleButton7;
        // End of variables declaration//GEN-END:variables
}