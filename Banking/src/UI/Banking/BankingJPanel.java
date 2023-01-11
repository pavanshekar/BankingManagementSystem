/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Banking;

import Model.Customer;
import Model.Enterprise;
import Model.Network;
import Model.UserAccount;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author pavansomashekar
 */
public class BankingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BankingAdminJPanel
     */
    private JPanel workJPanel;
    Customer customer = new Customer();
    Network network = new Network();
    Enterprise enterprise = new Enterprise();
    UserAccount userAccount = new UserAccount();
    
    public BankingJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
        JTableHeader thead = customerJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateCustomerTable();
        populateNetworkComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        accNoJLabel = new javax.swing.JLabel();
        balanceJLabel = new javax.swing.JLabel();
        accNoJTextField = new javax.swing.JTextField();
        balanceJTextField = new javax.swing.JTextField();
        fNameJLabel = new javax.swing.JLabel();
        lNameJLabel = new javax.swing.JLabel();
        fNameJTextField = new javax.swing.JTextField();
        lNameJTextField = new javax.swing.JTextField();
        emailJLabel = new javax.swing.JLabel();
        phNoJLabel = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        phNoJTextField = new javax.swing.JTextField();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        addressJLabel = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        networkJLabel = new javax.swing.JLabel();
        addCustomerJButton = new javax.swing.JButton();
        updateCustomerJButton = new javax.swing.JButton();
        deleteCustomerJButton = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox<>();
        jPasswordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Banking Officer");

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AccNo", "FName", "LName", "Email", "PhNo", "Address", "username", "Network", "Balance"
            }
        ));
        customerJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerJTable);

        accNoJLabel.setText("Acc No");

        balanceJLabel.setBackground(new java.awt.Color(204, 204, 204));
        balanceJLabel.setText("Balance");

        balanceJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                balanceJTextFieldKeyPressed(evt);
            }
        });

        fNameJLabel.setText("FName");

        lNameJLabel.setBackground(new java.awt.Color(204, 204, 204));
        lNameJLabel.setText("LName");

        emailJLabel.setText("Email");

        phNoJLabel.setBackground(new java.awt.Color(204, 204, 204));
        phNoJLabel.setText("Ph No");

        usernameJLabel.setText("Username");

        passwordJLabel.setBackground(new java.awt.Color(204, 204, 204));
        passwordJLabel.setText("Password");

        addressJLabel.setText("Address");

        networkJLabel.setBackground(new java.awt.Color(204, 204, 204));
        networkJLabel.setText("Network");

        addCustomerJButton.setBackground(new java.awt.Color(0, 255, 0));
        addCustomerJButton.setText("Add");
        addCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerJButtonActionPerformed(evt);
            }
        });

        updateCustomerJButton.setBackground(new java.awt.Color(0, 255, 0));
        updateCustomerJButton.setText("Update");
        updateCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerJButtonActionPerformed(evt);
            }
        });

        deleteCustomerJButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteCustomerJButton.setText("Delete");
        deleteCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(deleteCustomerJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(accNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fNameJTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailJTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressJTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addCustomerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(phNoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(phNoJTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lNameJTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(networkJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(balanceJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(balanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(passwordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(updateCustomerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(deleteCustomerJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accNoJLabel)
                    .addComponent(balanceJLabel)
                    .addComponent(accNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameJLabel)
                    .addComponent(fNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameJLabel)
                    .addComponent(lNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailJLabel)
                    .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phNoJLabel)
                    .addComponent(phNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressJLabel)
                    .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkJLabel)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJLabel)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerJButton)
                    .addComponent(updateCustomerJButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerJButtonActionPerformed
        // TODO add your handling code here:
        
            String emailPattern = "^(.+)@(.+)$";
        
            DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();
            int selectedRowIndex = customerJTable.getSelectedRow();

            if(selectedRowIndex<0) {
                JOptionPane.showMessageDialog(this,"Please select a row to update.");
                return;
            }
            if(accNoJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the AccNo");
            }
            else if(balanceJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the balance");
            }
            else if(fNameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the first name");
            }
            else if(lNameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the last name");
            }
            else if(emailJTextField.getText().equals("") || !emailJTextField.getText().matches(emailPattern)){
                JOptionPane.showMessageDialog(this, "Enter a valid email");
            }
            else if(phNoJTextField.getText().equals("") || phNoJTextField.getText().length()<10){
                JOptionPane.showMessageDialog(this, "Enter a valid phone number");
            }
            else if(addressJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the address");
            }
            else if(usernameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the username");
            }
            else if(jPasswordField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the password");
            }
            else{

                String condition = model.getValueAt(selectedRowIndex, 6).toString();
                String accNo = accNoJTextField.getText();
                int balance = Integer.parseInt(balanceJTextField.getText());
                String fname = fNameJTextField.getText();
                String lname = lNameJTextField.getText();
                String email = emailJTextField.getText();
                String phNo = phNoJTextField.getText();
                String address = addressJTextField.getText();
                String username = usernameJTextField.getText();
                String password = jPasswordField.getText();
                String role = "Customer";
                String network = (String) networkJComboBox.getSelectedItem();

                userAccount.updateUserAccount(condition, username, password, role);
                customer.updateCustomer(condition, accNo, balance, fname, lname, email, phNo, address, username, password, role, network);

                JOptionPane.showMessageDialog(this,"Customer Details updated.");

                populateCustomerTable();

                accNoJTextField.setText("");
                balanceJTextField.setText("");
                fNameJTextField.setText("");
                lNameJTextField.setText("");
                emailJTextField.setText("");
                phNoJTextField.setText("");
                addressJTextField.setText("");
                usernameJTextField.setText("");
                jPasswordField.setText("");
            }
        
    }//GEN-LAST:event_updateCustomerJButtonActionPerformed

    private void addCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerJButtonActionPerformed
        // TODO add your handling code here:
        try{
            
            String emailPattern = "^(.+)@(.+)$";
            
            ResultSet rs1 = userAccount.checkIfUsernameIsUnique(usernameJTextField.getText());
            boolean usernameNotExists = !rs1.isBeforeFirst() && rs1.getRow() == 0;
            
            ResultSet rs2 = customer.checkIfAccNoIsUnique(accNoJTextField.getText());
            boolean accNoNotExists = !rs2.isBeforeFirst() && rs2.getRow() == 0;
            
            if(accNoJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the AccNo");
            }
            else if(!accNoNotExists){
                JOptionPane.showMessageDialog(this, "Enter a unique Acc No");
            }
            else if(balanceJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the balance");
            }
            else if(fNameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the first name");
            }
            else if(lNameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the last name");
            }
            else if(emailJTextField.getText().equals("") || !emailJTextField.getText().matches(emailPattern)){
                JOptionPane.showMessageDialog(this, "Enter a valid email");
            }
            else if(phNoJTextField.getText().equals("") || phNoJTextField.getText().length()<10){
                JOptionPane.showMessageDialog(this, "Enter a valid phone number");
            }
            else if(addressJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the address");
            }
            else if(usernameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the username");
            }
            else if(!usernameNotExists){
                JOptionPane.showMessageDialog(this, "Enter a unique username");
            }
            else if(jPasswordField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the password");
            } 
            else{

                String accNo = accNoJTextField.getText();
                int balance = Integer.parseInt(balanceJTextField.getText());
                String fname = fNameJTextField.getText();
                String lname = lNameJTextField.getText();
                String email = emailJTextField.getText();
                String phNo = phNoJTextField.getText();
                String address = addressJTextField.getText();
                String username = usernameJTextField.getText();
                String password = jPasswordField.getText();
                String role = "Customer";
                String network = (String) networkJComboBox.getSelectedItem();

                userAccount.addUserAccount(username, password, role);
                customer.addCustomer(accNo, balance, fname, lname, email, phNo, address, username, password, role, network);

                JOptionPane.showMessageDialog(this, "Customer added successfully");

                accNoJTextField.setText("");
                balanceJTextField.setText("");
                fNameJTextField.setText("");
                lNameJTextField.setText("");
                emailJTextField.setText("");
                phNoJTextField.setText("");
                addressJTextField.setText("");
                usernameJTextField.setText("");
                jPasswordField.setText("");

                populateCustomerTable();
                }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_addCustomerJButtonActionPerformed

    public void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        try{ 
            ResultSet rs = network.getNetworkList();
            while(rs.next()){
            networkJComboBox.addItem(rs.getString(1));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    private void deleteCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();

        int selectedRowIndex = customerJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }

        String username = model.getValueAt(selectedRowIndex, 6).toString();
        enterprise.deleteEnterprise(username);
        customer.deleteCustomer(username);

        JOptionPane.showMessageDialog(this, "Customer details deleted");

        populateCustomerTable();

        accNoJTextField.setText("");
        balanceJTextField.setText("");
        fNameJTextField.setText("");
        lNameJTextField.setText("");
        emailJTextField.setText("");
        phNoJTextField.setText("");
        addressJTextField.setText("");
        usernameJTextField.setText("");
        jPasswordField.setText("");
    }//GEN-LAST:event_deleteCustomerJButtonActionPerformed

    private void customerJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerJTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();
        
        int selectedRowIndex = customerJTable.getSelectedRow();
        
        
        accNoJTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
        fNameJTextField.setText(model.getValueAt(selectedRowIndex, 1).toString());
        lNameJTextField.setText(model.getValueAt(selectedRowIndex, 2).toString());
        emailJTextField.setText(model.getValueAt(selectedRowIndex, 3).toString());
        phNoJTextField.setText(model.getValueAt(selectedRowIndex, 4).toString());
        addressJTextField.setText(model.getValueAt(selectedRowIndex, 5).toString());
        usernameJTextField.setText(model.getValueAt(selectedRowIndex, 6).toString());
        balanceJTextField.setText(model.getValueAt(selectedRowIndex, 8).toString());
        
    }//GEN-LAST:event_customerJTableMouseClicked

    private void balanceJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_balanceJTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        String phNo = balanceJTextField.getText();
        int length = phNo.length();
        
        if(Character.isDigit(c)){
            if(length<10){
                balanceJTextField.setEditable(true);
            }
            else{
                balanceJTextField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                balanceJTextField.setEditable(true);
            } 
            else{
                balanceJTextField.setEditable(false);
            }
        }
    }//GEN-LAST:event_balanceJTextFieldKeyPressed

    private void populateCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();

        model.setRowCount(0);
        
        try{
            ResultSet rs = customer.getCustomerList();
            while(rs.next()){
            Object[] rows = new Object[9];
            rows[0]= rs.getString(1);
            rows[1]= rs.getString(2);
            rows[2]= rs.getString(3);
            rows[3]= rs.getString(4);
            rows[4]= rs.getString(5);
            rows[5]= rs.getString(6);
            rows[6]= rs.getString(8);
            rows[7]= rs.getString(11);
            rows[8]= rs.getString(7);
            model.addRow(rows);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accNoJLabel;
    private javax.swing.JTextField accNoJTextField;
    private javax.swing.JButton addCustomerJButton;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JLabel balanceJLabel;
    private javax.swing.JTextField balanceJTextField;
    private javax.swing.JTable customerJTable;
    private javax.swing.JButton deleteCustomerJButton;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JLabel fNameJLabel;
    private javax.swing.JTextField fNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNameJLabel;
    private javax.swing.JTextField lNameJTextField;
    private javax.swing.JComboBox<String> networkJComboBox;
    private javax.swing.JLabel networkJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JLabel phNoJLabel;
    private javax.swing.JTextField phNoJTextField;
    private javax.swing.JButton updateCustomerJButton;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
