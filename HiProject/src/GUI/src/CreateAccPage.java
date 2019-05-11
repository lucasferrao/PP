package GUI.src;

import Backend.HiProject;
import Backend.Project;
import Backend.User;
import Backend.UsersList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael
 */
public class CreateAccPage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public CreateAccPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createAccLabel = new javax.swing.JLabel();
        logInLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        createAccButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in to HiProject");
        setBackground(new java.awt.Color(73, 200, 235));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setName("LogInFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("colorPanel"); // NOI18N
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        createAccLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        createAccLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAccLabel.setText("Create a HiProject Account");

        logInLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        logInLabel.setForeground(new java.awt.Color(51, 102, 187));
        logInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInLabel.setText("<HTML><U>or sign in to your account</U></HTML>");
        logInLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInLabelMouseClicked(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Verdana Pro Light", 0, 20)); // NOI18N
        nameLabel.setText("Name");

        passwordLabel.setFont(new java.awt.Font("Verdana Pro Light", 0, 20)); // NOI18N
        passwordLabel.setText("Password");

        createAccButton.setBackground(new java.awt.Color(0, 153, 0));
        createAccButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        createAccButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccButton.setText("Create New Account");
        createAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccButtonActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Verdana Pro Light", 0, 20)); // NOI18N
        emailLabel.setText("Email");

        confirmPasswordLabel.setFont(new java.awt.Font("Verdana Pro Light", 0, 20)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password");

        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createAccLabel)
                    .addComponent(passwordLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(createAccButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                        .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(nameLabel)
                    .addComponent(logInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(confirmPasswordLabel))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(createAccLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logInLabel)
                .addGap(34, 34, 34)
                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(618, 618, 618))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInLabelMouseClicked
        this.dispose();
        new LogInPage().setVisible(true);

    }//GEN-LAST:event_logInLabelMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jPanel1.requestFocus();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void createAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccButtonActionPerformed
        HiProject hiProject = new HiProject();
        if (nameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please insert a name.");
            nameTextField.requestFocus();
        } else if (emailTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please insert an email.");
            emailTextField.requestFocus();
        } else if (passwordField.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Please insert a password.");
            passwordField.requestFocus();
        } else if (!Arrays.equals(confirmPasswordField.getPassword(), passwordField.getPassword())) {
            JOptionPane.showMessageDialog(null, "The passwords have to be the same!", "Authentication", JOptionPane.WARNING_MESSAGE);
            confirmPasswordField.requestFocus();
        } else {
            hiProject.registerNewUser(nameTextField.getText(), emailTextField.getText(), new String(passwordField.getPassword()));
            dispose();
            //then opens homepage with this user logged in
        }

    }//GEN-LAST:event_createAccButtonActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        createAccButtonActionPerformed(evt);
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(CreateAccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JButton createAccButton;
    private javax.swing.JLabel createAccLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logInLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}