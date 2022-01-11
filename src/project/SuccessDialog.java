// package project;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class SuccessDialog extends javax.swing.JFrame {

    /**
     * Creates new form SuccessDialog
     */
    public SuccessDialog(String message) {
        this.setAlwaysOnTop(true);
        initComponents();
        jLabel4.setText(message);
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/undraw_done_a34v 1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 202, 138);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 99, 255));
        jLabel3.setText("Success!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 100, 95, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 140, 146, 20);

        jToggleButton5.setBackground(new java.awt.Color(108, 99, 255));
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setText("OK");
        jToggleButton5.setBorder(null);
        jToggleButton5.setBorderPainted(false);
        jToggleButton5.setFocusPainted(false);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(340, 250, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Desktop - 6.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 451, 300);

        setSize(new java.awt.Dimension(463, 312));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton5ActionPerformed
        this.setVisible(false);
    }// GEN-LAST:event_jToggleButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuccessDialog("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables
}