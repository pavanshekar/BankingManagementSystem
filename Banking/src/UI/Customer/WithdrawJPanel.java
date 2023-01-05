/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class WithdrawJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WithdrawJPanel
     */
    
    private JPanel workJPanel;
    
    public WithdrawJPanel(JPanel workJPanel) {
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

        withdrawJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        withdrawJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        withdrawJLabel.setText("Withdraw");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(withdrawJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backJButton)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(withdrawJLabel)
                .addGap(36, 36, 36)
                .addComponent(backJButton)
                .addContainerGap(477, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel withdrawJLabel;
    // End of variables declaration//GEN-END:variables
}