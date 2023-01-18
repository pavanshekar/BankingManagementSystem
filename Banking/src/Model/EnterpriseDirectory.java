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
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseDirectory;
    
    
    public EnterpriseDirectory(){
        this.enterpriseDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void addEnterprise(String enterpriseName, String enterpriseType, String network, String username, String password){
        db.addEnterprise(enterpriseName, enterpriseType, network, username, password);
        Enterprise enterprise = new Enterprise(enterpriseName, enterpriseType, network, username, password);
        enterpriseDirectory.add(enterprise);
    }
    
    public ArrayList<Enterprise> getAllEnterprises() {
        return enterpriseDirectory;
    }
    
    public ResultSet getEnterprise(String username) {
        ResultSet rs = db.getEnterprise(username);
        return rs;
    }
    
    public ResultSet getEnterpriseList() {
        ResultSet rs = db.getAllEnterprises();
        return rs;
    }
    
    public void updateEnterprise(String condition, String enterpriseName, String enterpriseType, String network, String username, String password){
        db.updateEnterprise(condition, enterpriseName, enterpriseType, network, username, password);
    }
    
    public void deleteEnterprise(String enterpriseName){
        db.deleteEnterprise(enterpriseName);
    }
    
}
