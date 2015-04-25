/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.io.*;                                                                                                                                                                                          
import java.sql.*;
import java.lang.*;
/**
 *
 * @author 1dom1_000
 */
class Sample
{
 private Connection con;
    public static void main(String[] args)
	{
         try
	{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trisport","root","password");
          
//		db.connect("trisport","root","password");
                
        Statement stmt = con.createStatement();
                String Query = "INSERT INTO customer(username, password, first_lastname, address, city, email,CCN) VALUES ('johnsons', 2, 1, 20000, 'Architect', 'pname','53532')";
stmt.executeUpdate(Query);
         }
   	catch(SQLException sqle)
   	{
    		System.out.println("SQL Exception:"+sqle.getMessage());
                System.out.println("1");
	}
   	catch(ClassNotFoundException cnfe)
   	{
    		System.out.println("Class Exception:"+cnfe.getMessage());
	}
   	catch(Exception e)
   	{
    		System.out.println("General Exception:"+e.getMessage());
                System.out.println("2");
		
	}

		//disconnect();	
	}
	
    public Sample()
    {
	con=null;
    }
    
    public void connect(String dbname, String userid, String passwd)
    {
        System.out.println("hi.");
	try
	{
             System.out.println("hi2 ");
		Class.forName("com.mysql.jdbc.Driver");
                 System.out.println("hi3");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,userid,passwd);
		System.out.println("connection established.");
	}
   	catch(SQLException sqle)
   	{
    		System.out.println("SQL Exception:"+sqle.getMessage());
                System.out.println("1");
		con=null;
	}
   	catch(ClassNotFoundException cnfe)
   	{
    		System.out.println("Class Exception:"+cnfe.getMessage());
		con=null;
	}
   	catch(Exception e)
   	{
    		System.out.println("General Exception:"+e.getMessage());
                System.out.println("2");
		con=null;
	}
    }

    public void disconnect()
    {		 	   	
      	try
	{	
	  	if(con!=null)
          	{   
			con.close();
		}	
	}
	catch(SQLException sqle)
	{	System.out.println("SQL Exception:"+sqle.getMessage());     
                System.out.println("3");
	}
	finally
	{	con=null;
		System.out.println("Connection disconnected.");
	}
    }
    
    public void SetRegister()
    {
        try
        {
        Statement stmt = con.createStatement();
        String Query = "INSERT INTO customer(username, password, first_lastname, address, city, email,CCN) VALUES ('johnsons', 2, 1, 20000, 'Architect', 'pname','53532')";
        stmt.executeUpdate(Query);
        }
        catch(Exception e)
   	{
    	System.out.println("General Exception:"+e.getMessage());
        System.out.println("2");
	con=null;
	}    
    }
}
