package GUI.src;

import Backend.HiProject;
import Backend.Serialization;
import Backend.UsersList;
import Exceptions.UserDoesntExistException;

import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@SuppressWarnings("Duplicates")
public class LogInPage extends javax.swing.JFrame {
    private static Serialization serialization = new Serialization(String.format("%s\\HiProject.data", System.getProperty("user.dir")));

    /**
     * Creates new form Homepage
     */
    public LogInPage() {
        initComponents();
        setLookAndFeel();
    }

    private void authenticate() {
        HiProject hiProject = serialization.load();
        if (emailTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please insert an email.");
            emailTextField.requestFocus();
        } else if (passwordField.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Please insert a password.");
            passwordField.requestFocus();
        } else if (!hiProject.authenticateUser(emailTextField.getText(), new String(passwordField.getPassword()))) {
            JOptionPane.showMessageDialog(null, "The username or password is not valid.", "Authentication", JOptionPane.WARNING_MESSAGE);
            emailTextField.requestFocus();
        } else {
            dispose();
            try {
                hiProject.setConnectedUser(hiProject.getUsers().getUser(emailTextField.getText()));
            } catch (UserDoesntExistException e) {
                e.printStackTrace();
            }
            serialization.save(hiProject);
            new Homepage(hiProject.getConnectedUser()).setVisible(true);
        }

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
        logInLabel = new javax.swing.JLabel();
        createAccLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        logInButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

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
        jPanel1.setLayout(null);

        logInLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        logInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInLabel.setText("Log in to HiProject");
        jPanel1.add(logInLabel);
        logInLabel.setBounds(305, 122, 339, 49);

        createAccLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        createAccLabel.setForeground(new java.awt.Color(51, 102, 187));
        createAccLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAccLabel.setText("<HTML><U>or create an account</U></HTML>");
        createAccLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccLabelMouseClicked(evt);
            }
        });
        jPanel1.add(createAccLabel);
        createAccLabel.setBounds(305, 177, 183, 32);

        emailLabel.setFont(new java.awt.Font("Verdana Pro Light", 0, 20)); // NOI18N
        emailLabel.setText("Email");
        jPanel1.add(emailLabel);
        emailLabel.setBounds(305, 255, 49, 31);
        jPanel1.add(emailTextField);
        emailTextField.setBounds(305, 292, 385, 30);

        passwordLabel.setFont(new java.awt.Font("Verdana Pro Light", 0, 20)); // NOI18N
        passwordLabel.setText("Password");
        jPanel1.add(passwordLabel);
        passwordLabel.setBounds(305, 340, 87, 31);

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField);
        passwordField.setBounds(305, 377, 385, 30);

        logInButton.setBackground(new java.awt.Color(0, 153, 0));
        logInButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logInButton);
        logInButton.setBounds(305, 425, 385, 39);

        background.setIcon(new javax.swing.ImageIcon(String.format("%s\\Images\\BackgroundLogIN.jpg", System.getProperty("user.dir"))));
        jPanel1.add(background);
        background.setBounds(0, 0, 1000, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccLabelMouseClicked
        this.dispose();
        new CreateAccPage().setVisible(true);


    }//GEN-LAST:event_createAccLabelMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jPanel1.requestFocus();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        authenticate();
    }//GEN-LAST:event_logInButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        logInButtonActionPerformed(evt);
    }//GEN-LAST:event_passwordFieldActionPerformed

    private static void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


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
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel createAccLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel logInLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
