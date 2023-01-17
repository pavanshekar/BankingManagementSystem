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
public class Customer {
    
    private String AccNo;
    private int Balance;
    private String FName;
    private String LName;
    private String Email;
    private String PhNo;
    private String Address;
    private String username;
    private String password;
    private String role;
    private String network;
    
    Db db = new Db();

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhNo() {
        return PhNo;
    }

    public void setPhNo(String PhNo) {
        this.PhNo = PhNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    
    public ResultSet getCustomerList() {
        ResultSet rs = db.getAllCustomers();
        return rs;
    }
    
    public void addCustomer(String accNo, int balance, String fname, String lname, String email, String phNo, String address, String username, String password, String role, String network){
        db.addCustomer(accNo, balance, fname, lname, email, phNo, address, username, password, role, network);
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
