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
public class Insurance {
    
    private String Insurance;
    private int InsuranceId;
    private String InsuranceType;
    private int InsuranceAmount;
    private String Bank;
    private String Status;
    
    public Insurance(String Insurance, int InsuranceId, String InsuranceType, int InsuranceAmount, String Bank, String Status){
        this.Insurance = Insurance;
        this.InsuranceId = InsuranceId;
        this.InsuranceType = InsuranceType;
        this.InsuranceAmount = InsuranceAmount;
        this.Bank = Bank;
        this.Status = Status;
    }

    public String getInsurance() {
        return Insurance;
    }

    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    public int getInsuranceId() {
        return InsuranceId;
    }

    public void setInsuranceId(int InsuranceId) {
        this.InsuranceId = InsuranceId;
    }

    public String getInsuranceType() {
        return InsuranceType;
    }

    public void setInsuranceType(String InsuranceType) {
        this.InsuranceType = InsuranceType;
    }

    public int getInsuranceAmount() {
        return InsuranceAmount;
    }

    public void setInsuranceAmount(int InsuranceAmount) {
        this.InsuranceAmount = InsuranceAmount;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }   
}
