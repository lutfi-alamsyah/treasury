// package project;

// import project.service.PersonService;
// import project.service.DebtService;
import service.PersonService;
import service.DebtService;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class DebtAdd extends javax.swing.JFrame {
        PersonService pService = new PersonService();

        /**
         * Creates new form DebtAdd
         */
        public DebtAdd() {
                this.setExtendedState(DebtAdd.MAXIMIZED_BOTH);
                initComponents();
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
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jToggleButton3 = new javax.swing.JToggleButton();
                jToggleButton2 = new javax.swing.JToggleButton();
                jToggleButton1 = new javax.swing.JToggleButton();
                jToggleButton4 = new javax.swing.JToggleButton();
                jPanel4 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jToggleButton7 = new javax.swing.JToggleButton();
                jTextField2 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jToggleButton5 = new javax.swing.JToggleButton();
                jComboBox2 = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setAutoRequestFocus(false);
                getContentPane().setLayout(
                                new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setBackground(new java.awt.Color(108, 99, 255));
                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(108, 99, 255));
                jLabel1.setText("TreasuryM");

                jLabel2.setBackground(new java.awt.Color(196, 196, 196));
                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(196, 196, 196));
                jLabel2.setText("Main menu");

                jToggleButton3.setBackground(new java.awt.Color(108, 99, 255));
                jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton3.setForeground(new java.awt.Color(108, 99, 255));
                jToggleButton3.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/asset/icon/payments_black_24dp.png"))); // NOI18N
                jToggleButton3.setText("Debt menu");
                jToggleButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton3.setBorderPainted(false);
                jToggleButton3.setContentAreaFilled(false);
                jToggleButton3.setFocusPainted(false);
                jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton3ActionPerformed(evt);
                        }
                });

                jToggleButton2.setBackground(new java.awt.Color(197, 197, 197));
                jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton2.setForeground(new java.awt.Color(197, 197, 197));
                jToggleButton2.setText("Dashboard");
                jToggleButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton2.setBorderPainted(false);
                jToggleButton2.setContentAreaFilled(false);
                jToggleButton2.setFocusPainted(false);
                jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton2ActionPerformed(evt);
                        }
                });

                jToggleButton1.setBackground(new java.awt.Color(197, 197, 197));
                jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton1.setForeground(new java.awt.Color(197, 197, 197));
                jToggleButton1.setText("Management");
                jToggleButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton1.setBorderPainted(false);
                jToggleButton1.setContentAreaFilled(false);
                jToggleButton1.setFocusPainted(false);
                jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton1ActionPerformed(evt);
                        }
                });

                jToggleButton4.setBackground(new java.awt.Color(197, 197, 197));
                jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton4.setForeground(new java.awt.Color(197, 197, 197));
                jToggleButton4.setText("Person menu");
                jToggleButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jToggleButton4.setBorderPainted(false);
                jToggleButton4.setContentAreaFilled(false);
                jToggleButton4.setFocusPainted(false);
                jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton4ActionPerformed(evt);
                        }
                });

                jPanel4.setBackground(new java.awt.Color(108, 99, 255));
                jPanel4.setForeground(new java.awt.Color(108, 99, 255));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                5, Short.MAX_VALUE));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
                                                30, Short.MAX_VALUE));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(16, 16, 16)
                                                                .addComponent(jLabel2))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(78, 78, 78)
                                                                .addComponent(jLabel1))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(9, 9, 9)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jToggleButton2)
                                                                                                                .addComponent(jToggleButton1)
                                                                                                                .addComponent(jToggleButton4)))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jToggleButton3)))))
                                                .addContainerGap(84, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jLabel1)
                                                .addGap(31, 31, 31).addComponent(jLabel2).addGap(18, 18, 18)
                                                .addComponent(jToggleButton2).addGap(10, 10, 10)
                                                .addComponent(jToggleButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jToggleButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jToggleButton3).addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(263, 263, 263)));

                jPanel3.setBackground(new java.awt.Color(108, 99, 255));

                jToggleButton7.setBackground(new java.awt.Color(0, 0, 0));
                jToggleButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
                jToggleButton7.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/asset/icon/arrow_back_ios_new_black_24dp 2.png"))); // NOI18N
                jToggleButton7.setText(" Add data");
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
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(307, 307, 307)
                                                                .addComponent(jToggleButton7)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
                                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(12, Short.MAX_VALUE)));

                jTextField2.setToolTipText("");

                jLabel4.setText("Peminjam");

                jLabel6.setText("Jumlah pinjaman");

                jToggleButton5.setBackground(new java.awt.Color(108, 99, 255));
                jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
                jToggleButton5.setIcon(
                                new javax.swing.ImageIcon(getClass().getResource("/asset/icon/add_black_24dp 2.png"))); // NOI18N
                jToggleButton5.setText("Add data");
                jToggleButton5.setBorder(null);
                jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton5ActionPerformed(evt);
                        }
                });

                jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
                jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(pService.getName()));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jTextField2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                460,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6)
                                                                .addComponent(jToggleButton5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                97,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                210,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(141, Short.MAX_VALUE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62).addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                getContentPane().add(jPanel1);

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton7ActionPerformed
                new Debt().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton7ActionPerformed

        private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton4ActionPerformed
                new Person().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton4ActionPerformed

        private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton5ActionPerformed
                // TODO add your handling code here:
                DebtService ds = new DebtService();
                Integer cbSelected = jComboBox2.getSelectedIndex();
                Integer person_id = pService.idData[cbSelected];

                String message = ds.insertData(person_id, jTextField2.getText(), "belum");
                new Debt(message).setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton5ActionPerformed

        private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
                // TODO add your handling code here:
                new Management().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton1ActionPerformed

        private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton2ActionPerformed
                // TODO add your handling code here:
                new Dashboard().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton2ActionPerformed

        private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton3ActionPerformed
                new Debt().setVisible(true);
                this.setVisible(false);
        }// GEN-LAST:event_jToggleButton3ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                DebtAdd frame = new DebtAdd();
                                frame.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel6;
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
        private javax.swing.JToggleButton jToggleButton7;
        // End of variables declaration//GEN-END:variables
}
