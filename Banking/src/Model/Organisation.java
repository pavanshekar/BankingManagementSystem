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
    
    public Organisation(String OrgName, String OrgType){
        this.OrgName = OrgName;
        this.ORGType = ORGType;
    }
    
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
}
