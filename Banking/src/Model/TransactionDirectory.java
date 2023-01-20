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
    
    private ArrayList<Transaction> transactionDirectory;
    
    
    public TransactionDirectory(){
        this.transactionDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void addTransaction(String username, String transactionType, int transactionAmount, int balance){
        db.addTransaction(username, transactionType, transactionAmount, balance);
        Transaction transaction = new Transaction();
        transaction.setUsername(username);
        transaction.setTransactionType(transactionType);
        transaction.setTransactionAmount(transactionAmount);
        transaction.setBalance(balance);
        transactionDirectory.add(transaction);
    }
            
    public ArrayList<Transaction> getCustomerTransactions(String username) {
        ResultSet rs = db.getCustomerTransactions(username);
        Transaction transaction;
        this.transactionDirectory.removeAll(transactionDirectory);
        try{
            while(rs.next()){
                transaction = new Transaction();
                transaction.setUsername(rs.getString(1));
                transaction.setTransactionType(rs.getString(2));
                transaction.setTransactionAmount(rs.getInt(3));
                transaction.setBalance(rs.getInt(4));
                this.transactionDirectory.add(transaction);
            }            
            return this.transactionDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.transactionDirectory;
    }
    
}
