/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author pavansomashekar
 */
public class Db {
    
    public Connection getConnection() {
        
        Connection connection = null;
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            System.out.println("Connected to the database");
        }
        catch (Exception e) {
            System.out.println("Could not connect to the database");
        }
        return connection;
    }
    
    public ResultSet getEmployeeDetails(String username, String password) {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Employee where username=? and password=?");
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            if(rs.next()) {
                return rs;
            }            
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
         
    }
    
    public void addNetwork(String city) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Network values(?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, city);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateNetwork(String condition, String city) {
        try {
            Connection connection = getConnection();
            String sql = "update Network set name=? where name=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, city);
            st.setString(2, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteNetwork(String city) {
        try {
            Connection connection = getConnection();
            String sql = "delete from Network where name=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, city);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getAllNetwork() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Network");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public ResultSet getAllEmployee() {
        ResultSet rs = null;
        try {
            Connection connection = getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from Employee");
            rs = st.executeQuery();
            return rs;
        } catch(Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
    public void addEmployee(String username, String password, String role, String network) {
        try {
            Connection connection = getConnection();
            String sql = "insert into Employee values(?,?,?,?)";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, role);
            st.setString(4, network);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void updateEmployee(String condition, String username, String password, String role, String network) {
        try {
            Connection connection = getConnection();
            String sql = "update Employee set username=?, password=?, role=?, network=? where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            st.setString(3, role);
            st.setString(4, network);
            st.setString(5, condition);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void deleteEmployee(String username) {
        try {
            Connection connection = getConnection();
            String sql = "delete from Employee where username=?";
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(sql);
            st.setString(1, username);
            st.executeUpdate();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
