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
    private String LoanOfficer;
    private String LoanVerificationOfficer;
    private String Status;
    
    public Loan(String AccNo, String LoanNo, String LoanType, String LoanAmount, String LoanOfficer, String LoanVerificationOfficer, String Status){
        this.AccNo = AccNo;
        this.LoanNo = LoanNo;
        this.LoanType = LoanType;
        this.LoanAmount = LoanAmount;
        this.LoanOfficer = LoanOfficer;
        this.LoanVerificationOfficer = LoanVerificationOfficer;
        this.Status = Status;
    }

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

    public String getLoanOfficer() {
        return LoanOfficer;
    }

    public void setLoanOfficer(String LoanOfficer) {
        this.LoanOfficer = LoanOfficer;
    }

    public String getLoanVerificationOfficer() {
        return LoanVerificationOfficer;
    }

    public void setLoanVerificationOfficer(String LoanVerificationOfficer) {
        this.LoanVerificationOfficer = LoanVerificationOfficer;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }   
}
