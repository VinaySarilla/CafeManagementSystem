package CafeManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import CafeManagementSystem.Sign_up;
import CafeManagementSystem.Report;
import CafeManagementSystem.Employee;
import CafeManagementSystem.Items;
import CafeManagementSystem.Billing;

public class WelcomeFrame extends javax.swing.JFrame {

    public WelcomeFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Billing = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Attendence = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Employee = new javax.swing.JButton();
        Add_Item = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Summary = new javax.swing.JButton();
        Payroll = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setBounds(new java.awt.Rectangle(5, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Billing");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 40, -1));

        Billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Cash-register-icon (1).png"))); // NOI18N
        Billing.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingActionPerformed(evt);
            }
        });
        getContentPane().add(Billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 250, 170));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Attendance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Item");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 80, -1));

        Attendence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/distributor-report-icon.png"))); // NOI18N
        Attendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendenceActionPerformed(evt);
            }
        });
        getContentPane().add(Attendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, 170));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee Confiure");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Preppy-icon.png"))); // NOI18N
        Employee.setToolTipText("");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, 170));

        Add_Item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Document-Add-icon.png"))); // NOI18N
        Add_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ItemActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 250, 170));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Summary");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Payroll");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 60, -1));

        Summary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Book-icon.png"))); // NOI18N
        Summary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummaryActionPerformed(evt);
            }
        });
        getContentPane().add(Summary, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 230, 180));

        Payroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Money-Graph-icon.png"))); // NOI18N
        Payroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayrollActionPerformed(evt);
            }
        });
        getContentPane().add(Payroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 250, 180));

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Apps-session-logout-icon (1).png"))); // NOI18N
        LogOut.setOpaque(false);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 620, 60, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Log Out");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 680, 60, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Account");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 100, 60, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Settings-L-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 80, 80));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/nnn.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingActionPerformed
       Billing b  = new Billing();
       b.setVisible(true);
    }//GEN-LAST:event_BillingActionPerformed

    private void AttendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendenceActionPerformed
       Attendance a = new Attendance();
       a.setVisible(true);
    }//GEN-LAST:event_AttendenceActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
      Employee e = new Employee();
      e.setVisible(true);   
    }//GEN-LAST:event_EmployeeActionPerformed

    private void Add_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ItemActionPerformed
      Items i = new Items();
      i.setVisible(true);
    }//GEN-LAST:event_Add_ItemActionPerformed

    private void SummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummaryActionPerformed
      Report r = new Report();
      r.setVisible(true);
    }//GEN-LAST:event_SummaryActionPerformed

    private void PayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayrollActionPerformed
    Payroll p = new Payroll();
    p.setVisible(true);
    }//GEN-LAST:event_PayrollActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
    //   System.exit(0);
      //setVisible(false);

      java.awt.Window win[] = java.awt.Window.getWindows();
for(int i=0;i<win.length;i++){
win[i].dispose();
}
 LoginFrame lf = new LoginFrame();
lf.setVisible(true);
      
    }//GEN-LAST:event_LogOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Sign_up su = new Sign_up();
       su.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (doubleroduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Item;
    private javax.swing.JButton Attendence;
    private javax.swing.JButton Billing;
    private javax.swing.JButton Employee;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Payroll;
    private javax.swing.JButton Summary;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
