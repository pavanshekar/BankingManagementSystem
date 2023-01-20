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
        Enterprise enterprise = new Enterprise();
        enterprise.setEnterpriseName(enterpriseName);
        enterprise.setEnterpriseType(enterpriseType);
        enterprise.setNetwork(network);
        enterprise.setUsername(username);
        enterprise.setPassword(password);
        this.enterpriseDirectory.add(enterprise);
    }
    
    
    public ArrayList<Enterprise> getEnterpriseList() {
        ResultSet rs = db.getAllEnterprises();
//        return rs;
        Enterprise enterprise;
        this.enterpriseDirectory.removeAll(enterpriseDirectory);
        try{
            while(rs.next()){
                enterprise = new Enterprise();
                enterprise.setEnterpriseName(rs.getString(1));
                enterprise.setEnterpriseType(rs.getString(2));
                enterprise.setNetwork(rs.getString(3));
                enterprise.setUsername(rs.getString(4));
                enterprise.setPassword(rs.getString(5));
                this.enterpriseDirectory.add(enterprise);
            }            
            return this.enterpriseDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.enterpriseDirectory;
    }
    
    public void updateEnterprise(String condition, String enterpriseName, String enterpriseType, String network, String username, String password){
        db.updateEnterprise(condition, enterpriseName, enterpriseType, network, username, password);
    }
    
    public ResultSet getEnterprise(String username) {
        ResultSet rs = db.getEnterprise(username);
        return rs;
    }
    
    public void deleteEnterprise(String enterpriseName){
        db.deleteEnterprise(enterpriseName);
    }
    
}
