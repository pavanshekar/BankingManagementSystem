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
public class NetworkDirectory {
    
    private ArrayList<Network> networkDirectory;
    
    
    public NetworkDirectory(){
        this.networkDirectory = new ArrayList<>();
    }
    
    
    Db db = new Db();
    
    
    public void addNetwork(String city){
        db.addNetwork(city);
        Network network = new Network(city);
        networkDirectory.add(network);
    }
    
    
    public ArrayList<Network> getNetworks() {
        return networkDirectory;
    }
    
    public void updateNetwork(String condition, String city){
        db.updateNetwork(condition, city);
    }
    
    public ResultSet getNetworkList() {
        ResultSet rs = db.getAllNetwork();
        return rs;
    }
    
    public void deleteNetwork(String city){
        db.deleteNetwork(city);
    }
    
}
