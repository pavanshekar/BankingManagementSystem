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
public class CardDirectory {
    
    private ArrayList<Card> cardDirectory;
    
    
    public CardDirectory(){
        this.cardDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void addCard(String accNo, String cardNo, String cardType, String status){
        db.addCard(accNo, cardNo, cardType, status);
        Card card = new Card(accNo, cardNo, cardType, "", "", status);
        cardDirectory.add(card);
    }
    
    public ArrayList<Card> getAllCards() {
        return cardDirectory;
    }
    
    public ResultSet getCustomerCards(String accNo) {
        ResultSet rs = db.getCustomerCards(accNo);
        return rs;
    }
    
    public void updateCardStatus(String cardNo, String status){
        db.updateCardStatus(cardNo, status);
    }
    
    public ResultSet getCards() {
        ResultSet rs = db.getCards();
        return rs;
    }
     
    public ResultSet getApprovedCards(){
        ResultSet rs = db.getApprovedCards();
        return rs;
    }
    
    public void assignCardOfficer(String cardNo, String username){
        db.assignCardOfficer(cardNo, username);
    }
    
    public void assignCardVerificationOfficer(String cardNo, String username){
        db.assignCardVerificationOfficer(cardNo, username);
    }
    
}
