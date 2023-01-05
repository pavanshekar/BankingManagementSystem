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
public class Enterprise {
    
    private String username;
    private String password;
    private String role;
    private String network;
    
    Db db = new Db();

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
    
    public String checkCredentials(String username, String password){
        String role = "";
        ResultSet rs = db.getEnterpriseDetails(username, password);

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
            e.printStackTrace();
        }
        
        if (rs == null) {
            return null;
        }
        return role;

    }
    
    public ResultSet getEnterpriseList() {
        ResultSet rs = db.getAllEnterprises();
        return rs;
    }
    
    public void addEnterprise(String username, String password, String role, String network){
        db.addEnterprise(username, password, role, network);
    }
    
    public void updateEnterprise(String condition, String username, String password, String role, String network){
        db.updateEnterprise(condition, username, password, role, network);
    }
    
    public void deleteEnterprise(String username){
        db.deleteEnterprise(username);
    }
    
}
