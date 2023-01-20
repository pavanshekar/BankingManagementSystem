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
        Insurance ins = new Insurance();
        ins.setInsurance(insurance);
        ins.setInsuranceId(insuranceId);
        ins.setInsuranceType(insuranceType);
        ins.setInsuranceAmount(insuranceAmount);
        ins.setBank("");
        ins.setStatus("Insurance Requested");
        insuranceDirectory.add(ins);
    }
    
    
    public ArrayList<Insurance> getInsurance(String insurance) {
        ResultSet rs = db.getInsurance(insurance);
        Insurance ins;
        this.insuranceDirectory.removeAll(insuranceDirectory);
        try{
            while(rs.next()){
                ins = new Insurance();
                ins.setInsurance(rs.getString(1));
                ins.setInsuranceId(rs.getInt(2));
                ins.setInsuranceType(rs.getString(3));
                ins.setInsuranceAmount(rs.getInt(4));
                ins.setBank(rs.getString(5));
                ins.setStatus(rs.getString(6));
                this.insuranceDirectory.add(ins);
            }            
            return this.insuranceDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.insuranceDirectory;
    }
    
    public ArrayList<Insurance> getAllInsurance() {
        ResultSet rs = db.getAllInsurance();
        Insurance ins;
        this.insuranceDirectory.removeAll(insuranceDirectory);
        try{
            while(rs.next()){
                ins = new Insurance();
                ins.setInsurance(rs.getString(1));
                ins.setInsuranceId(rs.getInt(2));
                ins.setInsuranceType(rs.getString(3));
                ins.setInsuranceAmount(rs.getInt(4));
                ins.setBank(rs.getString(5));
                ins.setStatus(rs.getString(6));
                this.insuranceDirectory.add(ins);
            }            
            return this.insuranceDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.insuranceDirectory;
    }
    
    public void assignBankInsurance(String insurance, int insuranceId, String insuranceType, int insuranceAmount, String bank, String status){
        db.assignBankInsurance(insurance, insuranceId, insuranceType, insuranceAmount, bank, status);
    }
    
    public void updateInsuranceRequestStatus(String insurance, int insuranceId, String insuranceType, int insuranceAmount, String bank, String status){
        db.updateInsuranceRequestStatus(insurance, insuranceId, insuranceType, insuranceAmount, bank, status);
    }
    
}
