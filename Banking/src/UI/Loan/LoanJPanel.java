/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Loan;

import Model.Loan;
import java.awt.CardLayout;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavansomashekar
 */
public class LoanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoanAdminJPanel
     */
    
    private JPanel workJPanel;
    Loan loan = new Loan();
    private String action;
    CheckLoanInsightsJPanel checkLoanInsightsJPanel;
    
    public LoanJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
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
        loanAdminJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanJTable = new javax.swing.JTable();
        processLoanRequestJLabel = new javax.swing.JLabel();
        approveJRadioButton = new javax.swing.JRadioButton();
        rejectJRadioButton = new javax.swing.JRadioButton();
        processJButton = new javax.swing.JButton();
        sendForVerificationJButton = new javax.swing.JButton();
        checkInsightsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        loanAdminJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        loanAdminJLabel.setText("Loan Officer");

        loanJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Acc No", "Loan No", "Loan Type", "Loan Amount", "Status"
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

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        sendForVerificationJButton.setText("Send for Verification");
        sendForVerificationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendForVerificationJButtonActionPerformed(evt);
            }
        });

        checkInsightsJButton.setText("Check Insights");
        checkInsightsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInsightsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(processLoanRequestJLabel)
                        .addGap(70, 70, 70)
                        .addComponent(approveJRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(rejectJRadioButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(checkInsightsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(processJButton)
                                .addGap(71, 71, 71)
                                .addComponent(sendForVerificationJButton)))
                        .addGap(23, 23, 23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loanAdminJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(loanAdminJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processLoanRequestJLabel)
                    .addComponent(approveJRadioButton)
                    .addComponent(rejectJRadioButton))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(sendForVerificationJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(checkInsightsJButton)
                .addContainerGap(59, Short.MAX_VALUE))
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

        String status = model.getValueAt(selectedRowIndex, 4).toString();
        if(status.equals("Sent to Loan Officer")){
            if(processLoanRequestButtonGroup.getSelection()==null){
                JOptionPane.showMessageDialog(this, "Select the option");
            }
            else{
                action = processLoanRequestButtonGroup.getSelection().getActionCommand();
                String loanNo = model.getValueAt(selectedRowIndex, 1).toString();
                if(action.equals("Approve")){
                    loan.updateLoanStatus(loanNo, "Approved by Loan Officer");
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
            JOptionPane.showMessageDialog(this, "Loan request has already been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Loan request has been rejected");
        }
        else if(status.equals("Sent for Verification")){
            JOptionPane.showMessageDialog(this, "Loan request is sent for verification");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void sendForVerificationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendForVerificationJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();
        int selectedRowIndex = loanJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }

        String status = model.getValueAt(selectedRowIndex, 4).toString();
        if(status.equals("Approved by Loan Officer")){
            String loanNo = model.getValueAt(selectedRowIndex, 1).toString();
            loan.updateLoanStatus(loanNo, "Sent for Verification");
            JOptionPane.showMessageDialog(this,"Loan request sent for verification");
            populateLoanTable();
        }
        else if(status.equals("Approved")){
            JOptionPane.showMessageDialog(this, "Loan request has been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Loan request has been rejected");
        }
        else if(status.equals("Sent for Verification")){
            JOptionPane.showMessageDialog(this, "Loan request is sent for verification");
        }
        else{
            JOptionPane.showMessageDialog(this, "Loan request should be approved by Loan Officer");
        }
    }//GEN-LAST:event_sendForVerificationJButtonActionPerformed

    private void checkInsightsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInsightsJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)workJPanel.getLayout();
        checkLoanInsightsJPanel = new CheckLoanInsightsJPanel(workJPanel);
        workJPanel.add("workArea", checkLoanInsightsJPanel);
        layout.next(workJPanel);
    }//GEN-LAST:event_checkInsightsJButtonActionPerformed

    private void populateLoanTable() {
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();

        model.setRowCount(0);
        
        try{
            ResultSet rs = loan.getLoans();
            while(rs.next()){
            Object[] rows = new Object[5];
            rows[0]= rs.getString(1);
            rows[1]= rs.getString(2);
            rows[2]= rs.getString(3);
            rows[3]= rs.getString(4);
            rows[4]= rs.getString(5);
            model.addRow(rows);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approveJRadioButton;
    private javax.swing.JButton checkInsightsJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loanAdminJLabel;
    private javax.swing.JTable loanJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.ButtonGroup processLoanRequestButtonGroup;
    private javax.swing.JLabel processLoanRequestJLabel;
    private javax.swing.JRadioButton rejectJRadioButton;
    private javax.swing.JButton sendForVerificationJButton;
    // End of variables declaration//GEN-END:variables
}
