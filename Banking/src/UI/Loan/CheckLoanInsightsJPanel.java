/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Loan;

import Model.Loan;
import java.awt.CardLayout;
import java.sql.ResultSet;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author pavansomashekar
 */
public class CheckLoanInsightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckLoanInsightsJPanel
     */
    
    private JPanel workJPanel;
    Loan loan = new Loan();
    
    public CheckLoanInsightsJPanel(JPanel workJPanel) {
        initComponents();
        this.workJPanel = workJPanel;
        showPieChart();
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
        chartArea = new javax.swing.JPanel();
        backJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Loan Approval Insights");

        javax.swing.GroupLayout chartAreaLayout = new javax.swing.GroupLayout(chartArea);
        chartArea.setLayout(chartAreaLayout);
        chartAreaLayout.setHorizontalGroup(
            chartAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        chartAreaLayout.setVerticalGroup(
            chartAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton1)
                    .addComponent(chartArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(backJButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(chartArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void showPieChart(){
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        try{
            ResultSet rs = loan.getApprovedLoans();
            int index=0;
            while(rs.next()){
                String loanType = rs.getString(1);
                int count = rs.getInt(2);
                pieDataSet.setValue(loanType, count);
            }
            JFreeChart chart = ChartFactory.createPieChart("Loans Approved", pieDataSet);
            ChartPanel panel = new ChartPanel(chart, 300, 200, 300, 200, 300, 200, true, true, true, true, false, true);
            panel.setSize(500, 400);
            chartArea.add(panel);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JPanel chartArea;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
