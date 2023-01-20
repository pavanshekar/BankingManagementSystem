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
        Loan loan = new Loan();
        loan.setAccNo(accNo);
        loan.setLoanNo(loanNo);
        loan.setLoanType(loanType);
        loan.setLoanAmount(loanAmount);
        loan.setLoanOfficer("");
        loan.setLoanVerificationOfficer("");
        loan.setStatus(status);
        this.loanDirectory.add(loan);
    }
    
    public ArrayList<Loan> getCustomerLoans(String accNo) {
        ResultSet rs = db.getCustomerLoans(accNo);
        Loan loan;
        this.loanDirectory.removeAll(loanDirectory);
        try{
            while(rs.next()){
                loan = new Loan();
                loan.setAccNo(rs.getString(1));
                loan.setLoanNo(rs.getString(2));
                loan.setLoanType(rs.getString(3));
                loan.setLoanAmount(rs.getString(4));
                loan.setLoanOfficer(rs.getString(5));
                loan.setLoanVerificationOfficer(rs.getString(6));
                loan.setStatus(rs.getString(7));
                this.loanDirectory.add(loan);
            }            
            return this.loanDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.loanDirectory;
    }
    
    public ArrayList<Loan> getLoans() {
        ResultSet rs = db.getLoans();
        Loan loan;
        this.loanDirectory.removeAll(loanDirectory);
        try{
            while(rs.next()){
                loan = new Loan();
                loan.setAccNo(rs.getString(1));
                loan.setLoanNo(rs.getString(2));
                loan.setLoanType(rs.getString(3));
                loan.setLoanAmount(rs.getString(4));
                loan.setLoanOfficer(rs.getString(5));
                loan.setLoanVerificationOfficer(rs.getString(6));
                loan.setStatus(rs.getString(7));
                this.loanDirectory.add(loan);
            }            
            return this.loanDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.loanDirectory;
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
