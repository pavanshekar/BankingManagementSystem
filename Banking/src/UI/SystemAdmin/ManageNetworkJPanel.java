/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import Model.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author pavansomashekar
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form networkJPanel
     */
    
    private JPanel workJPanel;
    Network network = new Network();
    
    public ManageNetworkJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
        JTableHeader thead = networkJTable.getTableHeader();
        thead.setForeground(Color.BLUE);
        thead.setFont(thead.getFont().deriveFont(Font.BOLD));
        populateNetworkTable();
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
        networkJTable = new javax.swing.JTable();
        addNetworkJLabel = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        cityJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ));
        networkJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                networkJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        addNetworkJLabel.setText("Add Network");

        cityJLabel.setText("Enter the city");

        addJButton.setBackground(new java.awt.Color(0, 255, 0));
        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(deleteJButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(addNetworkJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cityJLabel)
                        .addGap(67, 67, 67)
                        .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addJButton)
                        .addGap(55, 55, 55)
                        .addComponent(updateJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backJButton)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(deleteJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(addNetworkJLabel)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJLabel)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(updateJButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        
            if(cityJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter the network");
            }
            else{
                network.addNetwork(cityJTextField.getText());

                JOptionPane.showMessageDialog(this, "Network added successfully");

                cityJTextField.setText("");
                
                populateNetworkTable();
            }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_networkJTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        
        int selectedRowIndex = networkJTable.getSelectedRow();
        
        cityJTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
        
    }//GEN-LAST:event_networkJTableMouseClicked

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        int selectedRowIndex = networkJTable.getSelectedRow();
        
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to update.");
            return;
        }
        
        if(cityJTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Enter the city name");
        }
        else{
            
            String condition = model.getValueAt(selectedRowIndex, 0).toString();
            
            network.updateNetwork(condition, cityJTextField.getText());


            JOptionPane.showMessageDialog(this,"City updated.");
            
            populateNetworkTable();

            cityJTextField.setText("");
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        int selectedRowIndex = networkJTable.getSelectedRow();

        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }

        String city = model.getValueAt(selectedRowIndex, 0).toString();
        network.deleteNetwork(city);

        JOptionPane.showMessageDialog(this, "City deleted");
        
        populateNetworkTable();

        cityJTextField.setText("");

    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        
        try{
            ResultSet rs = network.getNetworkList();
            while(rs.next()){
            Object[] rows = new Object[1];
            rows[0]= rs.getString(1);
            model.addRow(rows);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel addNetworkJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}