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
public class TransactionDirectory {
    
    private ArrayList<Transaction> transactionDirectory = new ArrayList<>();
    
    Db db = new Db();
    
    public void addTransaction(String username, String transactionType, int transactionAmount, int balance){
        db.addTransaction(username, transactionType, transactionAmount, balance);
        Transaction transaction = new Transaction(username, transactionType, transactionAmount, balance);
        transactionDirectory.add(transaction);
    }
            
    public ResultSet getCustomerTransactions(String username) {
        ResultSet rs = db.getCustomerTransactions(username);
        return rs;
    }
    
}
