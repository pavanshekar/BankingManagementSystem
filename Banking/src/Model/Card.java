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
public class Card {
    
    private String AccNo;
    private String CardNo;
    private String CardType;
    private String CardOfficer;
    private String CardVerificationOfficer;
    private String Status;
    

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    public String getCardOfficer() {
        return CardOfficer;
    }

    public void setCardOfficer(String CardOfficer) {
        this.CardOfficer = CardOfficer;
    }

    public String getCardVerificationOfficer() {
        return CardVerificationOfficer;
    }

    public void setCardVerificationOfficer(String CardVerificationOfficer) {
        this.CardVerificationOfficer = CardVerificationOfficer;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
