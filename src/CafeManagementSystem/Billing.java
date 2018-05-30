package CafeManagementSystem;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Date;

public class Billing extends javax.swing.JFrame {
Connection Conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
double i[] =  new double[10];
    double refs = 1355+(double)(Math.random()*9);
      double ref2;
        Calendar timer = Calendar.getInstance();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat Tdate = new SimpleDateFormat("yyyy-MM-dd");
      
    public Billing() {
        initComponents();
DB1();   
setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Categ = new javax.swing.JComboBox<>();
        ItemC = new javax.swing.JComboBox<>();
        Total_F = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Quantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Reciept = new javax.swing.JTextArea();
        Print = new javax.swing.JButton();
        GTotal_F = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Billing");

        Categ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Categ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories" }));
        Categ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategActionPerformed(evt);
            }
        });

        ItemC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ItemC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Total_F.setEditable(false);

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/add-icon.png"))); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Button-Delete-icon.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Reference Id", "Name", "Quantity", "Amount", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Reciept.setEditable(false);
        Reciept.setColumns(20);
        Reciept.setRows(5);
        double refs = 1355+(double)(Math.random()*9);
        this.ref2 = refs;
        Reciept.setText("   \t\n Cafe Management System:\n\n"+
            "Reference:\t\t"+refs+
            "\n=================================\t\t"+
            "\nDate: "+Tdate.format(timer.getTime())+
            "\nTime: "+tTime.format(timer.getTime())+
            "\n=================================\t\t");
        jScrollPane2.setViewportView(Reciept);

        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Document-icon.png"))); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        GTotal_F.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Category");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Items");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Grand Total");

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Button-Refresh-icon.png"))); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Categ, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ItemC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Total_F, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(GTotal_F, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(218, 218, 218))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Categ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Total_F, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GTotal_F, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategActionPerformed
     ItemC.removeAllItems();
     DB2();
    }//GEN-LAST:event_CategActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
      double g = this.ref2;
        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
    String sql = "select price from items where items = '"+ItemC.getSelectedItem()+"'";
    pst = Conn.prepareStatement(sql);
    rs = pst.executeQuery();
    
    String pd=null;
    
    while(rs.next())
    {
       pd = (String) rs.getString(1);
       double a = Double.parseDouble(Quantity.getText());
       double b = Double.parseDouble(pd);
       double c = a*b;
       String d = String.format("%.2f", c);
       Total_F.setText(d);
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
       model.addRow(new Object[]{Tdate.format(timer.getTime()),g,ItemC.getSelectedItem(),Quantity.getText(),pd,Total_F.getText()});    
     }
        }
    catch(Exception e){
      
    }
        int rows=jTable1.getRowCount();
        int sum = 0;
        for(int i = 0;i<jTable1.getRowCount();i++)
        {
            sum = (int) (sum + Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
        }
        GTotal_F.setText(Integer.toString(sum));
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try{
            int SelectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         int rows=jTable1.getRowCount();
          int sum = 0;
        for(int i = 0;i<jTable1.getRowCount();i++)
        {
            sum = (int) (sum + Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
        }
        GTotal_F.setText(Integer.toString(sum));
    }//GEN-LAST:event_DeleteActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        int rows = jTable1.getRowCount();
        for(int row = 0; row<rows; row++){
   String date = (String)jTable1.getValueAt(row, 0);
            Double refs = (Double)jTable1.getValueAt(row, 1);
            String ref = (String)refs.toString();
            String Total = (String)GTotal_F.getText();
        try{
            Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
            String queryco = "Insert into bills values (?,?,?)";
      pst = Conn.prepareStatement(queryco);
       
          pst.setString(1, date);
          pst.setString(2, ref);            
          pst.setString(3, Total);            
          int i = pst.executeUpdate();
          
        }
            
        catch(Exception e){
       
        }
            }
        
             try{
        for(int row = 0; row<rows; row++)
        {
            
            String date = (String)jTable1.getValueAt(row, 0);
            Double refs = (Double)jTable1.getValueAt(row, 1);
            String ref = (String)refs.toString();
            String Total = (String)GTotal_F.getText();
            String name = (String)jTable1.getValueAt(row, 2);
            String quant = (String)jTable1.getValueAt(row, 3);
            String price = (String)jTable1.getValueAt(row,4);
            Reciept.append("\n"+name+"\t"+quant+"\t"+price+"\t"+Total);

        }
        int sum = 0;

        for(int i = 0;i<jTable1.getRowCount();i++)
        {
            sum = (int) (sum + Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
        }
        Reciept.append("\n=================================\t\t\n\nGrand Total\t"+Integer.toString(sum));
        JOptionPane.showMessageDialog(null, "Bill Generated");
             }
             
           
        catch(Exception e){
            e.printStackTrace();
        System.out.println("Exception "+e);
        }
       Print.setVisible(false);
       Refresh.setVisible(true);    
    }//GEN-LAST:event_PrintActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
   Categ.setSelectedItem("Categories");
   ItemC.setSelectedItem(null);
   Quantity.setText(null);
   Total_F.setText(null);
   GTotal_F.setText(null);
           Calendar timer = Calendar.getInstance();
   DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
    model.setRowCount(0);
    double refs = 1355+(double)(Math.random()*9);
    this.ref2 = refs;
    Reciept.setText("   \t\n Cafe Management System:\n\n"+
    "Reference:\t\t"+refs+
    "\n=================================\t\t"+
    "\nDate: "+Tdate.format(timer.getTime())+
    "\nTime: "+tTime.format(timer.getTime())+
    "\n=================================\t\t");
    Print.setVisible(true);
   
    }//GEN-LAST:event_RefreshActionPerformed

      public void DB1(){
     try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
  String sql = "select distinct cat from items";
    pst = Conn.prepareStatement(sql);
    rs = pst.executeQuery();
    
    
    while(rs.next())
    {
    Categ.addItem(rs.getString(1));
    
    }
        }
     
        catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
               
        }
        
     }
     public void DB2(){
     
             try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
  String sql = "select items from items where cat = '"+Categ.getSelectedItem()+"'"; 
    pst = Conn.prepareStatement(sql);
    rs = pst.executeQuery();
        while(rs.next())
    {
    ItemC.addItem(rs.getString(1));
     }
        
        }
        catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
        }
    
     
     }
     
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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> Categ;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField GTotal_F;
    private javax.swing.JComboBox<String> ItemC;
    private javax.swing.JButton Print;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextArea Reciept;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField Total_F;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}