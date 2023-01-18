/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pavansomashekar
 */
public class LoanDirectory {
    
    private ArrayList<Loan> loanDirectory;
    
    
    public LoanDirectory(){
        this.loanDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void applyLoan(String accNo, String loanNo, String loanType, String loanAmount, String status){
        db.applyLoan(accNo, loanNo, loanType, loanAmount,status);
        Loan loan = new Loan(accNo, loanNo, loanType, loanAmount, "", "", status);
        loanDirectory.add(loan);
    }
    
    public ArrayList<Loan> getAllLoans() {
        return loanDirectory;
    }
    
    public ResultSet getCustomerLoans(String accNo) {
        ResultSet rs = db.getCustomerLoans(accNo);
        return rs;
    }
    
    public ResultSet getLoans() {
        ResultSet rs = db.getLoans();
        return rs;
    }
    
    public void updateLoanStatus(String loanNo, String status){
        db.updateLoanStatus(loanNo, status);
    }
    
    public ResultSet getApprovedLoans(){
        ResultSet rs = db.getApprovedLoans();
        return rs;
    }
    
    public void assignLoanOfficer(String loanNo, String username){
        db.assignLoanOfficer(loanNo, username);
    }
    
    public void assignLoanVerificationOfficer(String loanNo, String username){
        db.assignLoanVerificationOfficer(loanNo, username);
    }
    
}
