/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mohamed
 */

public class login extends javax.swing.JFrame {
DBconnection con;
    public login() {
        initComponents();
        con = new DBconnection();
        if(con == null){
 JOptionPane.showMessageDialog(this, "Database connection problem","Error", JOptionPane.ERROR_MESSAGE);}
       
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        email_in = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        password_in = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("FreeSerif", 0, 12)); // NOI18N
        jLabel1.setText("E-mail");

        jLabel2.setFont(new java.awt.Font("FreeSerif", 0, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("LOG IN");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));

        loginbtn.setBackground(new java.awt.Color(102, 102, 255));
        loginbtn.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("LOG IN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        password_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(181, 181, 181))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(password_in, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_in, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_in, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_in, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
           String email = email_in.getText();
        
          String pass = new String(password_in.getPassword());
           if (email.isEmpty() && pass.isEmpty()){
           JOptionPane.showMessageDialog(this, "E-mail & Password should not be empty","Error", JOptionPane.ERROR_MESSAGE);}
          else
          if (email.isEmpty() ){
           JOptionPane.showMessageDialog(this, "E-mail  should not be empty","Error", JOptionPane.ERROR_MESSAGE);}
           else
           if (email.isEmpty() || pass.isEmpty()){
           JOptionPane.showMessageDialog(this, "Password should not be empty","Error", JOptionPane.ERROR_MESSAGE);}
           else {
        userLogin( email , pass);
        }

       
    }//GEN-LAST:event_loginbtnActionPerformed

    private void password_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_inActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
          
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password_in;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String email, String pass)  {
                    

       Connection cn = DBconnection.connecttodb();
    try {
       
        PreparedStatement pstm = (PreparedStatement) cn.prepareStatement("select email,name from users where (email = ? and name = ?)");
        pstm.setString(1, email);
               

        pstm.setString(2, pass);
        
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
        User_Page p = new User_Page();
        dispose();
        p.setTitle("user page");
        
        p.setVisible(true);
        
        }else{
           JOptionPane.showMessageDialog(this, "User Doesn't exist check your E-mail and password","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (SQLException ex) {
       System.out.println(ex.getMessage());
    }
    
    }
}
