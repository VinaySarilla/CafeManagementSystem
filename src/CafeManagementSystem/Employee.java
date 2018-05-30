package CafeManagementSystem;
import java.awt.*;
import CafeManagementSystem.Employee;
import CafeManagementSystem.Billing;
import CafeManagementSystem.WelcomeFrame;
import java.awt.image.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.swing.filechooser.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Employee extends javax.swing.JFrame {
Connection Conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
String s;
    
    public Employee() {
        initComponents();
    }
  String imgPath = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Upload = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Add_data = new javax.swing.JButton();
        Image_L = new javax.swing.JLabel();
        Search_F = new javax.swing.JTextField();
        Employeeid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Gender_L = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JAddress = new javax.swing.JTextField();
        Gender_c = new javax.swing.JComboBox<>();
        JPost = new javax.swing.JTextField();
        JSalary = new javax.swing.JTextField();
        JName = new javax.swing.JTextField();
        JEmp_ID = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Details");
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Button-Upload-icon.png"))); // NOI18N
        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Button-Delete-icon.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Add_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/add-icon.png"))); // NOI18N
        Add_data.setText("Add");
        Add_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_dataActionPerformed(evt);
            }
        });

        Image_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image_L.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Employeeid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employeeid.setText("EmployeeID");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salary");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Post");

        Gender_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gender_L.setText("Gender");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address");

        Gender_c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        Gender_c.setToolTipText("");
        Gender_c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JPost.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JEmp_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/user-search-icon.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Edit-Users-icon.png"))); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Button-Refresh-icon.png"))); // NOI18N
        Refresh.setText("Reset");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel5.setText("4 Digits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(Gender_L, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Gender_c, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Image_L, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Add_data, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(JPost, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(JAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Search_F, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                        .addComponent(Search))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60)
                                                .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(JSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(Employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(JEmp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(531, 531, 531)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Employeeid))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JEmp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Image_L, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add_data, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gender_L, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Gender_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(JAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 820, 490));

        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(EmpTable);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
            String sql="Select Employee_ID,Name,Salary,Address,Post,Gender from employee_details ";

            pst =Conn.prepareStatement(sql);
            rs=pst.executeQuery();
            //pst.execute();
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

            }
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 900, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","gif","png");
        fc.addChoosableFileFilter(filter);
        int result = fc.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
        File selectedfile = fc.getSelectedFile();
        String path = selectedfile.getAbsolutePath();
        ImageIcon inon = new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(Image_L.getWidth(), Image_L.getHeight(),Image.SCALE_DEFAULT));
        Image_L.setIcon(inon);
        s = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
        System.out.println("No Data");
        }   
    }//GEN-LAST:event_UploadActionPerformed

    private void Add_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_dataActionPerformed
       if("".equals(JAddress.getText())||"".equals(JEmp_ID.getText())||"".equals(JName.getText())||"".equals(JPost.getText())||"".equals(JSalary.getText())){
     JOptionPane.showMessageDialog(null, "Enter Valid Data");
     }
       else{ 
        String name = JName.getText();
        String salary = JSalary.getText();
        String post = JPost.getText();
        String address = JAddress.getText();
        String empid = JEmp_ID.getText();
        String gender = Gender_c.getSelectedItem().toString();

        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
            Conn.setAutoCommit(false);
            pst = Conn.prepareStatement("Insert into Employee_details values (?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(s));
            pst.setString(2,name);
            pst.setString(1,empid);
            pst.setString(5,post);
            pst.setString(3,salary);
            pst.setString(4,address);
            pst.setString(7, gender);
            pst.setBlob(6, is);
            int i = pst.executeUpdate();
            if(i>0){
            JOptionPane.showMessageDialog(null, "Saved");
            DefaultTableModel model = (DefaultTableModel)EmpTable.getModel(); 
            model.addRow(new Object[]{empid,name,salary,address,post,gender});    
            Conn.commit();
            JName.setText(null);
            JEmp_ID.setText(null);
            JSalary.setText(null);
            JPost.setText(null);
            JAddress.setText(null);
            Image_L.setIcon(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Saved");
            }
            pst.close();
            Conn.close();

        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null, "e");
        }
       }

    }//GEN-LAST:event_Add_dataActionPerformed

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
        String add2 = rs.getString("Salary");
        JSalary.setText(add2);
        String add3 = rs.getString("Address");
        JAddress.setText(add3);
        String add4 = rs.getString("Name");
        JName.setText(add4);
        byte[] img = rs.getBytes("Image");
        ImageIcon icon = new ImageIcon(img);
        Image_L.setIcon((Icon) icon);
        String add5 = rs.getString("Gender");
        Gender_c.setSelectedItem(add5);
        String add6 = rs.getString("Employee_ID");
        JEmp_ID.setText(add6);
        Search_F.setText(null);
        }
        else{
        JOptionPane.showMessageDialog(null, "No Employee Found");
        }
        }
      catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
  }
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
   if("".equals(JEmp_ID.getText())){
     JOptionPane.showMessageDialog(null, "Select Employee");
     }
  else{  String sql="delete from Employee_details where Name=? and Employee_ID=? ";
         try{
             Class.forName("com.mysql.jdbc.Driver");

            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
 
             pst =Conn.prepareStatement(sql);
             pst.setString(1, JName.getText());
             pst.setString(2, JEmp_ID.getText());
             pst.execute();
             JOptionPane.showMessageDialog(null, "Deleted");
                JName.setText(null);
     JPost.setText(null);
     JSalary.setText(null);
     JAddress.setText(null);
     JEmp_ID.setText(null);
     Search_F.setText(null);
     Image_L.setIcon(null);
         }
            catch(Exception e)
            {
             JOptionPane.showMessageDialog(null, e);
            }
    finally {
        db();
         try{
             rs.close();
             pst.close();
       }
       catch(Exception e) {
          JOptionPane.showMessageDialog(null, e);                
          }
          }
   }
    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
      db();
     JName.setText(null);
     JPost.setText(null);
     JSalary.setText(null);
     JAddress.setText(null);
     JEmp_ID.setText(null);
     Search_F.setText(null);
     Image_L.setIcon(null);
    }//GEN-LAST:event_RefreshActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       if("".equals(JAddress.getText())||"".equals(JEmp_ID.getText())||"".equals(JName.getText())||"".equals(JPost.getText())||"".equals(JSalary.getText())){
     JOptionPane.showMessageDialog(null, "Empty Fields Found");
     }
       else{
        String name = JName.getText();
        String salary = JSalary.getText();
        String post = JPost.getText();
        String address = JAddress.getText();
        String empid = JEmp_ID.getText();
        String gender = Gender_c.getSelectedItem().toString();
        
       try{
            Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
            Conn.setAutoCommit(false);
            PreparedStatement pst=null;
            String queryco1 = "update employee_details set Name='"+name+"',Salary = '"+salary+"',Address = '"+address+"',Post = '"+post+"',Gender = '"+gender+"' where Employee_ID='"+empid+"'";
            pst = Conn.prepareStatement(queryco1);
            int i=pst.executeUpdate();
            Conn.commit();
            pst.close();
            if(Conn!=null){
            Conn.close();
            JOptionPane.showMessageDialog(null ,"Updated");
                 JName.setText(null);
     JPost.setText(null);
     JSalary.setText(null);
     JAddress.setText(null);
     JEmp_ID.setText(null);
     Search_F.setText(null);
     Image_L.setIcon(null);}
                        else{
                                JOptionPane.showMessageDialog(null ,"Data not Updated");
                    }

       }
       
    catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            System.out.println("Exception.."+e);
            System.out.println(e.getStackTrace());
                    }
        try{
            File file = new File(s);
            FileInputStream fis = new FileInputStream(file);
            byte[]image = new byte[(int)file.length()];
            fis.read(image);
            Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project","root","sarilla1427");
            String sql = "update employee_details SET Image = ? where Employee_ID ='"+JEmp_ID.getText()+"'";
            pst = Conn.prepareStatement(sql);
            pst.setBytes(1, image);
            pst.executeUpdate();
            pst.close();
            }
    catch(Exception e){
//                JOptionPane.showMessageDialog(null,e);

                    }
                db();
       }
    }//GEN-LAST:event_UpdateActionPerformed

    
    public void db(){
    try{      
        Class.forName("com.mysql.jdbc.Driver");
        Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
        String sql="Select Employee_ID,Name,Salary,Address,Post,Gender from employee_details ";
        pst =Conn.prepareStatement(sql);
        rs=pst.executeQuery();
        EmpTable.setModel(DbUtils.resultSetToTableModel(rs));
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
}
     public ImageIcon ResizeImage(String ImagePath, byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
           MyImage = new ImageIcon(ImagePath);
        }else
        {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Image_L.getWidth(), Image_L.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_data;
    private javax.swing.JButton Delete;
    private javax.swing.JTable EmpTable;
    private javax.swing.JLabel Employeeid;
    private javax.swing.JLabel Gender_L;
    private javax.swing.JComboBox<String> Gender_c;
    private javax.swing.JLabel Image_L;
    private javax.swing.JTextField JAddress;
    private javax.swing.JTextField JEmp_ID;
    private javax.swing.JTextField JName;
    private javax.swing.JTextField JPost;
    private javax.swing.JTextField JSalary;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Search_F;
    private javax.swing.JButton Update;
    private javax.swing.JButton Upload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}