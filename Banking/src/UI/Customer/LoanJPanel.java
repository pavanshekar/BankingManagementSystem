/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Model.Customer;
import Model.Loan;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
    
    Customer customer = new Customer();
    Loan loan = new Loan();
    
    public LoanJPanel(JPanel workJPanel, String username) {
        initComponents();
        this.workJPanel = workJPanel;
        this.username = username;
        try{
            ResultSet rs = customer.getCustomerDetails(username);
            while(rs.next()){
                accNo = String.valueOf(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(loanJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(applyForLoanJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loanAmountJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loanTypeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loanTypeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loanAmountJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(applyJButton)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loanJLabel)
                .addGap(21, 21, 21)
                .addComponent(backJButton)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(applyForLoanJLabel)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanTypeJLabel)
                    .addComponent(loanTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanAmountJLabel)
                    .addComponent(loanAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(applyJButton)
                .addContainerGap(34, Short.MAX_VALUE))
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
        String loanType = (String) loanTypeJComboBox.getSelectedItem();
        String loanAmount = loanAmountJTextField.getText();
        Random r = new Random();
        int postfix = 10000 + r.nextInt(10000);
        String loanNo = "L"+String.valueOf(postfix);
        String status = "Sent to Loan Admin";
        
        loan.applyLoan(accNo, loanNo, loanType, loanAmount, status);
        
        JOptionPane.showMessageDialog(this, "Loan application request sent");
        
        populateLoanTable();
    }//GEN-LAST:event_applyJButtonActionPerformed

    private void populateLoanTable() {
        DefaultTableModel model = (DefaultTableModel) loanJTable.getModel();

        model.setRowCount(0);
        
        try{
            ResultSet rs = loan.getCustomerLoans(accNo);
            while(rs.next()){
            Object[] rows = new Object[4];
            rows[0]= rs.getString(1);
            rows[1]= rs.getString(2);
            rows[2]= rs.getString(3);
            rows[3]= rs.getString(4);
            model.addRow(rows);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
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
