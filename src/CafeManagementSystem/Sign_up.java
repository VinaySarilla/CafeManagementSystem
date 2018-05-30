package CafeManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import CafeManagementSystem.UserDetails;
public class Sign_up extends javax.swing.JFrame {
Connection Conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
    
    public Sign_up() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        JUsername = new javax.swing.JTextField();
        JUserID = new javax.swing.JTextField();
        Submit_B = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        JUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        LevelC = new javax.swing.JComboBox<>();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        SearchB = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        Search_T = new javax.swing.JTextField();
        UpdateB = new javax.swing.JButton();
        User_List = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SignUp");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(655, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setText("Username");
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 83, 23));

        jLabel80.setText("Password");
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 83, 23));

        jLabel81.setText("User ID");
        getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 51, 23));
        getContentPane().add(JUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 173, 28));
        getContentPane().add(JUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 173, 28));

        Submit_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/user-add-icon.png"))); // NOI18N
        Submit_B.setText("Submit");
        Submit_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_BActionPerformed(evt);
            }
        });
        getContentPane().add(Submit_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 131, 80));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 173, 28));
        getContentPane().add(JUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 173, 28));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 173, 33));

        getContentPane().add(LevelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 161, 33));
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
            String sql = "select distinct level from userinfo";
            pst = Conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next())
            {
                LevelC.addItem(rs.getString(1));

            }
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

        jLabel82.setText("Set Level");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 83, 23));

        jLabel83.setText("Admin Password");
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 118, 23));

        jLabel84.setText("Admin ID");
        getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 83, 35));

        SearchB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/user-search-icon.png"))); // NOI18N
        SearchB.setText("Search");
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
            }
        });
        getContentPane().add(SearchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 30));

        DeleteB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Button-Delete-icon.png"))); // NOI18N
        DeleteB.setText("Delete");
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 130, 80));
        getContentPane().add(Search_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 320, 30));

        UpdateB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Edit-Users-icon.png"))); // NOI18N
        UpdateB.setText("Update");
        UpdateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 120, 80));

        User_List.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeManagementSystem/Checklist-icon.png"))); // NOI18N
        User_List.setText("User List");
        User_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_ListActionPerformed(evt);
            }
        });
        getContentPane().add(User_List, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 120, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Submit_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_BActionPerformed
if("".equals(JUsername.getText())||"".equals(JUserID.getText())||"".equals(jPasswordField1.getText())||"".equals(JUser.getText())){
     JOptionPane.showMessageDialog(null, "Enter Valid Data");
     }
        if("".equals(JUser.getText())){
     JOptionPane.showMessageDialog(null, "Enter AdminID");
     }
          if("".equals(jPassword.getText())){
     JOptionPane.showMessageDialog(null, "Enter AdminPassword");
     }
          else{
         String password = jPassword.getText();
            String user1 = JUser.getText();
            String passfromDb="";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
                String Sql = "Select password from USERINFO where USERID=? and level = 'admin' ";

                pst = Conn.prepareStatement(Sql);
                pst.setString(1,user1);
                rs = pst.executeQuery();
                if(rs.next()){
                    passfromDb =  rs.getString("password");
                }

                if(password.equals(passfromDb)){
                        String password1 = jPasswordField1.getText();
        String Nuser = JUsername.getText();
        String userid = JUserID.getText();
        String level =  (String) LevelC.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
Connection Conn1 = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
                
            pst = Conn.prepareStatement("Insert into USERINFO values (?,?,?,?)");
            pst.setString(1,Nuser);
            pst.setString(2,userid);
            pst.setString(3,password1);
            pst.setString(4,level);
            int i = pst.executeUpdate();
            if(i>0){
            
                JOptionPane.showMessageDialog(null, "Saved");
                     
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Not Saved");
            }
            pst.close();
            Conn.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

        JUsername.setText(null);
        JUserID.setText(null);
        jPasswordField1.setText(null);
                 
                }

                else{
                    JOptionPane.showMessageDialog(null, "Invalid user or password","Access Denied",JOptionPane.ERROR_MESSAGE);
                    jPassword.setText(null);
                    JUser.setText(null);
                }
                rs.close();
                pst.close();
                Conn.close();
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);

            }

        
        JUsername.setText(null);
        JUserID.setText(null);
        jPasswordField1.setText(null);
        jPassword.setText(null);
        JUser.setText(null);
          }
    }//GEN-LAST:event_Submit_BActionPerformed

    private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed
     if("".equals(Search_T.getText())){
     JOptionPane.showMessageDialog(null, "Enter UserID");
     }
  else{
        
        try{
             Class.forName("com.mysql.jdbc.Driver");

            Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
           
            String sql="select * from USERINFO where UserID=? ";
            pst =Conn.prepareStatement(sql);
            pst.setString(1,Search_T.getText());

            rs=pst.executeQuery();

            if(rs.next()){
        String add1 = rs.getString("Username");
        JUsername.setText(add1);
        String add2 = rs.getString("UserID");
        JUserID.setText(add2);
        String add3 = rs.getString("Password");
        jPasswordField1.setText(add3);
        String add4 = rs.getString("Level");
        LevelC.setSelectedItem(add4);
        }
        }
      catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
     }
    }//GEN-LAST:event_SearchBActionPerformed

    private void UpdateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBActionPerformed
