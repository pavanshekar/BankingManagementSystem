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
public class NGODirectory {
    
    private ArrayList<NGO> ngoDirectory;
    
    public NGODirectory(){
        this.ngoDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void requestFunds(String ngo, String reason, int fundsRequested){
        db.requestFunds(ngo, reason, fundsRequested);
        NGO n = new NGO(ngo, "", reason, fundsRequested, "Funds Requested", 0);
        ngoDirectory.add(n);
    }
    
    
    public ArrayList<NGO> getAllFunds() {
        return ngoDirectory;
    }
    
    
    public ResultSet getFundsRequested(String ngo) {
        ResultSet rs = db.getFundsRequested(ngo);
        return rs;
    }
    
    public ResultSet getFunds() {
        ResultSet rs = db.getFunds();
        return rs;
    }
    
    public void assignBank(String ngo, String bank, String reason, int fundsRequested, String status){
        db.assignBank(ngo, bank, reason, fundsRequested, status);
    }
    
    public void updateFundRequestStatus(String ngo, String bank, String reason, int fundsRequested, String status){
        db.updateFundRequestStatus(ngo, bank, reason, fundsRequested, status);
    }
    
    public ResultSet getFundsAvailable(String ngo) {
        ResultSet rs = db.getFundsAvailable(ngo);
        return rs;
    }
    
    public void updateFundsAvailable(String ngo, int updatedFunds){
        db.updateFundsAvailable(ngo, updatedFunds);
    }
    
}
