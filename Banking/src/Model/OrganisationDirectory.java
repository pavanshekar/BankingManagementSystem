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
public class OrganisationDirectory {
    
    private ArrayList<Organisation> organisationDirectory;
    
    
    public OrganisationDirectory(){
        this.organisationDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void addOrganisation(String orgName, String orgType){
        db.addOrganisation(orgName, orgType);
        Organisation org = new Organisation();
        org.setOrgName(orgName);
        org.setORGType(orgType);
        organisationDirectory.add(org);
    }
    
    public ArrayList<Organisation> getOrganisations(String role) {
        ResultSet rs = db.getOrganisations(role);
        Organisation organisation;
        this.organisationDirectory.removeAll(organisationDirectory);
        try{
            while(rs.next()){
                organisation = new Organisation();
                organisation.setOrgName(rs.getString(1));
                organisation.setORGType(rs.getString(2));
                this.organisationDirectory.add(organisation);
            }            
            return this.organisationDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.organisationDirectory;
    }
    
    public void updateOrganisation(String condition, String orgName){
        db.updateOrganisation(condition, orgName);
    }
    
    public void deleteOrganisation(String orgName){
        db.deleteOrganisation(orgName);
    }
    
}