if("".equals(JUsername.getText())||"".equals(JUserID.getText())||"".equals(jPasswordField1.getText())||"".equals(JUser.getText())){
     JOptionPane.showMessageDialog(null, "Enter Valid Data");
     }
        if("".equals(JUser.getText())){
     JOptionPane.showMessageDialog(null, "Enter AdminID");
     }
          if("".equals(jPassword.getText())){
     JOptionPane.showMessageDialog(null, "Enter AdminPassword");
     }          else{
         String password = jPassword.getText();
            String user1 = JUser.getText();
            String passfromDb="";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
                String Sql = "Select password from USERINFO where USERID=? and level = 'admin' ";

                pst = Conn.prepareStatement(Sql);
                pst.setString(1,user1);
                rs = pst.executeQuery();
                if(rs.next()){
                    passfromDb =  rs.getString("password");
                }

                if(password.equals(passfromDb)){
                        String password1 = jPasswordField1.getText();
        String Nuser = JUsername.getText();
        String userid = jPasswordField1.getText();
        String level =  (String) LevelC.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn1 = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
                
            pst = Conn.prepareStatement("update USERINFO set Username=?,Password=?,Level=? where UserID ='" +JUserID.getText()+"'");
            pst.setString(1,Nuser);
            pst.setString(2,userid);
            pst.setString(3,level);
            int i = pst.executeUpdate();
            if(i>0){
            
                JOptionPane.showMessageDialog(null, "Saved");
                     
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Not Saved");
            }
            pst.close();
            Conn.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

        JUsername.setText(null);
        JUserID.setText(null);
        jPasswordField1.setText(null);
                 
                }

                else{
                    JOptionPane.showMessageDialog(null, "Invalid user or password","Access Denied",JOptionPane.ERROR_MESSAGE);
                    jPassword.setText(null);
                    JUser.setText(null);
                }
                rs.close();
                pst.close();
                Conn.close();
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);

            }

        
        JUsername.setText(null);
        JUserID.setText(null);
        jPasswordField1.setText(null);
        jPassword.setText(null);
        JUser.setText(null);
          }
    }//GEN-LAST:event_UpdateBActionPerformed

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
if("".equals(JUsername.getText())||"".equals(JUserID.getText())||"".equals(jPasswordField1.getText())){
     JOptionPane.showMessageDialog(null, "Enter Valid Data");
     }
        if("".equals(JUser.getText())){
     JOptionPane.showMessageDialog(null, "Enter AdminID");
     }
          if("".equals(jPassword.getText())){
     JOptionPane.showMessageDialog(null, "Enter AdminPassword");
     }          else{
         String password = jPassword.getText();
            String user1 = JUser.getText();
            String passfromDb="";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection Conn = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
                String Sql = "Select password from USERINFO where USERID=? and level = 'admin' ";

                pst = Conn.prepareStatement(Sql);
                pst.setString(1,user1);
                rs = pst.executeQuery();
                if(rs.next()){
                    passfromDb =  rs.getString("password");
                }

                if(password.equals(passfromDb)){
        String password1 = jPasswordField1.getText();
        String Nuser = JUsername.getText();
        String userid = JUserID.getText();
        String level =  (String) LevelC.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn1 = DriverManager.getConnection("jdbc:mysql:///java_project","root","sarilla1427");
                
            pst = Conn.prepareStatement("delete from USERINFO where UserID =?");
            pst.setString(1,userid);
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            else{
                JOptionPane.showMessageDialog(null, "Not Deleted");
            }
            pst.close();
            Conn.close();
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        JUsername.setText(null);
        JUserID.setText(null);
        jPasswordField1.setText(null);
        Search_T.setText(null);
                }

                else{
                    JOptionPane.showMessageDialog(null, "Invalid user or password","Access Denied",JOptionPane.ERROR_MESSAGE);
                    jPassword.setText(null);
                    JUser.setText(null);
                }
                rs.close();
                pst.close();
                Conn.close();
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);

            }

        
        JUsername.setText(null);
        JUserID.setText(null);
        jPasswordField1.setText(null);
        jPassword.setText(null);
        JUser.setText(null);
          }
         
    }//GEN-LAST:event_DeleteBActionPerformed

    private void User_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_ListActionPerformed
        UserDetails ud = new UserDetails();
        ud.setVisible(true);
    }//GEN-LAST:event_User_ListActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteB;
    private javax.swing.JTextField JUser;
    private javax.swing.JTextField JUserID;
    private javax.swing.JTextField JUsername;
    private javax.swing.JComboBox<String> LevelC;
    private javax.swing.JButton SearchB;
    private javax.swing.JTextField Search_T;
    private javax.swing.JButton Submit_B;
    private javax.swing.JButton UpdateB;
    private javax.swing.JButton User_List;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
