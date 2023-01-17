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
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory = new ArrayList<>();
    
    Db db = new Db();
    
    public ResultSet getCustomerList() {
        ResultSet rs = db.getAllCustomers();
        return rs;
    }
    
    public void addCustomer(String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network){
        db.addCustomer(accNo, balance, fname, lname, email, phNo, address, username, password, role, network);
        Customer customer = new Customer(accNo, balance, fname, lname, email, phNo, address, username, password, role, network);
        customerDirectory.add(customer);
    }
    
    public void updateCustomer(String condition, String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network){
        db.updateCustomer(condition, accNo, balance, fname, lname, email, phNo, address, username, password, role, network);
    }
    
    public void deleteCustomer(String username){
        db.deleteCustomer(username);
    }
    
    public ResultSet getCustomerDetails(String username) {
        ResultSet rs = db.getCustomerDetails(username);
        return rs;
    }
    
    public void updateAccountBalance(String username, int updatedBalance){
        db.updateAccountBalance(username, updatedBalance);
    }
    
    public ResultSet checkIfAccNoIsUnique(String accNo ){
        ResultSet rs = db.checkIfAccNoIsUnique(accNo);
        return rs;
    }
    
    public ResultSet getCustomers(String username) {
        ResultSet rs = db.getCustomers(username);
        return rs;
    }
    
}
