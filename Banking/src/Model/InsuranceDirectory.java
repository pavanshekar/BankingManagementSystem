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
public class InsuranceDirectory {
    
    private ArrayList<Insurance> insuranceDirectory;
    
    
    public InsuranceDirectory(){
        this.insuranceDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void requestInsurance(String insurance, int insuranceId, String insuranceType, int insuranceAmount){
        db.requestInsurance(insurance, insuranceId, insuranceType, insuranceAmount);
        Insurance ins = new Insurance(insurance, insuranceId, insuranceType, insuranceAmount, "", "Insurance Requested");
        insuranceDirectory.add(ins);
    }
    
    public ArrayList<Insurance> getInsurances() {
        return insuranceDirectory;
    }
    
    public ResultSet getInsurance(String insurance) {
        ResultSet rs = db.getInsurance(insurance);
        return rs;
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
