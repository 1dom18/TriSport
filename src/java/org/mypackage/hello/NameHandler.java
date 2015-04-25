/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mypackage.hello;
///hi This is a test from domenic

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;


/**
 *
 * @author jeff
 */
public class NameHandler {
private String name;
private String password;
private String username;
private String address;
private int    zip;
private String email;
private int CCN;
 private Connection con;
public NameHandler (){
    name = null;
    password = null;
    username = null;
    address = null;
    zip = 0;
    email = null;
    CCN = 0;
    con=null;
}

    /**
     * @return the name
     */

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public String getAddress() {
        return address;
    }
    public int getZip() {
        return zip;
    }
    public Connection getCon() {
        return con;
    }
    public int getCCN() {
        return CCN;
    }
    public String getEmail() {
        return email;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public void setCCN(int CCN) {
        this.CCN = CCN;
    }
    
    public void setCon(Connection con)
    {
        try {
          Class.forName("com.mysql.jdbc.Driver");
          this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trisport","root","password");
          
        Statement stmt = con.createStatement();
                String Query = "INSERT INTO customer(username, password, first_lastname, address, city, email,CCN) VALUES (username, password, name, address, zip, email,CCN)";
        stmt.executeUpdate(Query);
        }
   	catch(ClassNotFoundException cnfe)
   	{
    		System.out.println("Class Exception:"+cnfe.getMessage());
	}
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

}
