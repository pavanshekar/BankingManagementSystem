/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author pavansomashekar
 */
import Model.UserAccount;
import UI.Administrator.AdministratorJPanel;
import UI.SystemAdmin.SystemAdminJPanel;
import UI.Banking.BankingJPanel;
import UI.Card.CardJPanel;
import UI.Customer.CustomerJPanel;
import UI.CardVerification.CardVerificationJPanel;
import UI.Loan.LoanJPanel;
import UI.LoanVerification.LoanVerificationJPanel;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    SystemAdminJPanel adminJPanel;
    AdministratorJPanel administratorJPanel;
    BankingJPanel bankingJPanel;
    CustomerJPanel customerJPanel;
    CardJPanel cardJPanel;
    CardVerificationJPanel cardVerificationJPanel;
    LoanJPanel loanJPanel;
    LoanVerificationJPanel loanVerificationJPanel;
    
    UserAccount userAccount = new UserAccount();
    
    public MainJFrame() {
        initComponents();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        usernameJLabel = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        passwordJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        loginJButton = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        workJPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(102, 102, 102));
        controlJPanel.setPreferredSize(new java.awt.Dimension(200, 800));

        usernameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameJLabel.setText("Username");

        passwordJLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordJLabel.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/login.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banking");

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(controlJPanelLayout.createSequentialGroup()
                                    .addComponent(passwordJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField))
                                .addGroup(controlJPanelLayout.createSequentialGroup()
                                    .addComponent(usernameJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(controlJPanelLayout.createSequentialGroup()
                                    .addComponent(loginJButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(logoutJButton)))))
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginJButton)
                    .addComponent(logoutJButton))
                .addGap(92, 92, 92)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(controlJPanel);

        workJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workJPanel.setPreferredSize(new java.awt.Dimension(600, 800));
        workJPanel.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/workAreaBackground.jpg"))); // NOI18N
        workJPanel.add(jLabel3, "card2");

        jSplitPane2.setRightComponent(workJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        
            if(usernameJTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter a valid username");
            }
            else if(jPasswordField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Enter a valid password");
            }
            else{
                String username = usernameJTextField.getText();
                String password = jPasswordField.getText();

                String role = userAccount.checkCredentials(username, password);

                if(role.equals("admin")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    adminJPanel = new SystemAdminJPanel(workJPanel);
                    workJPanel.add("workArea", adminJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("BankingAdmin")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    administratorJPanel = new AdministratorJPanel(workJPanel, role);
                    workJPanel.add("workArea", administratorJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("Customer")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    customerJPanel = new CustomerJPanel(workJPanel, username);
                    workJPanel.add("workArea", customerJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("CardAdmin")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    administratorJPanel = new AdministratorJPanel(workJPanel, role);
                    workJPanel.add("workArea", administratorJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("CardVerificationAdmin")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    administratorJPanel = new AdministratorJPanel(workJPanel, role);
                    workJPanel.add("workArea", administratorJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("LoanAdmin")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    administratorJPanel = new AdministratorJPanel(workJPanel, role);
                    workJPanel.add("workArea", administratorJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("LoanVerificationAdmin")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    administratorJPanel = new AdministratorJPanel(workJPanel, role);
                    workJPanel.add("workArea", administratorJPanel);
                    layout.next(workJPanel);
                } 
                else if(role.equals("Banking")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    bankingJPanel = new BankingJPanel(workJPanel);
                    workJPanel.add("workArea", bankingJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("Card")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    cardJPanel = new CardJPanel(workJPanel);
                    workJPanel.add("workArea", cardJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("CardVerification")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    cardVerificationJPanel = new CardVerificationJPanel(workJPanel);
                    workJPanel.add("workArea", cardVerificationJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("Loan")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    loanJPanel = new LoanJPanel(workJPanel);
                    workJPanel.add("workArea", loanJPanel);
                    layout.next(workJPanel);
                }
                else if(role.equals("LoanVerification")){
                    usernameJTextField.setText("");
                    jPasswordField.setText("");
                    loginJButton.setEnabled(false);
                    logoutJButton.setEnabled(true);
                    CardLayout layout=(CardLayout)workJPanel.getLayout();
                    loanVerificationJPanel = new LoanVerificationJPanel(workJPanel);
                    workJPanel.add("workArea", loanVerificationJPanel);
                    layout.next(workJPanel);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Credentials");
                }
            }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:
        logoutJButton.setEnabled(false);
        loginJButton.setEnabled(true);

        usernameJTextField.setText("");
        jPasswordField.setText("");

        workJPanel.removeAll();
        JPanel blankJP = new JPanel();
        JLabel backGroundJLabel = new JLabel();
        backGroundJLabel.setIcon(new ImageIcon(getClass().getResource("/UI/Images/workAreaBackground.jpg")));
        blankJP.add(backGroundJLabel);
        workJPanel.add("blank", blankJP);
        CardLayout cardLayout = (CardLayout) workJPanel.getLayout();
        cardLayout.next(workJPanel);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    private javax.swing.JPanel workJPanel;
    // End of variables declaration//GEN-END:variables
}
