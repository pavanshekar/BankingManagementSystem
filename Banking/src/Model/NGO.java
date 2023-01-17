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
public class NGO {
    
    private String ngo;
    private String fundsAvailable;

    public String getNgo() {
        return ngo;
    }

    public void setNgo(String ngo) {
        this.ngo = ngo;
    }

    public String getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(String fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }
    
    Db db = new Db();
    
    public ResultSet getFundsRequested(String ngo) {
        ResultSet rs = db.getFundsRequested(ngo);
        return rs;
    }
    
    public void requestFunds(String ngo, int fundsRequested){
        db.requestFunds(ngo, fundsRequested);
    }
    
    public ResultSet getFunds() {
        ResultSet rs = db.getFunds();
        return rs;
    }
    
    public void assignBank(String ngo, String bank, int fundsRequested, String status){
        db.assignBank(ngo, bank, fundsRequested, status);
    }
    
    public void updateFundRequestStatus(String ngo, String bank, int fundsRequested, String status){
        db.updateFundRequestStatus(ngo, bank, fundsRequested, status);
    }
    
    public ResultSet getFundsAvailable(String ngo) {
        ResultSet rs = db.getFundsAvailable(ngo);
        return rs;
    }
    
    public void updateFundsAvailable(String ngo, int updatedFunds){
        db.updateFundsAvailable(ngo, updatedFunds);
    }
    
}
