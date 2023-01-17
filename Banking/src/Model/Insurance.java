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
    private String InsuranceId;
    private String InsuranceType;
    private int InsuranceAmount;
    private String Bank;
    private String Status;

    public String getInsurance() {
        return Insurance;
    }

    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    public String getInsuranceId() {
        return InsuranceId;
    }

    public void setInsuranceId(String InsuranceId) {
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
    
    Db db = new Db();
    
    public ResultSet getInsurance(String insurance) {
        ResultSet rs = db.getInsurance(insurance);
        return rs;
    }
    
    public void requestInsurance(String insurance, int insuranceId, String insuranceType, int insuranceAmount){
        db.requestInsurance(insurance, insuranceId, insuranceType, insuranceAmount);
    }
    
    public void assignBankInsurance(String insurance, int insuranceId, String insuranceType, int insuranceAmount, String bank, String status){
        db.assignBankInsurance(insurance, insuranceId, insuranceType, insuranceAmount, bank, status);
    }
    
    public void updateInsuranceRequestStatus(String insurance, int insuranceId, String insuranceType, int insuranceAmount, String bank, String status){
        db.updateInsuranceRequestStatus(insurance, insuranceId, insuranceType, insuranceAmount, bank, status);
    }
    
    public ResultSet getAllInsurance() {
        ResultSet rs = db.getAllInsurance();
        return rs;
    }
    
}
