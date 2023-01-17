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
    
    private String EnterpriseName;
    private String EnterpriseType;
    private String Network;
    private String username;
    private String password;
    
    Db db = new Db();

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    public String getEnterpriseType() {
        return EnterpriseType;
    }

    public void setEnterpriseType(String EnterpriseType) {
        this.EnterpriseType = EnterpriseType;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String Network) {
        this.Network = Network;
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
    
    public ResultSet getEnterpriseList() {
        ResultSet rs = db.getAllEnterprises();
        return rs;
    }
    
    public ResultSet getEnterprise(String username) {
        ResultSet rs = db.getEnterprise(username);
        return rs;
    }

    public void addEnterprise(String enterpriseName, String enterpriseType, String network, String username, String password){
        db.addEnterprise(enterpriseName, enterpriseType, network, username, password);
    }
    
    public void updateEnterprise(String condition, String enterpriseName, String enterpriseType, String network, String username, String password){
        db.updateEnterprise(condition, enterpriseName, enterpriseType, network, username, password);
    }
    
    public void deleteEnterprise(String enterpriseName){
        db.deleteEnterprise(enterpriseName);
    }
    
}
