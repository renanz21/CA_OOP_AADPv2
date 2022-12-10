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
 * @author Z
 */
public class SQLConnection {
    
    static void connectSQL(String query){
        
        try{
			// Load the database driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbServer = "jdbc:mysql://localhost/test";
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
				System.out.println( rs.getString("name"));
                                      //  + "\t" + rs.getString("email") ;
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
                            stmt.execute(query);
                            
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
}