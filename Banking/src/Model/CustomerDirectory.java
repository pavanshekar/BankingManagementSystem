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
    
    private ArrayList<Customer> customerDirectory;
    
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    
    public void addCustomer(String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network){
        db.addCustomer(accNo, balance, fname, lname, email, phNo, address, username, password, role, network);
        Customer customer = new Customer();
        customer.setAccNo(accNo);
        customer.setBalance(balance);
        customer.setFName(fname);
        customer.setLName(lname);
        customer.setEmail(email);
        customer.setPhNo(phNo);
        customer.setAddress(address);
        customer.setUsername(username);
        customer.setPassword(password);
        customer.setRole(role);
        customer.setNetwork(network);
        this.customerDirectory.add(customer);
    }
    
    
    public ArrayList<Customer> getCustomerDetails(String username) {
        ResultSet rs = db.getCustomerDetails(username);
        Customer customer;
        this.customerDirectory.removeAll(customerDirectory);
        try{
            while(rs.next()){
                customer = new Customer();
                customer.setAccNo(rs.getString(1));
                customer.setFName(rs.getString(2));
                customer.setLName(rs.getString(3));
                customer.setEmail(rs.getString(4));
                customer.setPhNo(rs.getString(5));
                customer.setAddress(rs.getString(6));
                customer.setBalance(rs.getInt(7));
                customer.setUsername(rs.getString(8));
                customer.setPassword(rs.getString(9));
                customer.setRole(rs.getString(10));
                customer.setNetwork(rs.getString(11));
                this.customerDirectory.add(customer);
            }            
            return this.customerDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.customerDirectory;
    }
    
    public ArrayList<Customer> getCustomerList() {
        ResultSet rs = db.getAllCustomers();
        Customer customer;
        this.customerDirectory.removeAll(customerDirectory);
        try{
            while(rs.next()){
                customer = new Customer();
                customer.setAccNo(rs.getString(1));
                customer.setFName(rs.getString(2));
                customer.setLName(rs.getString(3));
                customer.setEmail(rs.getString(4));
                customer.setPhNo(rs.getString(5));
                customer.setAddress(rs.getString(6));
                customer.setBalance(rs.getInt(7));
                customer.setUsername(rs.getString(8));
                customer.setPassword(rs.getString(9));
                customer.setRole(rs.getString(10));
                customer.setNetwork(rs.getString(11));
                this.customerDirectory.add(customer);
            }            
            return this.customerDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.customerDirectory;
    }
    
    public ResultSet getCustomers(String username) {
        ResultSet rs = db.getCustomers(username);
        return rs;
    }
    
    public void updateCustomer(String condition, String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network){
        db.updateCustomer(condition, accNo, balance, fname, lname, email, phNo, address, username, password, role, network);
    }
    
    public void deleteCustomer(String username){
        db.deleteCustomer(username);
    }
    
    public void updateAccountBalance(String username, int updatedBalance){
        db.updateAccountBalance(username, updatedBalance);
    }
    
    public ResultSet checkIfAccNoIsUnique(String accNo ){
        ResultSet rs = db.checkIfAccNoIsUnique(accNo);
        return rs;
    }
    
}
