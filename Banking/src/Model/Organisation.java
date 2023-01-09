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
public class Organisation {
    
    private String OrgName;
    private String ORGType;
    
    Db db = new Db();

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public String getORGType() {
        return ORGType;
    }

    public void setORGType(String ORGType) {
        this.ORGType = ORGType;
    }
    
    public void addOrganisation(String orgName, String orgType){
        db.addOrganisation(orgName, orgType);
    }
    
    public ResultSet getOrganisations(String role) {
        ResultSet rs = db.getOrganisations(role);
        return rs;
    }
    
    public void updateOrganisation(String condition, String orgName){
        db.updateOrganisation(condition, orgName);
    }
    
    public void deleteOrganisation(String orgName){
        db.deleteOrganisation(orgName);
    }
    
}
