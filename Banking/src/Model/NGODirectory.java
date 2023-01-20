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
        NGO n = new NGO();
        n.setNgo(ngo);
        n.setBank("");
        n.setReason(reason);
        n.setFundsRequested(fundsRequested);
        n.setStatus("Funds Requested");
        n.setFundsAvailable(0);
        this.ngoDirectory.add(n);
    }
    
    
    public ArrayList<NGO> getFundsRequested(String ngo) {
        ResultSet rs = db.getFundsRequested(ngo);
        NGO n;
        this.ngoDirectory.removeAll(ngoDirectory);
        try{
            while(rs.next()){
                n = new NGO();
                n.setNgo(rs.getString(1));
                n.setBank(rs.getString(2));
                n.setReason(rs.getString(3));
                n.setFundsRequested(rs.getInt(4));
                n.setStatus(rs.getString(5));
                n.setFundsAvailable(rs.getInt(6));
                this.ngoDirectory.add(n);
            }            
            return this.ngoDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.ngoDirectory;
    }
    
    public ArrayList<NGO> getFunds() {
        ResultSet rs = db.getFunds();
        NGO n;
        this.ngoDirectory.removeAll(ngoDirectory);
        try{
            while(rs.next()){
                n = new NGO();
                n.setNgo(rs.getString(1));
                n.setBank(rs.getString(2));
                n.setReason(rs.getString(3));
                n.setFundsRequested(rs.getInt(4));
                n.setStatus(rs.getString(5));
                n.setFundsAvailable(rs.getInt(6));
                this.ngoDirectory.add(n);
            }            
            return this.ngoDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.ngoDirectory;
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
