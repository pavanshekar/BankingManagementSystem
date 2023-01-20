/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Model.Customer;
import Model.CustomerDirectory;
import Model.Loan;
import Model.LoanDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author pavansomashekar
 */
public class LoanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoanJPanel
     */
    
    private JPanel workJPanel;
    private String username;
    private String accNo;
    
    CustomerDirectory customer = new CustomerDirectory();
    LoanDirectory loan = new LoanDirectory();
    
    public LoanJPanel(JPanel workJPanel, String username) {
        initComponents();
        this.workJPanel = workJPanel;
        this.username = username;
        for(Customer cust: customer.getCustomerDetails(username)){
            accNo = cust.getAccNo();
        }
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

        loanJLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanJTable = new javax.swing.JTable();
        applyForLoanJLabel = new javax.swing.JLabel();
        loanTypeJLabel = new javax.swing.JLabel();
        loanTypeJComboBox = new javax.swing.JComboBox<>();
        loanAmountJLabel = new javax.swing.JLabel();
        loanAmountJTextField = new javax.swing.JTextField();
        applyJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        loanJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        loanJLabel.setText("Loan");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        loanJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Acc No", "Loan No", "Loan Type", "Loan Amount"
            }
        ));
        jScrollPane1.setViewportView(loanJTable);

        applyForLoanJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        applyForLoanJLabel.setText("Apply for Loan");

        loanTypeJLabel.setText("Loan Type");

        loanTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Loan", "Personal Loan", "House Loan", "Car Loan" }));

        loanAmountJLabel.setText("Loan Amount");

        loanAmountJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loanAmountJTextFieldKeyPressed(evt);
            }
        });

        applyJButton.setBackground(new java.awt.Color(0, 255, 0));
        applyJButton.setText("Apply");
        applyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loanJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loanAmountJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loanTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loanTypeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loanAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyForLoanJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(applyJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(loanJLabel)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(applyForLoanJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanTypeJLabel)
                    .addComponent(loanTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanAmountJLabel)
                    .addComponent(loanAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(applyJButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void applyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyJButtonActionPerformed
        // TODO add your handling code here:
        if(loanAmountJTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter the loan amount");
        }
        else{
            String loanType = (String) loanTypeJComboBox.getSelectedItem();
            String loanAmount = loanAmountJTextField.getText();
            Random r = new Random();
            int postfix = 10000 + r.nextInt(10000);
            String loanNo = "L"+String.valueOf(postfix);
            String status = "Sent to Loan Officer";

            loan.applyLoan(accNo, loanNo, loanType, loanAmount, status);

            JOptionPane.showMessageDialog(this, "Loan application request sent");

            populateLoanTable();

            loanAmountJTextField.setText("");
        }
    }//GEN-LAST:event_applyJButtonActionPerformed

    private void loanAmountJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loanAmountJTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        String phNo = loanAmountJTextField.getText();
        int length = phNo.length();
        
        if(Character.isDigit(c)){
            if(length<10){
                loanAmountJTextField.setEditable(true);
            }
            else{
                loanAmountJTextField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                loanAmountJTextField.setEditable(true);
            } 
            else{
                loanAmountJTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_loanAmountJTextFieldKeyPressed

    private void populateLoanTable() {
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();

        model.setRowCount(0);

        for(Loan l: loan.getCustomerLoans(accNo)){
            Object[] rows = new Object[4];
            rows[0]= l.getAccNo();
            rows[1]= l.getLoanNo();
            rows[2]= l.getLoanType();
            rows[3]= l.getLoanAmount();
            model.addRow(rows);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applyForLoanJLabel;
    private javax.swing.JButton applyJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loanAmountJLabel;
    private javax.swing.JTextField loanAmountJTextField;
    private javax.swing.JLabel loanJLabel;
    private javax.swing.JTable loanJTable;
    private javax.swing.JComboBox<String> loanTypeJComboBox;
    private javax.swing.JLabel loanTypeJLabel;
    // End of variables declaration//GEN-END:variables
}
