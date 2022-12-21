/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Renan Gomes
 * @SN 2020295
 * 
 */
public class SQLConnection {
    
    //First connection to insert information in the userinfo table of the database
    
    static void connectSQL(String query){
        
        try{
			// Load the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbServer = "jdbc:mysql://localhost/ca_oop_aadp";
			String user = "root";
			String password = "root";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			Statement stmt = conn.createStatement() ;
                        
                        //First try used to return information in Result sets
                        
                        try {
                            
			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			// Loop through the result set
                        
			while(rs.next()) {
				System.out.println( rs.getString("customerID") + "\t" + rs.getString("name") + "\t" + rs.getString("email"));
                           }

			// Close the result set
			rs.close() ;                      
			stmt.close() ;
			conn.close() ;
                        }
                        catch( SQLException se ){
                        
                        /*
                        * SQL Excpetion code in case needed for troubleshooting
                        */ 
                            
//			System.out.println( "SQL Exception:" ) ;
//
//			// Loop through the SQL Exceptions
//			while( se != null ){
//				System.out.println( "State  : " + se.getSQLState()  ) ;
//				System.out.println( "Message: " + se.getMessage()   ) ;
//				System.out.println( "Error  : " + se.getErrorCode() ) ;
//
//				se = se.getNextException() ;
//                            }
                        }
                        
                        
                        // Second try in case no result data sets are recognized to execute a simple query line
                        
                        try {
                            
                            stmt.executeUpdate(query);
                            
                            stmt.close() ;
                            conn.close() ;
                        }
                        catch( Exception e ){
                            
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
                        }
                
		}
		
		catch( Exception e ){
                    
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
		}
    }
    
    //Comment 1 - Second connection to search if movie is already in the table, if so return boolean value true
    //Comment 2 - Approach changed, finding movies not necessary, record of every movie is stored in database
    
    public boolean connectSQL2(String query){
    
        boolean isFound = false;
        try{
			// Load the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbServer = "jdbc:mysql://localhost/ca_oop_aadp";
			String user = "root";
			String password = "root";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			Statement stmt = conn.createStatement() ;
                        
                        //First try used to return information in Result sets
                        
                        try {
                            
			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			// Loop through the result set
                        
                        while(rs.next()) {
                            System.out.println("Found");
                            isFound = true;
                        }
                        

			// Close the result set
			rs.close() ;                      
			stmt.close() ;
			conn.close() ;
                        }
                        catch( SQLException se ){
                        
                        /*
                        * SQL Excpetion code in case needed for troubleshooting
                        */ 
                            
//			System.out.println( "SQL Exception:" ) ;
//
//			// Loop through the SQL Exceptions
//			while( se != null ){
//				System.out.println( "State  : " + se.getSQLState()  ) ;
//				System.out.println( "Message: " + se.getMessage()   ) ;
//				System.out.println( "Error  : " + se.getErrorCode() ) ;
//
//				se = se.getNextException() ;
//                            }
                        }
                        
                        
                        // Second try in case no result data sets are recognized to execute a simple query line
                        
                                        
		}
		
		catch( Exception e ){
                    
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
		}
        
        return isFound;
    }
    
    //Third connection to fetch top 5 movies from previous 5 minutes
    
    static void connectSQL3(String query){
        
        try{
			// Load the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbServer = "jdbc:mysql://localhost/ca_oop_aadp";
			String user = "root";
			String password = "root";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			Statement stmt = conn.createStatement() ;
                        
                        //First try used to return information in Result sets
                        
                        try {
                            
			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			// Loop through the result set
                        
			while(rs.next()) {
				System.out.println( "Title: " + rs.getString("movieTitle") + " Picked " + rs.getString("COUNT(movieTitle)") + " times.");
                           }

			// Close the result set
			rs.close() ;                      
			stmt.close() ;
			conn.close() ;
                        }
                        catch( SQLException se ){
                        
                        /*
                        * SQL Excpetion code in case needed for troubleshooting
                        */ 
                            
//			System.out.println( "SQL Exception:" ) ;
//
//			// Loop through the SQL Exceptions
//			while( se != null ){
//				System.out.println( "State  : " + se.getSQLState()  ) ;
//				System.out.println( "Message: " + se.getMessage()   ) ;
//				System.out.println( "Error  : " + se.getErrorCode() ) ;
//
//				se = se.getNextException() ;
//                            }
                        }
                        
                        
                        // Second try in case no result data sets are recognized to execute a simple query line
                        
                        try {
                            
                            stmt.executeUpdate(query);
                            
                            stmt.close() ;
                            conn.close() ;
                        }
                        catch( Exception e ){
                            
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
                        }
                
		}
		
		catch( Exception e ){
                    
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
		}
    }
    
    //Connection to print information in the recepit
    
    static void connectSQL4(String query){
        
        try{
			// Load the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbServer = "jdbc:mysql://localhost/ca_oop_aadp";
			String user = "root";
			String password = "root";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			Statement stmt = conn.createStatement() ;
                        
                        //First try used to return information in Result sets
                        
                        try {
                            
			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			// Loop through the result set
                        
			while(rs.next()) {
				System.out.println( "ID Record: " + rs.getString("recordID") + "\t" + " Title: " + rs.getString("movieTitle") + "\t" + " Expire date: " + rs.getString("rentExpire"));
                           }

			// Close the result set
			rs.close() ;                      
			stmt.close() ;
			conn.close() ;
                        }
                        catch( SQLException se ){
                        
                        /*
                        * SQL Excpetion code in case needed for troubleshooting
                        */ 
                            
//			System.out.println( "SQL Exception:" ) ;
//
//			// Loop through the SQL Exceptions
//			while( se != null ){
//				System.out.println( "State  : " + se.getSQLState()  ) ;
//				System.out.println( "Message: " + se.getMessage()   ) ;
//				System.out.println( "Error  : " + se.getErrorCode() ) ;
//
//				se = se.getNextException() ;
//                            }
                        }
                        
                        
                        // Second try in case no result data sets are recognized to execute a simple query line
                        
                        try {
                            
                            stmt.executeUpdate(query);
                            
                            stmt.close() ;
                            conn.close() ;
                        }
                        catch( Exception e ){
                            
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
                        }
                
		}
		
		catch( Exception e ){
                    
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        //System.out.println( e ) ;
		}
    }
    
    //Connection to filter record ID and return the ID number
    
    public String connectSQL5(String query){
        
        String result = "test";
        try{
			// Load the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbServer = "jdbc:mysql://localhost/ca_oop_aadp";
			String user = "root";
			String password = "root";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			Statement stmt = conn.createStatement() ;
                        
                        //First try used to return information in Result sets
                        
                        try {
                            
			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			// Loop through the result set
                        
                        while(rs.next()) {
                            result = rs.getString("recordID");
                        }
                        

			// Close the result set
			rs.close() ;                      
			stmt.close() ;
			conn.close() ;
                        }
                        catch( SQLException se ){
                        
                        /*
                        * SQL Excpetion code in case needed for troubleshooting
                        */ 
                            
			System.out.println( "SQL Exception:" ) ;

			// Loop through the SQL Exceptions
			while( se != null ){
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
                            }
                        }
                        
                        
                        // Second try in case no result data sets are recognized to execute a simple query line
                        
                                        
		}
		
		catch( Exception e ){
                    
                            /*
                            * SQL Excpetion code in case needed for troubleshooting
                            */ 
                        
                        System.out.println( e ) ;
		}
        
        return result;
    }
    
}
