/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CardAdmin;

import Model.Card;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavansomashekar
 */
public class CardAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CardAdminJPanel
     */
    
    private JPanel workJPanel;
    Card card = new Card();
    private String action;
    
    public CardAdminJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
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
        cardAdminJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardJTable = new javax.swing.JTable();
        processCardRequestJLabel = new javax.swing.JLabel();
        approveJRadioButton = new javax.swing.JRadioButton();
        rejectJRadioButton = new javax.swing.JRadioButton();
        processJButton = new javax.swing.JButton();
        sendForVerificationJButton = new javax.swing.JButton();

        cardAdminJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        cardAdminJLabel.setText("Card Admin");

        cardJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Acc No", "Card No", "Card Type", "Status"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(cardAdminJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(processCardRequestJLabel)
                .addGap(70, 70, 70)
                .addComponent(approveJRadioButton)
                .addGap(18, 18, 18)
                .addComponent(rejectJRadioButton)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(processJButton)
                .addGap(71, 71, 71)
                .addComponent(sendForVerificationJButton)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(cardAdminJLabel)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processCardRequestJLabel)
                    .addComponent(approveJRadioButton)
                    .addComponent(rejectJRadioButton))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(sendForVerificationJButton))
                .addContainerGap(97, Short.MAX_VALUE))
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
        
        String status = model.getValueAt(selectedRowIndex, 3).toString();
        if(status.equals("Sent to Card Admin")){
            if(processCardRequestButtonGroup.getSelection()==null){
                JOptionPane.showMessageDialog(this, "Select the option");
            }
            else{
                action = processCardRequestButtonGroup.getSelection().getActionCommand();
                String cardNo = model.getValueAt(selectedRowIndex, 1).toString();
                if(action.equals("Approve")){
                    card.updateCardStatus(cardNo, "Approved by Card Admin");
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
            JOptionPane.showMessageDialog(this, "Credit card request has already been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Credit card request has been rejected");
        }
        else if(status.equals("Sent for Verification")){
            JOptionPane.showMessageDialog(this, "Credit card request is sent for verification");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void sendForVerificationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendForVerificationJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) cardJTable.getModel();
        int selectedRowIndex = cardJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row.");
            return;
        }
        
        String status = model.getValueAt(selectedRowIndex, 3).toString();
        if(status.equals("Approved by Card Admin")){
            String cardNo = model.getValueAt(selectedRowIndex, 1).toString();
            card.updateCardStatus(cardNo, "Sent for Verification");
            JOptionPane.showMessageDialog(this,"Credit card request sent for verification");
            populateCardTable();
        }
        else if(status.equals("Approved")){
            JOptionPane.showMessageDialog(this, "Credit card request has been approved");
        }
        else if(status.equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Credit card request has been rejected");
        }
        else if(status.equals("Sent for Verification")){
            JOptionPane.showMessageDialog(this, "Credit card request is sent for verification");
        }
        else{
            JOptionPane.showMessageDialog(this, "Credit card request should be approved by Card Admin");
        }
    }//GEN-LAST:event_sendForVerificationJButtonActionPerformed

    private void populateCardTable() {
        DefaultTableModel model = (DefaultTableModel) cardJTable.getModel();

        model.setRowCount(0);
        
        try{ 
            ResultSet rs = card.getCards();
            while(rs.next()){
            Object[] rows = new Object[4];
            rows[0] = rs.getString(1);
            rows[1] = rs.getString(2);
            rows[2] = rs.getString(3);
            rows[3] = rs.getString(4);
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
    private javax.swing.JLabel cardAdminJLabel;
    private javax.swing.JTable cardJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup processCardRequestButtonGroup;
    private javax.swing.JLabel processCardRequestJLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JRadioButton rejectJRadioButton;
    private javax.swing.JButton sendForVerificationJButton;
    // End of variables declaration//GEN-END:variables
}
