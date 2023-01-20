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
        Network network = new Network();
        network.setName(city);
        this.networkDirectory.add(network);
    }
    
    public ArrayList<Network> getNetworkList() {
        ResultSet rs = db.getAllNetwork();
        Network network;
        this.networkDirectory.removeAll(networkDirectory);
        try{
            while(rs.next()){
                network = new Network();
                network.setName(rs.getString(1));
                this.networkDirectory.add(network);
            }            
            return this.networkDirectory;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return this.networkDirectory;
    }
    
    public void updateNetwork(String condition, String city){
        db.updateNetwork(condition, city);
    }
    
    public void deleteNetwork(String city){
        db.deleteNetwork(city);
    }
    
}
