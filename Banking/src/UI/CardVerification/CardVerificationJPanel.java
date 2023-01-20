/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CardVerification;

import Model.Card;
import Model.CardDirectory;
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
public class CardVerificationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VerificationAdminJPanel
     */
    
    private JPanel workJPanel;
    private String username;
    CardDirectory card = new CardDirectory();
    private String action;
    
    public CardVerificationJPanel(JPanel workJPanel, String username) {
        initComponents();
        this.workJPanel = workJPanel;
        this.username = username;
        JTableHeader thead = cardJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateCardTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processCardRequestButtonGroup = new javax.swing.ButtonGroup();
        verificationAdminJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardJTable = new javax.swing.JTable();
        processCardRequestJLabel = new javax.swing.JLabel();
        approveJRadioButton = new javax.swing.JRadioButton();
        rejectJRadioButton = new javax.swing.JRadioButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        verificationAdminJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        verificationAdminJLabel.setText("Card Verification Officer");

        cardJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Acc No", "Card No", "Card Type", "Card Officer", "Card Verification Officer", "Status"
            }
        ));
        jScrollPane1.setViewportView(cardJTable);

        processCardRequestJLabel.setText("Process Card Request");

        processCardRequestButtonGroup.add(approveJRadioButton);
        approveJRadioButton.setText("Approve");
        approveJRadioButton.setActionCommand("Approve");

        processCardRequestButtonGroup.add(rejectJRadioButton);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(processCardRequestJLabel)
                        .addGap(70, 70, 70)
                        .addComponent(approveJRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(rejectJRadioButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(processJButton)
                        .addGap(138, 138, 138)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificationAdminJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(verificationAdminJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processCardRequestJLabel)
                    .addComponent(approveJRadioButton)
                    .addComponent(rejectJRadioButton))
                .addGap(61, 61, 61)
                .addComponent(processJButton)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) cardJTable.getModel();
        int selectedRowIndex = cardJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }

        String cardVerificationOrg = model.getValueAt(selectedRowIndex, 4).toString();
        String status = model.getValueAt(selectedRowIndex, 5).toString();
        if(cardVerificationOrg.equals("")){
            JOptionPane.showMessageDialog(this,"Request not assigned");
        } 
        else if(status.equals("Sent for Verification")){
            if(processCardRequestButtonGroup.getSelection()==null){
                JOptionPane.showMessageDialog(this, "Select the option");
            }
            else{
                action = processCardRequestButtonGroup.getSelection().getActionCommand();
                String cardNo = model.getValueAt(selectedRowIndex, 1).toString();
                if(action.equals("Approve")){
                    card.updateCardStatus(cardNo, "Approved");
                    JOptionPane.showMessageDialog(this, "Credit card request approved");
                    populateCardTable();
                }
                else{
                    card.updateCardStatus(cardNo, "Rejected");
                    JOptionPane.showMessageDialog(this, "Credit card request rejected");
                    populateCardTable();
                }
            }
        }
        else if(status.equals("Approved")){
            JOptionPane.showMessageDialog(this, "Credit card request has been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Credit card request has been rejected");
        }
        else if(status.equals("Sent to Card Officer")){
            JOptionPane.showMessageDialog(this, "Credit card request should be approved by Card Officer");
        }
        else if(status.equals("Approved by Card Officer")){
            JOptionPane.showMessageDialog(this, "Credit card request is not sent for verification");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) cardJTable.getModel();
        int selectedRowIndex = cardJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }
        String cardNo = model.getValueAt(selectedRowIndex, 1).toString();
        String cardVerificationOrg = model.getValueAt(selectedRowIndex, 4).toString();
        if(cardVerificationOrg.equals("")){
            card.assignCardVerificationOfficer(cardNo, username);
            JOptionPane.showMessageDialog(this,"Request is assigned");
            populateCardTable();
        }
        else{
            JOptionPane.showMessageDialog(this,"Request has already been assigned");
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void populateCardTable() {
        DefaultTableModel model = (DefaultTableModel) cardJTable.getModel();

        model.setRowCount(0);

        for(Card c: card.getCards()){
            Object[] rows = new Object[6];
            rows[0] = c.getAccNo();
            rows[1] = c.getCardNo();
            rows[2] = c.getCardType();
            rows[3] = c.getCardOfficer();
            rows[4] = c.getCardVerificationOfficer();
            rows[5] = c.getStatus();
            model.addRow(rows);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approveJRadioButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JTable cardJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup processCardRequestButtonGroup;
    private javax.swing.JLabel processCardRequestJLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JRadioButton rejectJRadioButton;
    private javax.swing.JLabel verificationAdminJLabel;
    // End of variables declaration//GEN-END:variables
}
