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
        Organisation org = new Organisation(orgName, orgType);
        organisationDirectory.add(org);
    }
    
    
    public ArrayList<Organisation> getAllOrganisations() {
        return organisationDirectory;
    }
    
    
    public void updateOrganisation(String condition, String orgName){
        db.updateOrganisation(condition, orgName);
    }
    
    public ResultSet getOrganisations(String role) {
        ResultSet rs = db.getOrganisations(role);
        return rs;
    }
    
    public void deleteOrganisation(String orgName){
        db.deleteOrganisation(orgName);
    }
    
}
