/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Card;

import Model.Card;
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
public class CheckCardInsightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckCardInsightsJPanel
     */
    
    private JPanel workJPanel;
    Card card = new Card();
    
    public CheckCardInsightsJPanel(JPanel workJPanel) {
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

        cardInsightsJLabel = new javax.swing.JLabel();
        chartArea = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();

        cardInsightsJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        cardInsightsJLabel.setText("Credit Card Approval Insights");

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

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardInsightsJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(chartArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cardInsightsJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(chartArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        workJPanel.remove(this);
        CardLayout layout = (CardLayout) workJPanel.getLayout();
        layout.previous(workJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void showPieChart(){
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        try{
            ResultSet rs = card.getApprovedCards();
            int index=0;
            while(rs.next()){
                String cardType = rs.getString(1);
                int count = rs.getInt(2);
                pieDataSet.setValue(cardType, count);
            }
            JFreeChart chart = ChartFactory.createPieChart("Credit Cards Approved", pieDataSet);
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
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cardInsightsJLabel;
    private javax.swing.JPanel chartArea;
    // End of variables declaration//GEN-END:variables
}