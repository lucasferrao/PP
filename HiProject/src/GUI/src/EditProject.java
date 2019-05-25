/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.src;

/**
 *
 * @author joaod
 */
public class EditProject extends javax.swing.JDialog {

    /**
     * Creates new form EditProject
     */
    public EditProject(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        editYourSelectedProjectLabel = new javax.swing.JLabel();
        projectEndDateLabel = new javax.swing.JLabel();
        projectTitleLabel = new javax.swing.JLabel();
        projectDescriptionLabel = new javax.swing.JLabel();
        projectTitleValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectDescriptionValue = new javax.swing.JTextArea();
        projectEndDateValue = new com.github.lgooddatepicker.components.DatePicker();
        saveChangesButton = new javax.swing.JButton();
        exitDontSaveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Project");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(540, 510));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setLayout(null);

        editYourSelectedProjectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editYourSelectedProjectLabel.setText("Edit Your Selected Project");
        editYourSelectedProjectLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(editYourSelectedProjectLabel);
        editYourSelectedProjectLabel.setBounds(0, 24, 540, 52);

        projectEndDateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        projectEndDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        projectEndDateLabel.setText("Project End Date:");
        jPanel1.add(projectEndDateLabel);
        projectEndDateLabel.setBounds(10, 163, 150, 35);

        projectTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        projectTitleLabel.setText("Project Title:");
        projectTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(projectTitleLabel);
        projectTitleLabel.setBounds(10, 108, 150, 35);

        projectDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        projectDescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        projectDescriptionLabel.setText("Project Description:");
        jPanel1.add(projectDescriptionLabel);
        projectDescriptionLabel.setBounds(10, 216, 150, 35);

        projectTitleValue.setText("jTextField1");
        projectTitleValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectTitleValueActionPerformed(evt);
            }
        });
        jPanel1.add(projectTitleValue);
        projectTitleValue.setBounds(196, 110, 280, 35);

        projectDescriptionValue.setColumns(20);
        projectDescriptionValue.setRows(5);
        jScrollPane1.setViewportView(projectDescriptionValue);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(196, 216, 280, 180);
        jPanel1.add(projectEndDateValue);
        projectEndDateValue.setBounds(196, 163, 280, 35);

        saveChangesButton.setText("Save Changes");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveChangesButton);
        saveChangesButton.setBounds(64, 449, 116, 23);

        exitDontSaveButton.setText("Exit and Don't Save");
        jPanel1.add(exitDontSaveButton);
        exitDontSaveButton.setBounds(297, 449, 139, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(String.format("%s\\Images\\DefaultBackground.png", System.getProperty("user.dir"))));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(553, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void projectTitleValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectTitleValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectTitleValueActionPerformed

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveChangesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditProject dialog = new EditProject(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editYourSelectedProjectLabel;
    private javax.swing.JButton exitDontSaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectDescriptionLabel;
    private javax.swing.JTextArea projectDescriptionValue;
    private javax.swing.JLabel projectEndDateLabel;
    private com.github.lgooddatepicker.components.DatePicker projectEndDateValue;
    private javax.swing.JLabel projectTitleLabel;
    private javax.swing.JTextField projectTitleValue;
    private javax.swing.JButton saveChangesButton;
    // End of variables declaration//GEN-END:variables
}
