/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mypackage.hello;
///hi This is a test from domenic

/**
 *
 * @author jeff
 */
public class NameHandler {
private String name;
private String password;
private String username;
private String address;
private String zip;
private String email;
private int CCN;
public NameHandler (){
    name = null;
    password = null;
    username = null;
    address = null;
    zip = null;
    email = null;
    CCN = 0;
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
    public String getZip() {
        return zip;
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
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public void setCCN(int CCN) {
        this.CCN = CCN;
    }
}
