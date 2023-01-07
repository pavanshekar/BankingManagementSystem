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
public class Transaction {
    
    private String username;
    private String TransactionType;
    private int TransactionAmount;
    private int Balance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String TransactionType) {
        this.TransactionType = TransactionType;
    }

    public int getTransactionAmount() {
        return TransactionAmount;
    }

    public void setTransactionAmount(int TransactionAmount) {
        this.TransactionAmount = TransactionAmount;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    
    Db db = new Db();
    
    public void addTransaction(String username, String transactionType, int transactionAmount, int balance){
        db.addTransaction(username, transactionType, transactionAmount, balance);
    }
            
    public ResultSet getCustomerTransactions(String username) {
        ResultSet rs = db.getCustomerTransactions(username);
        return rs;
    }
    
}
