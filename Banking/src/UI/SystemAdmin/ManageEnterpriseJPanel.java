/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import Model.Enterprise;
import Model.EnterpriseDirectory;
import Model.Network;
import Model.NetworkDirectory;
import Model.UserAccount;
import Model.UserAccountDirectory;
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

public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel workJPanel;
    NetworkDirectory network = new NetworkDirectory();
    EnterpriseDirectory enterprise = new EnterpriseDirectory();
    UserAccountDirectory userAccount = new UserAccountDirectory();

    public ManageEnterpriseJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
        JTableHeader thead = enterpriseJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateEnterpriseTable();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        networkJLabel = new javax.swing.JLabel();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        roleJLabel = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox<>();
        roleJComboBox = new javax.swing.JComboBox<>();
        usernameJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        updateJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        enterpriseJLabel = new javax.swing.JLabel();
        enterpriseJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Network", "Enterprise", "Username"
            }
        ));
        enterpriseJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        networkJLabel.setText("Network");

        usernameJLabel.setText("Username");

        passwordJLabel.setText("Password");

        roleJLabel.setText("Role");

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banking", "Card", "Loan", "CardVerification", "LoanVerification", "NGO", "Insurance" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(0, 255, 0));
        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        updateJButton.setBackground(new java.awt.Color(0, 255, 0));
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        enterpriseJLabel.setText("Enterprise");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(0, 516, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernameJLabel)
                                            .addComponent(networkJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(roleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(enterpriseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(networkJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(usernameJTextField)
                                            .addComponent(jPasswordField)
                                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(enterpriseJTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(addJButton)
                                        .addGap(46, 46, 46)
                                        .addComponent(updateJButton)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteJButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteJButton)
                        .addGap(32, 32, 32)
                        .addComponent(networkJLabel))
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseJLabel)
                    .addComponent(enterpriseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJLabel)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(updateJButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        try{
            ResultSet rs = userAccount.checkIfUsernameIsUnique(usernameJTextField.getText());
            boolean notExists = !rs.isBeforeFirst() && rs.getRow() == 0;
            
            if(enterpriseJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the enterprise name");
            }
            else if(usernameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter a valid username");
            }
            else if(!notExists){
                JOptionPane.showMessageDialog(this, "Enter a unique username");
            }
            else if(jPasswordField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter a valid password");
            }
            else{
                String enterpriseName = enterpriseJTextField.getText();
                String username = usernameJTextField.getText();
                String password = jPasswordField.getText();
                String network = (String) networkJComboBox.getSelectedItem();
                String enterpriseType = (String) roleJComboBox.getSelectedItem();
                String role = enterpriseType+"Admin";
                
                enterprise.addEnterprise(enterpriseName, enterpriseType, network, username, password);
                userAccount.addUserAccount(enterpriseName, username, password, role);

                JOptionPane.showMessageDialog(this, "Enterprise added successfully");

                enterpriseJTextField.setText("");
                usernameJTextField.setText("");
                jPasswordField.setText("");
                
                populateEnterpriseTable();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
            int selectedRowIndex = enterpriseJTable.getSelectedRow();

            if(selectedRowIndex<0) {
                JOptionPane.showMessageDialog(this,"Please select a row to update.");
                return;
            }
            
            if(enterpriseJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the enterprise name");
            }
            else if(usernameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the username");
            }
            else if(jPasswordField.getText().equals((""))){
                JOptionPane.showMessageDialog(this, "Enter the password");
            }
            else{

                String condition1 = model.getValueAt(selectedRowIndex, 1).toString();
                String condition2 = model.getValueAt(selectedRowIndex, 2).toString();
                String username = usernameJTextField.getText();
                String password = jPasswordField.getText();
                String network = (String) networkJComboBox.getSelectedItem();
                String enterpriseType = (String) roleJComboBox.getSelectedItem();
                String role = enterpriseType+"Admin";
                String enterpriseName = enterpriseJTextField.getText();

                enterprise.updateEnterprise(condition1, enterpriseName, enterpriseType, network, username, password);
                userAccount.updateUserAccount(condition2, username, password, role);
                
                JOptionPane.showMessageDialog(this,"Enterprise Details updated.");

                populateEnterpriseTable();

                enterpriseJTextField.setText("");
                usernameJTextField.setText("");
                jPasswordField.setText("");
            }
        
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        int selectedRowIndex = enterpriseJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }

        String enterpriseName = model.getValueAt(selectedRowIndex, 0).toString();
        String username = model.getValueAt(selectedRowIndex, 1).toString();
        enterprise.deleteEnterprise(enterpriseName);
        userAccount.deleteUserAccount(username);

        JOptionPane.showMessageDialog(this, "Enterprise details deleted");

        populateEnterpriseTable();

        enterpriseJTextField.setText("");
        usernameJTextField.setText("");
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void enterpriseJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseJTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        
        int selectedRowIndex = enterpriseJTable.getSelectedRow();
        
        enterpriseJTextField.setText(model.getValueAt(selectedRowIndex, 1).toString());
        usernameJTextField.setText(model.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_enterpriseJTableMouseClicked

    private void populateEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        
        try{ 
            ResultSet rs = enterprise.getEnterpriseList();
            while(rs.next()){
            Object[] rows = new Object[3];
            rows[0] = rs.getString(3);
            rows[1] = rs.getString(1);
            rows[2] = rs.getString(4);
            model.addRow(rows);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel enterpriseJLabel;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JTextField enterpriseJTextField;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> networkJComboBox;
    private javax.swing.JLabel networkJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JComboBox<String> roleJComboBox;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
