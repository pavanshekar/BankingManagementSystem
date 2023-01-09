/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Administrator;

import Model.Organisation;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author pavansomashekar
 */
public class ManageOrganisationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganisationJPanel
     */
    
    private JPanel workJPanel;
    String role;
    Organisation organisation = new Organisation();
    
    public ManageOrganisationJPanel(JPanel workJPanel, String role) {
        initComponents();
        this.workJPanel = workJPanel;
        this.role = role;
        JTableHeader thead = orgJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateOrganisationTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageOrgJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgJTable = new javax.swing.JTable();
        orgJLabel = new javax.swing.JLabel();
        orgJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();

        manageOrgJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        manageOrgJLabel.setText("Manage Organisation");

        orgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Organisation"
            }
        ));
        orgJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orgJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orgJTable);

        orgJLabel.setText("Enter the organisation");

        submitJButton.setBackground(new java.awt.Color(0, 255, 0));
        submitJButton.setText("Add");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        updateJButton.setBackground(new java.awt.Color(0, 255, 0));
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageOrgJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orgJLabel)
                    .addComponent(submitJButton))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateJButton)
                    .addComponent(orgJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteJButton)
                    .addComponent(backJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(manageOrgJLabel)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgJLabel)
                    .addComponent(orgJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(updateJButton))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        String orgType="";
        String orgName = orgJTextField.getText();
        if(orgName.equals("")){
            JOptionPane.showMessageDialog(this, "Enter the organisation name");
        }
        else{
            if(role.equals("BankingAdmin")){
                orgType = "BankingOrganisation";
            }
            else if(role.equals("CardAdmin")){
                orgType = "CardOrganisation";
            }
            else if(role.equals("CardVerificationAdmin")){
                orgType = "CardVerificationOrganisation";
            }
            else if(role.equals("LoanAdmin")){
                orgType = "LoanOrganisation";
            }
            else if(role.equals("LoanVerificationAdmin")){
                orgType = "LoanVerificationOrganisation";
            }
            organisation.addOrganisation(orgName, orgType);
            
            JOptionPane.showMessageDialog(this, "Organisation added");
            
            populateOrganisationTable();
            
            orgJTextField.setText("");
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();

        int selectedRowIndex = orgJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }

        String username = model.getValueAt(selectedRowIndex, 0).toString();
        organisation.deleteOrganisation(username);

        JOptionPane.showMessageDialog(this, "Organisation deleted");

        populateOrganisationTable();

        orgJTextField.setText("");
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();
        int selectedRowIndex = orgJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to update.");
            return;
        }

        if(orgJTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter the organisation");
        }
        else{
            String orgName = orgJTextField.getText();

            String condition = model.getValueAt(selectedRowIndex, 0).toString();

            organisation.updateOrganisation(condition, orgName);

            JOptionPane.showMessageDialog(this,"Employee updated.");

            populateOrganisationTable();

            orgJTextField.setText("");
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void orgJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgJTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();
        
        int selectedRowIndex = orgJTable.getSelectedRow();
        
        orgJTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_orgJTableMouseClicked

    private void populateOrganisationTable() {
        DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();

        model.setRowCount(0);
        
        try{
            ResultSet rs = organisation.getOrganisations(role);
            while(rs.next()){
            Object[] rows = new Object[1];
            rows[0]= rs.getString(1);
            model.addRow(rows);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageOrgJLabel;
    private javax.swing.JLabel orgJLabel;
    private javax.swing.JTable orgJTable;
    private javax.swing.JTextField orgJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
