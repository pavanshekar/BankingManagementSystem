/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;

/**
 *
 * @author pavansomashekar
 */
public class Loan {
    
    private String AccNo;
    private String LoanNo;
    private String LoanType;
    private String LoanAmount;
    private String Status;

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }

    public String getLoanNo() {
        return LoanNo;
    }

    public void setLoanNo(String LoanNo) {
        this.LoanNo = LoanNo;
    }

    public String getLoanType() {
        return LoanType;
    }

    public void setLoanType(String LoanType) {
        this.LoanType = LoanType;
    }

    public String getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(String LoanAmount) {
        this.LoanAmount = LoanAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    Db db = new Db();
    
    public void applyLoan(String accNo, String loanNo, String loanType, String loanAmount, String status){
        db.applyLoan(accNo, loanNo, loanType, loanAmount,status);
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
    
}
