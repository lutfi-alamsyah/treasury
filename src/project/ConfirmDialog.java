package project;

import project.service.DebtService;
import project.service.PersonService;
import project.service.TreasurySetService;
import project.service.ManagementService;
// import service.DebtService;
// import service.PersonService;
// import service.ManagementService;
// import service.TreasurySetService;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class ConfirmDialog extends javax.swing.JFrame {
    int key;
    String menu = "";

    DebtService ds = new DebtService();
    PersonService pService = new PersonService();
    ManagementService mService = new ManagementService();
    TreasurySetService tService = new TreasurySetService();

    /**
     * Creates new form ConfirmDialog
     */
    public ConfirmDialog() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    public ConfirmDialog(String menu, int key) {
        this.menu = menu;
        this.key = key;
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Group 8.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 190, 190);

        jToggleButton6.setBackground(new java.awt.Color(197, 197, 197));
        jToggleButton6.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton6.setText("Cancel");
        jToggleButton6.setBorder(null);
        jToggleButton6.setBorderPainted(false);
        jToggleButton6.setFocusPainted(false);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(240, 260, 90, 30);

        jToggleButton7.setBackground(new java.awt.Color(245, 0, 87));
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setText("Delete");
        jToggleButton7.setBorder(null);
        jToggleButton7.setBorderPainted(false);
        jToggleButton7.setFocusPainted(false);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton7);
        jToggleButton7.setBounds(350, 260, 90, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 99, 255));
        jLabel3.setText("Data ini akan dihapus!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 100, 220, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Yakin untuk menghapus data ini?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 140, 210, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Desktop - 6.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 450, 300);

        setSize(new java.awt.Dimension(471, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton6ActionPerformed
        if (menu == "debt") {
            new DebtUpdate(key).setVisible(true);
            this.setVisible(false);
        } else if (menu == "management") {
            new ManagementUpdate(key).setVisible(true);
            this.setVisible(false);
        } else if (menu == "person") {
            new PersonUpdate(key).setVisible(true);
            this.setVisible(false);
        } else if (menu == "treasury_set") {
            String message = tService.destroyData(key);
            new TreasurySet(message).setVisible(true);
            this.setVisible(false);
        }
    }// GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton7ActionPerformed
        if (menu == "debt") {
            String message = ds.destroyData(key);
            new Debt(message).setVisible(true);
            this.setVisible(false);
        } else if (menu == "management") {
            String message = mService.destroyData(key);
            new Management(message).setVisible(true);
            this.setVisible(false);
        } else if (menu == "person") {
            String message = pService.destroyData(key);
            new Person(message).setVisible(true);
            this.setVisible(false);
        } else if (menu == "treasury_set") {
            String message = tService.destroyData(key);
            new TreasurySet(message).setVisible(true);
            this.setVisible(false);
        }
    }// GEN-LAST:event_jToggleButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    // End of variables declaration//GEN-END:variables
}
