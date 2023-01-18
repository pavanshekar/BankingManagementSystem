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
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;
    
    
    public UserAccountDirectory(){
        this.userAccountDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public String checkCredentials(String username, String password){
        String role = "";
        ResultSet rs = db.getUserAccountDetails(username, password);

        try{
            if(rs != null){
                role = rs.getString("role");
                return role;
            }
            else{
                return null;
            }
        }
        catch(Exception e){
            System.out.println("Invalid Credentials");
        }
        
        if (rs == null) {
            return null;
        }
        return role;

    }
    
    public ArrayList<UserAccount> getAllUsers() {
        return userAccountDirectory;
    }
    
    public void addUserAccount(String enterpriseName, String username, String password, String role){
        db.addUserAccount(enterpriseName, username, password, role);
        UserAccount ua = new UserAccount(enterpriseName, username, password, role);
        userAccountDirectory.add(ua);
    }
    
    public void updateUserAccount(String condition, String username, String password, String role){
        db.updateUserAccount(condition, username, password, role);
    }
    
    public ResultSet getUserAccountsList() {
        ResultSet rs = db.getUserAccountsList();
        return rs;
    }
    
    public void deleteUserAccount(String username){
        db.deleteUserAccount(username);
    }
    
    public ResultSet checkIfUsernameIsUnique(String username){
        ResultSet rs = db.checkIfUsernameIsUnique(username);
        return rs;
    }
    
    public ResultSet getUserAccounts(String role) {
        ResultSet rs = db.getUserAccounts(role);
        return rs;
    }
    
}
