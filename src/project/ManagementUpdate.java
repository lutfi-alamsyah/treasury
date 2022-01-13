package project;

import project.service.ManagementService;
import project.service.PersonService;
import project.service.TreasurySetService;

import java.sql.ResultSet;

// import service.ManagementService;
// import service.PersonService;
// import service.TreasurySetService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ManagementUpdate extends javax.swing.JFrame {
    private int key, person_id, treasury_set_id;
    private String nama, nama_set, total_bayar, kekurangan, status;

    ManagementService mService = new ManagementService();
    TreasurySetService tService = new TreasurySetService();
    PersonService pService = new PersonService();

    /**
     * Creates new form ManagementUpdate
     */
    public ManagementUpdate() {
        this.setExtendedState(ManagementUpdate.MAXIMIZED_BOTH);
        initComponents();
    }

    public ManagementUpdate(int row) {
        try {
            ResultSet data = mService.getDetailData(row);

            data.next();

            key = data.getInt("id");
            person_id = data.getInt("person_id");
            treasury_set_id = data.getInt("set_id");
            nama = data.getString("name");
            nama_set = data.getString("set_name");
            total_bayar = data.getString("total_bayar");
            kekurangan = data.getString("kekurangan");
            status = data.getString("status");
        } catch (Exception e) {
            System.out.println(e);
        }

        this.setExtendedState(ManagementUpdate.MAXIMIZED_BOTH);
        initComponents();

        jComboBox2.setSelectedItem(nama);
        jComboBox3.setSelectedItem(nama_set);
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(108, 99, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 99, 255));
        jLabel1.setText("TreasuryM");

        jLabel2.setBackground(new java.awt.Color(196, 196, 196));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(196, 196, 196));
        jLabel2.setText("Main menu");

        jToggleButton2.setBackground(new java.awt.Color(197, 197, 197));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(197, 197, 197));
        jToggleButton2.setText("Dashboard");
        jToggleButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(108, 99, 255));
        jPanel4.setForeground(new java.awt.Color(108, 99, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 5, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 30, Short.MAX_VALUE));

        jToggleButton1.setBackground(new java.awt.Color(108, 99, 255));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(108, 99, 255));
        jToggleButton1.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/asset/icon/account_balance_wallet_black_24dp.png"))); // NOI18N
        jToggleButton1.setText("Management");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(197, 197, 197));
        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(197, 197, 197));
        jToggleButton3.setText("Person menu");
        jToggleButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setContentAreaFilled(false);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(197, 197, 197));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(197, 197, 197));
        jToggleButton4.setText("Debt menu");
        jToggleButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.setContentAreaFilled(false);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(16, 16, 16).addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jToggleButton2))
                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(78, 78, 78).addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jToggleButton3).addComponent(jToggleButton4)
                                        .addComponent(jToggleButton1))))
                        .addContainerGap(84, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLabel1)
                        .addGap(31, 31, 31).addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2).addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1))
                        .addGap(18, 18, 18).addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton4).addContainerGap(258, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(108, 99, 255));

        jToggleButton7.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/asset/icon/arrow_back_ios_new_black_24dp 2.png"))); // NOI18N
        jToggleButton7.setText(" Update data");
        jToggleButton7.setBorder(null);
        jToggleButton7.setBorderPainted(false);
        jToggleButton7.setContentAreaFilled(false);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addGap(307, 307, 307).addComponent(jToggleButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel6.setText("Total bayar");

        jTextField2.setText(total_bayar);
        jTextField2.setToolTipText("");

        jToggleButton5.setBackground(new java.awt.Color(108, 99, 255));
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon/edit_black_24dp 2.png"))); // NOI18N
        jToggleButton5.setText("Update data");
        jToggleButton5.setBorder(null);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(245, 0, 87));
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icon/delete_black_24dp 2.png"))); // NOI18N
        jToggleButton6.setText("Delete data");
        jToggleButton6.setBorder(null);
        jToggleButton6.setBorderPainted(false);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Orang");

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(pService.getName()));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(tService.getName()));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel9.setText("kas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4).addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(jToggleButton6,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(183, Short.MAX_VALUE))
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24).addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14).addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox3ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton7ActionPerformed
        new Management().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jToggleButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ConfirmDialog("management", key).setVisible(true);
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jCheckBox1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        new Management().setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        Integer cbSelected = jComboBox2.getSelectedIndex();
        Integer cbSelectedKas = jComboBox3.getSelectedIndex();

        Integer person_id = pService.idData[cbSelected];
        Integer kekurangan = tService.totalData[cbSelectedKas] - Integer.parseInt(jTextField2.getText());

        if (kekurangan <= 0) {
            kekurangan = 0;
            status = "lunas";
        } else {
            status = "belum";
        }

        String message = mService.updateData(key, treasury_set_id, person_id, Integer.parseInt(jTextField2.getText()),
                kekurangan, status);
        new Management(message).setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }// GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Person().setVisible(true);
    }// GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Debt().setVisible(true);
    }// GEN-LAST:event_jToggleButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManagementUpdate frame = new ManagementUpdate();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    // End of variables declaration//GEN-END:variables
}
