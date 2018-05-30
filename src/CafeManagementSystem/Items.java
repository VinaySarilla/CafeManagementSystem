package CafeManagementSystem;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Items extends javax.swing.JFrame {
Connection Conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    public Items() {
        initComponents();
        cb();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SaveTab1 = new javax.swing.JButton();
        JPrice = new javax.swing.JTextField();
        JItem = new javax.swing.JTextField();
        JCateg = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Categ = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JItem1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JPrice1 = new javax.swing.JTextField();
        SaveTab2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Categ1 = new javax.swing.JComboBox<>();
        Items1 = new javax.swing.JComboBox<>();
        GetPriceT = new javax.swing.JTextField();
        GetPrice = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Items");
        setBounds(new java.awt.Rectangle(640, 50, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jLabel1.setText("Add Category");

        jLabel2.setText("Add Item");

        jLabel3.setText("Set Price");

        SaveTab1.setText("Save");
        SaveTab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveTab1ActionPerformed(evt);
            }
        });

        JPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JCateg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JCateg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JItem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(SaveTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JItem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(SaveTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                    Add New Category                ", jPanel2);

        Categ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Categ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories" }));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select  Category");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Item");

        JItem1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JItem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Set Price");

        JPrice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPrice1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SaveTab2.setText("Save");
        SaveTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveTab2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categ, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(SaveTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SaveTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("               Add New Item                  ", jPanel1);

        Categ1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Categ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories" }));
        Categ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Categ1ActionPerformed(evt);
            }
        });

        Items1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        GetPriceT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GetPriceT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GetPrice.setText("Get Price");
        GetPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetPriceActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Select  Category");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Select  Item");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(119, Short.MAX_VALUE)
                        .addComponent(GetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Items1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GetPriceT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(232, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categ1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Items1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GetPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(GetPriceT))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 95, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("             Update and Delete                ", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Add New Category"); // NOI18N
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveTab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveTab1ActionPerformed
        String categ = JCateg.getText();
        String item = JItem.getText();
        String price = JPrice.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
            Conn.setAutoCommit(false);
            pst = Conn.prepareStatement("Insert into items values (?,?,?)");
             pst.setString(1,categ);
             pst.setString(2,item);
             pst.setString(3,price);
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Saved");
                Conn.commit();
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Saved");
            }
            pst.close();
            Conn.close();

        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_SaveTab1ActionPerformed

    private void SaveTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveTab2ActionPerformed
      String categ = (String) Categ.getSelectedItem();
        String item = JItem1.getText();
        String price = JPrice1.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
            Conn.setAutoCommit(false);
            pst = Conn.prepareStatement("Insert into items values (?,?,?)");
             pst.setString(1,categ);
             pst.setString(2,item);
             pst.setString(3,price);
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Saved");
                Conn.commit();
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Saved");
            }
            pst.close();
            Conn.close();

        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);

        }
            cb();
    }//GEN-LAST:event_SaveTab2ActionPerformed

    private void Categ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Categ1ActionPerformed
      Items1.removeAllItems();
        db();
    }//GEN-LAST:event_Categ1ActionPerformed

    private void GetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetPriceActionPerformed
     hh();
    }//GEN-LAST:event_GetPriceActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
  String sql = "update items set Price ='"+GetPriceT.getText()+"'where Items ='"+Items1.getSelectedItem()+"' ";
    pst = Conn.prepareStatement(sql);
     int i = pst.executeUpdate();
    
    pst.close();
     JOptionPane.showMessageDialog(null, "Updated Succesfully");
     if(Conn!=null)
                        Conn.close();

     }
     catch(Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
     String sql ="delete from items where cat=? and Items=? ";
        try{
      Class.forName("com.mysql.jdbc.Driver");
     Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
    pst =Conn.prepareStatement(sql);
    pst.setString(1, Categ1.getSelectedItem().toString());
    pst.setString(2, Items1.getSelectedItem().toString());
    pst.execute();
    JOptionPane.showMessageDialog(null, "Deleted Succesfully");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    finally {
    try{
        rs.close();
        pst.close();
       }
    catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);                
        }
        }
    
    }//GEN-LAST:event_DeleteActionPerformed
   
    public void cb(){
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
  String sql = "select distinct cat from items";
    pst = Conn.prepareStatement(sql);
    rs = pst.executeQuery();
    
    while(rs.next())
    {
    Categ.addItem(rs.getString(1));
    Categ1.addItem(rs.getString(1));
    
    }
        }
     
        catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
               
        }
        
     }
 public void db(){

     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
  String sql = "select items from items where cat = '"+Categ1.getSelectedItem()+"'"; 
    pst = Conn.prepareStatement(sql);
    rs = pst.executeQuery();
        while(rs.next())
    {
    Items1.addItem(rs.getString(1));
     }
        
        }
        catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
        }
    
     
     }
 public void hh(){
 try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
  String sql = "select price from items where items = '"+Items1.getSelectedItem()+"'";
    pst = Conn.prepareStatement(sql);
    rs = pst.executeQuery();
String pd = null;
while(rs.next()){
     pd = (String) rs.getString(1);
     System.out.println(pd);
    GetPriceT.setText(pd);
         }
 }
         catch(Exception e){
         
         }
 }
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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categ;
    private javax.swing.JComboBox<String> Categ1;
    private javax.swing.JButton Delete;
    private javax.swing.JButton GetPrice;
    private javax.swing.JTextField GetPriceT;
    private javax.swing.JComboBox<String> Items1;
    private javax.swing.JTextField JCateg;
    private javax.swing.JTextField JItem;
    private javax.swing.JTextField JItem1;
    private javax.swing.JTextField JPrice;
    private javax.swing.JTextField JPrice1;
    private javax.swing.JButton SaveTab1;
    private javax.swing.JButton SaveTab2;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
