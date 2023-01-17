/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author pavansomashekar
 */
public class Db {
    
    public Connection getConnection() {
        
        Connection connection = null;
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            System.out.println("Connected to the database");
        }
        catch (Exception e) {
            System.out.println("Could not connect to the database");
        }
        return connection;
    }
    
    public ResultSet getUserAccountDetails(String username, String password) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from UserAccount where username=? and password=?");
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            if(rs.next()) {
                return rs;
            }            
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
         
    }
    
    public void addNetwork(String city) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Network values(?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, city);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateNetwork(String condition, String city) {
        try {
            Connection connection = getConnection();
            String sql = "update Network set name=? where name=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, city);
            st.setString(2, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteNetwork(String city) {
        try {
            Connection connection = getConnection();
            String sql = "delete from Network where name=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, city);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getAllNetwork() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Network");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getAllEnterprises() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Enterprise");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getEnterprise(String username) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select enterprise from UserAccount where username=?");
            st.setString(1, username);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void addEnterprise(String enterpriseName, String enterpriseType, String network, String username, String password) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Enterprise values(?,?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, enterpriseName);
            st.setString(2, enterpriseType);
            st.setString(3, network);
            st.setString(4, username);
            st.setString(5, password);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateEnterprise(String condition, String enterpriseName, String enterpriseType, String network, String username, String password) {
        try {
            Connection connection = getConnection();
            String sql = "update Enterprise set EnterpriseName=?, EnterpriseType=?, Network=?, username=?, password=? where EnterpriseName=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, enterpriseName);
            st.setString(2, enterpriseType);
            st.setString(3, network);
            st.setString(4, username);
            st.setString(5, password);
            st.setString(6, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateOrganisation(String condition, String orgName) {
        try {
            Connection connection = getConnection();
            String sql = "update Organisation set OrgName=? where OrgName=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, orgName);
            st.setString(2, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
   
    public void deleteEnterprise(String enterpriseName) {
        try {
            Connection connection = getConnection();
            String sql = "delete from Enterprise where EnterpriseName=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, enterpriseName);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteOrganisation(String orgName) {
        try {
            Connection connection = getConnection();
            String sql = "delete from Organisation where OrgName=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, orgName);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getUserAccountsList() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from UserAccount");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void addUserAccount(String enterpriseName, String username, String password, String role) {
        try {
            Connection connection = getConnection();
            String sql = "insert into UserAccount values(?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, enterpriseName);
            st.setString(2, username);
            st.setString(3, password);
            st.setString(4, role);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateUserAccount(String condition, String username, String password, String role) {
        try {
            Connection connection = getConnection();
            String sql = "update UserAccount set username=?, password=?, role=? where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, role);
            st.setString(4, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteUserAccount(String username) {
        try {
            Connection connection = getConnection();
            String sql = "delete from UserAccount where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void addOrganisation(String orgName, String orgType) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Organisation values(?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, orgName);
            st.setString(2, orgType);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getOrganisations(String role) {
        ResultSet rs = null;
        try {
            String orgType = "";
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Organisation where orgType=?");
            if(role.equals("BankingAdmin")){
                orgType = "BankingOrganisation";
            }
            else if(role.equals("CardAdmin")){
                orgType = "CardOrganisation";
            }
            else if(role.equals("CardVerificationAdmin")){
                orgType = "CardVerificationOrganisation";
            }
            else if(role.equals("LoanAdmin")){
                orgType = "LoanOrganisation";
            }
            else if(role.equals("LoanVerificationAdmin")){
                orgType = "LoanVerificationOrganisation";
            }
            st.setString(1, orgType);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getUserAccounts(String role) {
        ResultSet rs = null;
        try {
            String empRole = "";
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from UserAccount where role=?");
            if(role.equals("BankingAdmin")){
                empRole = "Banking";
            }
            else if(role.equals("CardAdmin")){
                empRole = "Card";
            }
            else if(role.equals("CardVerificationAdmin")){
                empRole = "CardVerification";
            }
            else if(role.equals("LoanAdmin")){
                empRole = "Loan";
            }
            else if(role.equals("LoanVerificationAdmin")){
                empRole = "LoanVerification";
            }
            st.setString(1, empRole);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getAllCustomers() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Customer");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void addCustomer(String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Customer values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, accNo);
            st.setString(2, fname);
            st.setString(3, lname);
            st.setString(4, email);
            st.setString(5, phNo);
            st.setString(6, address);
            st.setInt(7, balance);
            st.setString(8, username);
            st.setString(9, password);
            st.setString(10, role);
            st.setString(11, network);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateCustomer(String condition, String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network) {
        try {
            Connection connection = getConnection();
            String sql = "update Customer set AccNo=?, FName=?, LName=?, Email=?, PhNo=?, Address=?, Balance=?, username=?, password=?, role=?, network=? where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, accNo);
            st.setString(2, fname);
            st.setString(3, lname);
            st.setString(4, email);
            st.setString(5, phNo);
            st.setString(6, address);
            st.setInt(7, balance);
            st.setString(8, username);
            st.setString(9, password);
            st.setString(10, role);
            st.setString(11, network);
            st.setString(12, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteCustomer(String username) {
        try {
            Connection connection = getConnection();
            String sql = "delete from Customer where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getCustomerDetails(String username) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Customer where username=?");
            st.setString(1, username);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void updateAccountBalance(String username, int updatedBalance){
        try{
            Connection connection = getConnection();
            String sql = "update Customer set balance=? where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setInt(1, updatedBalance);
            st.setString(2, username);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void addCard(String accNo, String cardNo, String cardType, String status) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Card values(?,?,?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, accNo);
            st.setString(2, cardNo);
            st.setString(3, cardType);
            st.setString(4, "");
            st.setString(5, "");
            st.setString(6, status);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getCustomerCards(String accNo) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Card where accNo=? and status=?");
            st.setString(1, accNo);
            st.setString(2, "Approved");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getCards() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Card");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void updateCardStatus(String cardNo, String status){
        try{
            Connection connection = getConnection();
            String sql = "update Card set status=? where cardNo=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, status);
            st.setString(2, cardNo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void applyLoan(String accNo, String loanNo, String loanType, String loanAmount, String status) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Loan values(?,?,?,?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, accNo);
            st.setString(2, loanNo);
            st.setString(3, loanType);
            st.setString(4, loanAmount);
            st.setString(5, "");
            st.setString(6, "");
            st.setString(7, status);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getCustomerLoans(String accNo) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Loan where accNo=? and status=?");
            st.setString(1, accNo);
            st.setString(2, "Approved");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getLoans() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Loan");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void updateLoanStatus(String loanNo, String status){
        try{
            Connection connection = getConnection();
            String sql = "update Loan set status=? where loanNo=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, status);
            st.setString(2, loanNo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void addTransaction(String username, String transactionType, int transactionAmount, int balance) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Transaction values(?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, transactionType);
            st.setInt(3, transactionAmount);
            st.setInt(4, balance);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getCustomerTransactions(String username) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Transaction where username=?");
            st.setString(1, username);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet checkIfUsernameIsUnique(String username){
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from UserAccount where username=?");
            st.setString(1, username);
            rs = st.executeQuery();     
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet checkIfAccNoIsUnique(String accNo){
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Customer where AccNo=?");
            st.setString(1, accNo);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getApprovedLoans() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select LoanType, Count(*) as Count from Loan where Status=? group by LoanType");
            st.setString(1, "Approved");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getApprovedCards() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select CardType, Count(*) as Count from Card where Status=? group by CardType");
            st.setString(1, "Approved");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void assignCardOfficer(String cardNo, String username){
        try{
            Connection connection = getConnection();
            String sql = "update Card set CardOfficer=? where cardNo=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, cardNo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void assignCardVerificationOfficer(String cardNo, String username){
        try{
            Connection connection = getConnection();
            String sql = "update Card set CardVerificationOfficer=? where cardNo=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, cardNo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void assignLoanOfficer(String loanNo, String username){
        try{
            Connection connection = getConnection();
            String sql = "update Loan set LoanOfficer=? where loanNo=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, loanNo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void assignLoanVerificationOfficer(String loanNo, String username){
        try{
            Connection connection = getConnection();
            String sql = "update Loan set LoanVerificationOfficer=? where loanNo=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, loanNo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public ResultSet getFundsRequested(String ngo) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Funds where NGO=?");
            st.setString(1, ngo);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void requestFunds(String ngo, int fundsRequested) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Funds (NGO,FundsRequested,Status)  values(?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, ngo);
            st.setInt(2, fundsRequested);
            st.setString(3, "Funds Requested");
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getFunds() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Funds");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void assignBank(String ngo, String bank, int fundsRequested, String status){
        try{
            Connection connection = getConnection();
            String sql = "update Funds set Bank=? where NGO=? and FundsRequested=? and status=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, bank);
            st.setString(2, ngo);
            st.setInt(3, fundsRequested);
            st.setString(4, status);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void updateFundRequestStatus(String ngo, String bank, int fundsRequested, String status){
        try{
            Connection connection = getConnection();
            String sql = "update Funds set status=? where NGO=? and Bank=? and FundsRequested=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, status);
            st.setString(2, ngo);
            st.setString(3, bank);
            st.setInt(4, fundsRequested);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public ResultSet getFundsAvailable(String ngo) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select max(FundsAvailable) from Funds where NGO=?");
            st.setString(1, ngo);
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void updateFundsAvailable(String ngo, int updatedFunds){
        try{
            Connection connection = getConnection();
            String sql = "update Funds set FundsAvailable=? where NGO=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setInt(1, updatedFunds);
            st.setString(2, ngo);
            st.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
