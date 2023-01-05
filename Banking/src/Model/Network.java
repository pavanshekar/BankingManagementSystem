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

public class Network {
    
    Db db = new Db();
    
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addNetwork(String city){
        db.addNetwork(city);
    }
    
    public ResultSet getNetworkList() {
        ResultSet rs = db.getAllNetwork();
        return rs;
    }
    
    public void updateNetwork(String condition, String city){
        db.updateNetwork(condition, city);
    }
    
    public void deleteNetwork(String city){
        db.deleteNetwork(city);
    }
    
}
