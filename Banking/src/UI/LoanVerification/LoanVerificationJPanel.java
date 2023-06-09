/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LoanVerification;

import Model.Loan;
import Model.LoanDirectory;
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
public class LoanVerificationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoanVerificationAdminJPanel
     */
    
    private JPanel workJPanel;
    private String username;
    LoanDirectory loan = new LoanDirectory();
    private String action;
    
    public LoanVerificationJPanel(JPanel workJPanel, String username) {
        initComponents();
        this.workJPanel = workJPanel;
        this.username = username;
        JTableHeader thead = loanJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateLoanTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processLoanRequestButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanJTable = new javax.swing.JTable();
        processLoanRequestJLabel = new javax.swing.JLabel();
        approveJRadioButton = new javax.swing.JRadioButton();
        rejectJRadioButton = new javax.swing.JRadioButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Loan Verification Officer");

        loanJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Acc No", "Loan No", "Loan Type", "Loan Amount", "Loan Officer", "Loan Verification Officer", "Status"
            }
        ));
        jScrollPane1.setViewportView(loanJTable);

        processLoanRequestJLabel.setText("Process Loan Request");

        processLoanRequestButtonGroup.add(approveJRadioButton);
        approveJRadioButton.setText("Approve");
        approveJRadioButton.setActionCommand("Approve");

        processLoanRequestButtonGroup.add(rejectJRadioButton);
        rejectJRadioButton.setText("Reject");
        rejectJRadioButton.setActionCommand("Reject");

        processJButton.setBackground(new java.awt.Color(204, 204, 0));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(0, 255, 0));
        assignJButton.setText("Assign");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(processLoanRequestJLabel)
                        .addGap(70, 70, 70)
                        .addComponent(approveJRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(rejectJRadioButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(processJButton)
                        .addGap(140, 140, 140)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processLoanRequestJLabel)
                    .addComponent(approveJRadioButton)
                    .addComponent(rejectJRadioButton))
                .addGap(60, 60, 60)
                .addComponent(processJButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();
        int selectedRowIndex = loanJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }

        String loanVerificationOrg = model.getValueAt(selectedRowIndex, 5).toString();
        String status = model.getValueAt(selectedRowIndex, 6).toString();
        if(loanVerificationOrg.equals("")){
            JOptionPane.showMessageDialog(this,"Request not assigned");
        }
        else if(status.equals("Sent for Verification")){
            if(processLoanRequestButtonGroup.getSelection()==null){
                JOptionPane.showMessageDialog(this, "Select the option");
            }
            else{
                action = processLoanRequestButtonGroup.getSelection().getActionCommand();
                String loanNo = model.getValueAt(selectedRowIndex, 1).toString();
                if(action.equals("Approve")){
                    loan.updateLoanStatus(loanNo, "Approved");
                    JOptionPane.showMessageDialog(this, "Loan request approved");
                    populateLoanTable();
                }
                else{
                    loan.updateLoanStatus(loanNo, "Rejected");
                    JOptionPane.showMessageDialog(this, "Loan request rejected");
                    populateLoanTable();
                }
            }
        }
        else if(status.equals("Approved")){
            JOptionPane.showMessageDialog(this, "Loan request has been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Loan request has been rejected");
        }
        else if(status.equals("Sent to Loan Officer")){
            JOptionPane.showMessageDialog(this, "Loan request should be approved by Loan Officer");
        }
        else if(status.equals("Approved by Loan Officer")){
            JOptionPane.showMessageDialog(this, "Loan request is not sent for verification");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();
        int selectedRowIndex = loanJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }
        String loanNo = model.getValueAt(selectedRowIndex, 1).toString();
        String loanVerificationOrg = model.getValueAt(selectedRowIndex, 5).toString();
        if(loanVerificationOrg.equals("")){
            loan.assignLoanVerificationOfficer(loanNo, username);
            JOptionPane.showMessageDialog(this,"Request is assigned");
            populateLoanTable();
        }
        else{
            JOptionPane.showMessageDialog(this,"Request has been assigned");
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void populateLoanTable() {
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();

        model.setRowCount(0);

        for(Loan l: loan.getLoans()){
            Object[] rows = new Object[7];
            rows[0]= l.getAccNo();
            rows[1]= l.getLoanNo();
            rows[2]= l.getLoanType();
            rows[3]= l.getLoanAmount();
            rows[4]= l.getLoanOfficer();
            rows[5]= l.getLoanVerificationOfficer();
            rows[6]= l.getStatus();
            model.addRow(rows);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approveJRadioButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable loanJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.ButtonGroup processLoanRequestButtonGroup;
    private javax.swing.JLabel processLoanRequestJLabel;
    private javax.swing.JRadioButton rejectJRadioButton;
    // End of variables declaration//GEN-END:variables
}
