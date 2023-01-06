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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    Db db = new Db();
    
    public void addCard(String accNo, String cardNo, String cardType, String status){
        db.addCard(accNo, cardNo, cardType, status);
    }
    
    public ResultSet getCustomerCards(String accNo) {
        ResultSet rs = db.getCustomerCards(accNo);
        return rs;
    }
    
    public ResultSet getCards() {
        ResultSet rs = db.getCards();
        return rs;
    }
    
    public void updateCardStatus(String cardNo, String status){
        db.updateCardStatus(cardNo, status);
    }
    
}
