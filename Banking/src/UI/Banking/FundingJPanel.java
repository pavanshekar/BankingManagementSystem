/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Banking;

import Model.NGO;
import Model.NGODirectory;
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
public class FundingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundingJPanel
     */
    private JPanel workJPanel;
    NGODirectory ngo = new NGODirectory();
    private String enterpriseName;
    private String action;
    private int fundsAvailable;
    
    public FundingJPanel(JPanel workJPanel, String enterpriseName) {
        initComponents();
        this.workJPanel = workJPanel;
        this.enterpriseName = enterpriseName;
        JTableHeader thead = fundsJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateFundsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processButtonGroup = new javax.swing.ButtonGroup();
        fundingJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fundsJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        approveJRadioButton = new javax.swing.JRadioButton();
        rejectJRadioButton = new javax.swing.JRadioButton();
        processJButton = new javax.swing.JButton();
        processFundRequestJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();

        fundingJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        fundingJLabel.setText("Funding");

        fundsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NGO", "Bank", "Reason", "Funds Requested", "Status"
            }
        ));
        jScrollPane1.setViewportView(fundsJTable);

        assignJButton.setBackground(new java.awt.Color(0, 255, 0));
        assignJButton.setText("Assign");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processButtonGroup.add(approveJRadioButton);
        approveJRadioButton.setText("Approve");
        approveJRadioButton.setActionCommand("Approve");

        processButtonGroup.add(rejectJRadioButton);
        rejectJRadioButton.setText("Reject");
        rejectJRadioButton.setActionCommand("Reject");

        processJButton.setBackground(new java.awt.Color(204, 204, 0));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        processFundRequestJLabel.setText("Process Fund Request");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        backJButton1.setText("Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fundingJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(processFundRequestJLabel)
                .addGap(48, 48, 48)
                .addComponent(approveJRadioButton)
                .addGap(33, 33, 33)
                .addComponent(rejectJRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(processJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addComponent(backJButton)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(fundingJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(backJButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveJRadioButton)
                    .addComponent(rejectJRadioButton)
                    .addComponent(processFundRequestJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(processJButton)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(backJButton)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) fundsJTable.getModel();
        int selectedRowIndex = fundsJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }
        String ngoName = model.getValueAt(selectedRowIndex, 0).toString();
        String bankName = model.getValueAt(selectedRowIndex, 1).toString();
        String reason = model.getValueAt(selectedRowIndex, 2).toString();
        int fundsRequested = Integer.parseInt(model.getValueAt(selectedRowIndex, 3).toString());
        String status = model.getValueAt(selectedRowIndex, 4).toString();
        
        if(bankName.equals("")){
            ngo.assignBank(ngoName, enterpriseName, reason, fundsRequested, status);
            JOptionPane.showMessageDialog(this,"Request is assigned");
            populateFundsTable();
        }
        else{
            JOptionPane.showMessageDialog(this,"Request has already been assigned");
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) fundsJTable.getModel();
        int selectedRowIndex = fundsJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }

        String ngoName = model.getValueAt(selectedRowIndex, 0).toString();
        String bankName = model.getValueAt(selectedRowIndex, 1).toString();
        String reason = model.getValueAt(selectedRowIndex, 2).toString();
        int fundsRequested = Integer.parseInt(model.getValueAt(selectedRowIndex, 3).toString());
        String status = model.getValueAt(selectedRowIndex, 4).toString();
        
        if(bankName.equals("")){
            JOptionPane.showMessageDialog(this,"Request not assigned");
        }
        else if(status.equals("Funds Requested")){
            if(processButtonGroup.getSelection()==null){
                JOptionPane.showMessageDialog(this, "Select the option");
            }
            else{
                action = processButtonGroup.getSelection().getActionCommand();
                if(action.equals("Approve")){
                    ngo.updateFundRequestStatus(ngoName, bankName, reason, fundsRequested, "Approved");
                    try{
                        ResultSet rs = ngo.getFundsAvailable(ngoName);
                        while(rs.next()){
                            fundsAvailable = rs.getInt(1);
                        }
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    int updatedFunds = fundsAvailable+fundsRequested;
                    ngo.updateFundsAvailable(ngoName, updatedFunds);
                    
                    JOptionPane.showMessageDialog(this, "Fund request approved");
                    populateFundsTable();
                }
                else{
                    ngo.updateFundRequestStatus(ngoName, bankName, reason, fundsRequested, "Rejected");
                    JOptionPane.showMessageDialog(this, "Fund request rejected");
                    populateFundsTable();
                }
            }
        }
        else if(status.equals("Approved")){
            JOptionPane.showMessageDialog(this, "Fund request has been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Fund request has been rejected");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButton1ActionPerformed

    
    private void populateFundsTable() {
        DefaultTableModel model = (DefaultTableModel) fundsJTable.getModel();

        model.setRowCount(0);

        for(NGO n: ngo.getFunds()){
            Object[] rows = new Object[5];
            rows[0]= n.getNgo();
            rows[1]= n.getBank();
            rows[2]= n.getReason();
            rows[3]= n.getFundsRequested();
            rows[4]= n.getStatus();
            model.addRow(rows);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approveJRadioButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel fundingJLabel;
    private javax.swing.JTable fundsJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup processButtonGroup;
    private javax.swing.JLabel processFundRequestJLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JRadioButton rejectJRadioButton;
    // End of variables declaration//GEN-END:variables
}
