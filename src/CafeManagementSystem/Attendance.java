package CafeManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Date;
import net.proteanit.sql.DbUtils;


public class Attendance extends javax.swing.JFrame {
Connection Conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    public Attendance() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AttendancePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Status = new javax.swing.JComboBox<>();
        SaveA = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Attendance");
        setBounds(new java.awt.Rectangle(640, 50, 0, 0));

        AttendancePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Emp_Id", "NAME", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(22);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
            String sql="Select Employee_ID,Name,null as STATUS from employee_details ";

            pst =Conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //pst.execute();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

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
            Status.setSelectedItem("Present");
        }
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(Status));
        }

        AttendancePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 600, 360));

        Status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Leave", "Sick" }));
        AttendancePanel.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        SaveA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/add-icon.png"))); // NOI18N
        SaveA.setText("Save");
        SaveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAActionPerformed(evt);
            }
        });
        AttendancePanel.add(SaveA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 90, 50));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        AttendancePanel.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Date :");
        AttendancePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AttendancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AttendancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAActionPerformed

        try{

    Connection conn=null;
    int rows=jTable1.getRowCount();
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    String dateQuery="select emp_id from attendance where date=?";
    PreparedStatement pstmt1=conn.prepareStatement(dateQuery);
    String dateofSystem=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
    pstmt1.setString(1,dateofSystem);
    ResultSet rs=pstmt1.executeQuery();
    boolean flag=false;
    while(rs.next()){
    flag=true;
    }
    if(rs!=null) rs.close();
    pstmt1.close();
    System.out.println("falg....."+flag);
    if(flag){
            
    for(int row = 0; row<rows; row++)
    {
    try{
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
    conn.setAutoCommit(false);
    PreparedStatement pst=null;
    String empId = (String)jTable1.getValueAt(row, 0);
    String name = (String)jTable1.getValueAt(row, 1);
    String work = (String)jTable1.getValueAt(row, 2);
    String dates = (String)((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
    String queryco1 = "update attendance set work='"+work+"' where date='"+dates+"' and emp_id='"+empId+"'";
    pst = conn.prepareStatement(queryco1);
    int i=pst.executeUpdate();
    conn.commit();
    pst.close();
    if(conn!=null)
    conn.close();
    }
    catch(Exception e){
    e.printStackTrace();
    System.out.println("Exception.."+e);
    System.out.println(e.getStackTrace());
    }
    }
    JOptionPane.showMessageDialog(null, "Updated");
    }
    else{
    conn.setAutoCommit(false);
    String queryco = "Insert into attendance values (?,?,?,?)";
    pst = conn.prepareStatement(queryco);
    
    for(int row = 0; row<rows; row++)
    {
    String name = (String)jTable1.getValueAt(row, 0);
    String id = (String)jTable1.getValueAt(row, 1);
    String work = (String)jTable1.getValueAt(row, 2);
    pst.setString(2, name);
    pst.setString(3, id);
    pst.setString(4, work);
    pst.setString(1, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
    pst.addBatch();
    }
    pst.executeBatch();
    conn.commit();
    JOptionPane.showMessageDialog(null, "Saved");
    }
    if(conn!=null){
    rs.close();
    pst.close();
    conn.close();}
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());
        }    
    }//GEN-LAST:event_SaveAActionPerformed

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AttendancePanel;
    private javax.swing.JButton SaveA;
    private javax.swing.JComboBox<String> Status;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
