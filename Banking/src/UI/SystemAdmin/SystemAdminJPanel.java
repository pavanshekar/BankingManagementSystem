/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminJPanel
     */
    private JPanel workJPanel;
    ManageNetworkJPanel manageNetworkJPanel;
    ManageEnterpriseJPanel manageEnterpriseJPanel;
    
    public SystemAdminJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        networkButton = new javax.swing.JButton();
        enterpriseButton = new javax.swing.JButton();
        adminJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        networkButton.setBackground(new java.awt.Color(204, 204, 0));
        networkButton.setText("Manage Network");
        networkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkButtonActionPerformed(evt);
            }
        });

        enterpriseButton.setBackground(new java.awt.Color(204, 204, 0));
        enterpriseButton.setText("Manage Enterprise");
        enterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseButtonActionPerformed(evt);
            }
        });

        adminJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        adminJLabel.setText("Admin");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/admin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(networkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterpriseButton)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(adminJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkButton)
                    .addComponent(enterpriseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkButtonActionPerformed
        CardLayout layout=(CardLayout)workJPanel.getLayout();
        manageNetworkJPanel = new ManageNetworkJPanel(workJPanel);
        workJPanel.add("workArea", manageNetworkJPanel);
        layout.next(workJPanel);
    }//GEN-LAST:event_networkButtonActionPerformed

    private void enterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)workJPanel.getLayout();
        manageEnterpriseJPanel = new ManageEnterpriseJPanel(workJPanel);
        workJPanel.add("workArea", manageEnterpriseJPanel);
        layout.next(workJPanel);
    }//GEN-LAST:event_enterpriseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminJLabel;
    private javax.swing.JButton enterpriseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton networkButton;
    // End of variables declaration//GEN-END:variables
}