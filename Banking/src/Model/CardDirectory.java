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
        Card card = new Card();
        card.setAccNo(accNo);
        card.setCardNo(cardNo);
        card.setCardType(cardType);
        card.setCardOfficer("");
        card.setCardVerificationOfficer("");
        card.setStatus(status);
        this.cardDirectory.add(card);
    }
    
    
    public ArrayList<Card> getCustomerCards(String accNo) {
        ResultSet rs = db.getCustomerCards(accNo);
        Card card;
        this.cardDirectory.removeAll(cardDirectory);
        try{
            while(rs.next()){
                card = new Card();
                card.setAccNo(rs.getString(1));
                card.setCardNo(rs.getString(2));
                card.setCardType(rs.getString(3));
                card.setCardOfficer(rs.getString(4));
                card.setCardVerificationOfficer(rs.getString(5));
                card.setStatus(rs.getString(6));
                this.cardDirectory.add(card);
            }            
            return this.cardDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.cardDirectory;
    }
    
    public ArrayList<Card> getCards() {
        ResultSet rs = db.getCards();
        Card card;
        this.cardDirectory.removeAll(cardDirectory);
        try{
            while(rs.next()){
                card = new Card();
                card.setAccNo(rs.getString(1));
                card.setCardNo(rs.getString(2));
                card.setCardType(rs.getString(3));
                card.setCardOfficer(rs.getString(4));
                card.setCardVerificationOfficer(rs.getString(5));
                card.setStatus(rs.getString(6));
                this.cardDirectory.add(card);
            }            
            return this.cardDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.cardDirectory;
    }
    
    public void updateCardStatus(String cardNo, String status){
        db.updateCardStatus(cardNo, status);
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
