/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Model.Customer;
import Model.CustomerDirectory;
import Model.Transaction;
import Model.TransactionDirectory;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class TransferJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransferJPanel
     */
    private JPanel workJPanel;
    private String username;
    private int withdrawBalance;
    private int depositBalance;
    private String customerName;
    
    CustomerDirectory customer = new CustomerDirectory();
    TransactionDirectory transaction = new TransactionDirectory();
    
    public TransferJPanel(JPanel workJPanel, String username) {
        initComponents();
        this.workJPanel = workJPanel;
        this.username = username;
        populateUsernameComboBox();
        populateWithdrawAccountBalance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transferJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        usernameJLabel = new javax.swing.JLabel();
        usernameJComboBox = new javax.swing.JComboBox<>();
        amountJLabel = new javax.swing.JLabel();
        amountJTextField = new javax.swing.JTextField();
        transferJButton = new javax.swing.JButton();

        transferJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        transferJLabel.setText("Transfer");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        usernameJLabel.setText("Username");

        amountJLabel.setText("Enter the amount");

        amountJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountJTextFieldKeyPressed(evt);
            }
        });

        transferJButton.setBackground(new java.awt.Color(0, 255, 0));
        transferJButton.setText("Transfer");
        transferJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(173, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(amountJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(transferJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(transferJLabel)
                .addGap(41, 41, 41)
                .addComponent(backJButton)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountJLabel)
                    .addComponent(amountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(transferJButton)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void transferJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferJButtonActionPerformed
        // TODO add your handling code here:
        if(amountJTextField.getText().equals((""))){
            JOptionPane.showMessageDialog(this, "Enter the amount to be transferred");
        }
        else{
            customerName = usernameJComboBox.getSelectedItem().toString();
            populateDepositAccountBalance();
            int amount = Integer.parseInt(amountJTextField.getText());
            
            if(amount>withdrawBalance){
                JOptionPane.showMessageDialog(this,"Insufficient funds");
            }
            else{
                int balanceAfterWithdraw = withdrawBalance-amount;
                int balanceAfterDeposit = depositBalance+amount;
            
                customer.updateAccountBalance(username, balanceAfterWithdraw);
                customer.updateAccountBalance(customerName, balanceAfterDeposit);
            
                transaction.addTransaction(username, "Debit", amount, balanceAfterWithdraw);
                transaction.addTransaction(customerName, "Credit", amount, balanceAfterDeposit);
            
                JOptionPane.showMessageDialog(this, "Amount has been transferred");
            
                amountJTextField.setText("");
            }
        }
    }//GEN-LAST:event_transferJButtonActionPerformed

    private void amountJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountJTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        String phNo = amountJTextField.getText();
        int length = phNo.length();
        
        if(Character.isDigit(c)){
            if(length<10){
                amountJTextField.setEditable(true);
            }
            else{
                amountJTextField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                amountJTextField.setEditable(true);
            } 
            else{
                amountJTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_amountJTextFieldKeyPressed

    private void populateUsernameComboBox() {
        
        usernameJComboBox.removeAllItems();

        try{ 
            ResultSet rs = customer.getCustomers(username);
            while(rs.next()){
            usernameJComboBox.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    private void populateWithdrawAccountBalance() {

        for(Customer cust: customer.getCustomerDetails(username)){
            withdrawBalance = cust.getBalance();
        }
        
    }
    
    private void populateDepositAccountBalance() {

        for(Customer cust: customer.getCustomerDetails(customerName)){
            depositBalance = cust.getBalance();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountJLabel;
    private javax.swing.JTextField amountJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton transferJButton;
    private javax.swing.JLabel transferJLabel;
    private javax.swing.JComboBox<String> usernameJComboBox;
    private javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
