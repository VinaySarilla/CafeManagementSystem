package CafeManagementSystem;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import CafeManagementSystem.Emp_details;
import java.io.*;
import java.text.SimpleDateFormat;
import jxl.*;
public class Report extends javax.swing.JFrame {

Connection conn=null;
ResultSet rs = null;
PreparedStatement pst=null;
Calendar timer = Calendar.getInstance();
SimpleDateFormat tTime = new SimpleDateFormat("HH-mm-ss");
      
    public Report() {
        initComponents();
        conn=MySqlConnect.ConnectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        CountTextB = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        GetCountB1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        FromD = new com.toedter.calendar.JDateChooser();
        ToD = new com.toedter.calendar.JDateChooser();
        CheckB = new javax.swing.JButton();
        ReportB = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        CountText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        StatusC = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        EmpidR = new javax.swing.JTextField();
        GetCountE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EmpFromD = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        Emp_details = new javax.swing.JButton();
        EmpToD = new com.toedter.calendar.JDateChooser();
        CheckE = new javax.swing.JButton();
        ReportE = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TodC = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        FromDc = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report");
        setBounds(new java.awt.Rectangle(275, 0, 0, 0));
        setSize(new java.awt.Dimension(880, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(CountTextB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 160, 30));

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        BillTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BillTable.setRowHeight(20);
        jScrollPane4.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            BillTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            BillTable.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 550, 390));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("From");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        GetCountB1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GetCountB1.setText("Get Total");
        GetCountB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetCountB1ActionPerformed(evt);
            }
        });
        jPanel2.add(GetCountB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("To");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        FromD.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(FromD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 140, 30));

        ToD.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(ToD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 140, 30));

        CheckB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CheckB.setText("Check");
        CheckB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBActionPerformed(evt);
            }
        });
        jPanel2.add(CheckB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, -1));

        ReportB.setText("Generate Report");
        ReportB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBActionPerformed(evt);
            }
        });
        jPanel2.add(ReportB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jTabbedPane1.addTab("                      Bills                        ", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(CountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 160, 30));

        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
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
        EmpTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmpTable.setRowHeight(20);
        jScrollPane3.setViewportView(EmpTable);
        if (EmpTable.getColumnModel().getColumnCount() > 0) {
            EmpTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            EmpTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            EmpTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            EmpTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 550, 390));

        StatusC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StatusC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Leave", "Sick" }));
        jPanel1.add(StatusC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("From");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));
        jPanel1.add(EmpidR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 160, 30));

        GetCountE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GetCountE.setText("Get Count");
        GetCountE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetCountEActionPerformed(evt);
            }
        });
        jPanel1.add(GetCountE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("To");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        EmpFromD.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(EmpFromD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Emp_ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        Emp_details.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Emp_details.setText("Employees");
        Emp_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_detailsActionPerformed(evt);
            }
        });
        jPanel1.add(Emp_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 110, -1));

        EmpToD.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(EmpToD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 140, 30));

        CheckE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CheckE.setText("Check");
        CheckE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckEActionPerformed(evt);
            }
        });
        jPanel1.add(CheckE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        ReportE.setText("Generate Report");
        ReportE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportEActionPerformed(evt);
            }
        });
        jPanel1.add(ReportE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jTabbedPane1.addTab("                               Employees                        ", jPanel1);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bills", "Employees" }));

        TodC.setDateFormatString("yyyy-MM-dd");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("To");

        FromDc.setDateFormatString("yyyy-MM-dd");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("From");

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel9)
                        .addGap(20, 20, 20)
                        .addComponent(FromDc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(TodC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(Delete)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FromDc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addGap(55, 55, 55)
                .addComponent(Delete)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                    Clear Data               ", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CheckEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckEActionPerformed
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    String sql="select * from attendance where Emp_id = '"+EmpidR.getText()+"' and Date between '"+((JTextField)EmpFromD.getDateEditor().getUiComponent()).getText()+"'and '"+((JTextField)EmpToD.getDateEditor().getUiComponent()).getText()+"'";
    pst =conn.prepareStatement(sql);
    rs=pst.executeQuery();
    EmpTable.setModel(DbUtils.resultSetToTableModel(rs));
   }catch(Exception e)
   {
    JOptionPane.showMessageDialog(null, e);
   }finally { 
   try{
      rs.close();
      pst.close();
     }
   catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }
    }//GEN-LAST:event_CheckEActionPerformed

    private void GetCountEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetCountEActionPerformed
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    String sql="select count(work) from attendance where EMP_ID ='"+EmpidR.getText()+"' and WORK = '"+StatusC.getSelectedItem()+"' and DATE between  '"+((JTextField)EmpFromD.getDateEditor().getUiComponent()).getText()+"' and '"+((JTextField)EmpToD.getDateEditor().getUiComponent()).getText()+"'";
    pst =conn.prepareStatement(sql);
    rs=pst.executeQuery();
    
 if(rs.next())
{
CountText.setText(rs.getString("count(work)"));
}
    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }
        finally {
try{
  rs.close();
      pst.close();
     
  }
  catch(Exception e) {
                   }
      }
             
            
    }//GEN-LAST:event_GetCountEActionPerformed

    private void Emp_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_detailsActionPerformed
    Emp_details e = new Emp_details();
    e.setVisible(true);
    }//GEN-LAST:event_Emp_detailsActionPerformed

    private void GetCountB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetCountB1ActionPerformed
       int rows=BillTable.getRowCount();
       int sum = 0;
        for(int i = 0;i<BillTable.getRowCount();i++)
        {
            sum = (int) (sum + Double.parseDouble(BillTable.getValueAt(i, 2).toString()));
        }
        CountTextB.setText(Integer.toString(sum));
    }//GEN-LAST:event_GetCountB1ActionPerformed

    private void CheckBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBActionPerformed
   try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
     String sql="select * from bills where Date between '"+((JTextField)FromD.getDateEditor().getUiComponent()).getText()+"'and '"+((JTextField)ToD.getDateEditor().getUiComponent()).getText()+"'";
     pst =conn.prepareStatement(sql);
     rs=pst.executeQuery();
     BillTable.setModel(DbUtils.resultSetToTableModel(rs));
    }
catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, e);
    }
finally {
try{
  rs.close();
  pst.close();
  }
  catch(Exception e) {
     }
      }

    }//GEN-LAST:event_CheckBActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      if("Bills".equals(jComboBox1.getSelectedItem())){
      try{
     Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    String sql="delete from bills where Date between '"+((JTextField)FromDc.getDateEditor().getUiComponent()).getText()+"'and '"+((JTextField)TodC.getDateEditor().getUiComponent()).getText()+"'";
 
pst =conn.prepareStatement(sql);
  pst.execute();
  JOptionPane.showMessageDialog(null, "Deleted");

      }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }finally {
try{
  rs.close();
      pst.close();
     
  }
  catch(Exception e) {
                   }
      }

      }
      if("Employees".equals(jComboBox1.getSelectedItem())){
      try{
     Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    String sql="delete from attendance where Date between '"+((JTextField)FromDc.getDateEditor().getUiComponent()).getText()+"'and '"+((JTextField)TodC.getDateEditor().getUiComponent()).getText()+"'";
 
pst =conn.prepareStatement(sql);
  pst.execute();
  JOptionPane.showMessageDialog(null, "Deleted");

      }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }finally {
try{
  rs.close();
      pst.close();
     
  }
  catch(Exception e) {
                   }
      }
      }      
    }//GEN-LAST:event_DeleteActionPerformed

    private void ReportBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBActionPerformed
    try{
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();
        File file = new File(tTime.format(timer.getTime())+".xls");
        FileWriter excel = new FileWriter(file);
        
        excel.write(model.getColumnName(0) + "\t");
        excel.write(model.getColumnName(1) + "\t");
        excel.write(model.getColumnName(2) + "\t");
        excel.write("\n");
        for(int i=0; i< model.getRowCount(); i++) {
        for(int j=0; j < model.getColumnCount(); j++) {
        excel.write(model.getValueAt(i,j).toString()+"\t");
        }
        excel.write("\n");
        }
        JOptionPane.showMessageDialog(null, "Report Generated");
        excel.close();
         }
    catch(Exception e)
    { 
        JOptionPane.showMessageDialog(null, e);
     }
    }//GEN-LAST:event_ReportBActionPerformed

    private void ReportEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportEActionPerformed
    try{
        DefaultTableModel model = (DefaultTableModel) EmpTable.getModel();
        File file = new File(EmpidR.getText()+".xls");
        FileWriter excel = new FileWriter(file);

            excel.write(model.getColumnName(0) + "\t");
            excel.write(model.getColumnName(1) + "\t");
            excel.write(model.getColumnName(2) + "\t");
            excel.write(model.getColumnName(3) + "\t");

            excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                excel.write(model.getValueAt(i,j).toString()+"\t");
            }
            excel.write("\n");
        }
        excel.close();
        JOptionPane.showMessageDialog(null, "Report Generated");
        }
    catch(Exception e)
    { 
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_ReportEActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JButton CheckB;
    private javax.swing.JButton CheckE;
    private javax.swing.JTextField CountText;
    private javax.swing.JTextField CountTextB;
    private javax.swing.JButton Delete;
    private com.toedter.calendar.JDateChooser EmpFromD;
    private javax.swing.JTable EmpTable;
    private com.toedter.calendar.JDateChooser EmpToD;
    private javax.swing.JButton Emp_details;
    private javax.swing.JTextField EmpidR;
    private com.toedter.calendar.JDateChooser FromD;
    private com.toedter.calendar.JDateChooser FromDc;
    private javax.swing.JButton GetCountB1;
    private javax.swing.JButton GetCountE;
    private javax.swing.JButton ReportB;
    private javax.swing.JButton ReportE;
    private javax.swing.JComboBox<String> StatusC;
    private com.toedter.calendar.JDateChooser ToD;
    private com.toedter.calendar.JDateChooser TodC;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
