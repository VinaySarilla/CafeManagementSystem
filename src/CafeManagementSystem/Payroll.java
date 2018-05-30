package CafeManagementSystem;
import java.awt.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.Paragraph;
import com.itextpdf.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Payroll extends javax.swing.JFrame {
 Connection Conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
    public Payroll() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Image_L = new javax.swing.JLabel();
        Search_F = new javax.swing.JTextField();
        Employeeid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Gender_L = new javax.swing.JLabel();
        Gender_c = new javax.swing.JComboBox<>();
        JPost = new javax.swing.JTextField();
        JSalary = new javax.swing.JTextField();
        JName = new javax.swing.JTextField();
        JEmp_ID = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        TSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PrintPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payroll");
        setBounds(new java.awt.Rectangle(250, 100, 0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Image_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_L.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(Image_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 240, 220));
        jPanel1.add(Search_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 276, -1));

        Employeeid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employeeid.setText("EmployeeID");
        jPanel1.add(Employeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 113, 98, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 156, 88, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Daily Salary");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 210, 98, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Post");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 260, 98, 26));

        Gender_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gender_L.setText("Gender");
        jPanel1.add(Gender_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 317, 116, 29));

        Gender_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel1.add(Gender_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 321, 108, -1));

        JPost.setEditable(false);
        JPost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(JPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 260, 143, -1));

        JSalary.setEditable(false);
        JSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(JSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 210, 143, -1));

        JName.setEditable(false);
        JName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(JName, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 156, 143, -1));

        JEmp_ID.setEditable(false);
        JEmp_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(JEmp_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 110, 143, -1));

        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/user-search-icon.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        jDateChooser3.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 69, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("From");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 79, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("To");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 79, -1, -1));

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 69, 140, 30));

        TSalary.setEditable(false);
        jPanel1.add(TSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 364, 189, 42));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Salary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 375, 98, 20));

        PrintPdf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PrintPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Document-icon.png"))); // NOI18N
        PrintPdf.setText("Print");
        PrintPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintPdfActionPerformed(evt);
            }
        });
        jPanel1.add(PrintPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
 if("".equals(Search_F.getText())){
     JOptionPane.showMessageDialog(null, "Enter EmployeeID");
     }
  else{
         try{
             Class.forName("com.mysql.jdbc.Driver");

            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
           
            String sql="select * from employee_details where Employee_ID=? ";
            pst =Conn.prepareStatement(sql);
            pst.setString(1,Search_F.getText());

            rs=pst.executeQuery();
            // pst.execute();
        if(rs.next()){
        String add1 = rs.getString("Post");
        JPost.setText(add1);
        String salary = rs.getString("Salary");
        JSalary.setText(salary);
        String add4 = rs.getString("Name");
        JName.setText(add4);
        byte[] img = rs.getBytes("Image");
        ImageIcon icon = new ImageIcon(img);
        Image_L.setIcon((Icon) icon);
        String add5 = rs.getString("Gender");
        Gender_c.setSelectedItem(add5);
        String add6 = rs.getString("Employee_ID");
        JEmp_ID.setText(add6);
        }
        }
      catch(Exception e){
      
      }      
try{
Class.forName("com.mysql.jdbc.Driver");
Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
String sql="select count(work) from attendance where EMP_ID ='"+Search_F.getText()+"' and WORK = 'Present' and DATE between  '"+((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText()+"' and '"+((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText()+"'";
    
pst =Conn.prepareStatement(sql);
rs=pst.executeQuery();
    
 if(rs.next())
{
String count = rs.getString("count(work)");
int sal = Integer.parseInt(JSalary.getText());
int count1 = Integer.parseInt(count);
int bal = count1*sal;
String d = String.format(""+bal);
TSalary.setText(d);
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
      }
    }//GEN-LAST:event_SearchActionPerformed

    private void PrintPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintPdfActionPerformed
        Calendar timer = Calendar.getInstance();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat Tdate = new SimpleDateFormat("yyyy-MM-dd");

        try {
         Document document=new Document();
         
         PdfWriter.getInstance(document,new FileOutputStream(JEmp_ID.getText()+Tdate.format(timer.getTime())+".pdf"));
         document.open();
         
         document.add(new Paragraph("Date:\t\t"+Tdate.format(timer.getTime()),FontFactory.getFont(FontFactory.TIMES_BOLD,13,Font.BOLD,BaseColor.BLACK)));
         document.add(new Paragraph("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCafe Management System",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD,BaseColor.BLACK)));
         document.add(new Paragraph("\n"+Employeeid.getText()+":\t\t\t\t"+JEmp_ID.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.BLACK)));        
         document.add(new Paragraph("\n"+jLabel1.getText()+":\t\t\t\t"+JName.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.BLACK)));        
         document.add(new Paragraph("\n"+jLabel3.getText()+":\t\t\t\t"+JPost.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.BLACK)));        
         document.add(new Paragraph("\n"+jLabel6.getText()+":\t\t\t\t"+TSalary.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD,BaseColor.BLACK)));        
         document.close();
         JOptionPane.showMessageDialog(null,"Salary Slip Generated");
         
     }
        catch (Exception e) {
     JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_PrintPdfActionPerformed
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
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employeeid;
    private javax.swing.JLabel Gender_L;
    private javax.swing.JComboBox<String> Gender_c;
    private javax.swing.JLabel Image_L;
    private javax.swing.JTextField JEmp_ID;
    private javax.swing.JTextField JName;
    private javax.swing.JTextField JPost;
    private javax.swing.JTextField JSalary;
    private javax.swing.JButton PrintPdf;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Search_F;
    private javax.swing.JTextField TSalary;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
