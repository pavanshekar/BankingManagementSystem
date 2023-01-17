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
    private String bank;
    private String reason;
    private int fundsRequested;
    private String status;
    private int fundsAvailable;
    
    public NGO(String ngo, String bank, String reason, int fundsRequested, String status, int fundsAvailable){
        this.ngo = ngo;
        this.bank = bank;
        this.reason = reason;
        this.fundsRequested = fundsRequested;
        this.status = status;
        this.fundsAvailable = fundsAvailable;
    }

    public String getNgo() {
        return ngo;
    }

    public void setNgo(String ngo) {
        this.ngo = ngo;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getFundsRequested() {
        return fundsRequested;
    }

    public void setFundsRequested(int fundsRequested) {
        this.fundsRequested = fundsRequested;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(int fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    } 
}
