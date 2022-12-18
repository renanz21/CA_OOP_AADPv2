/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

/**
 *
 * @author Renan Gomes
 * @SN 2020295
 * 
 */
public class ReturnClass {
    
    //Query to list user information from database
    
    public static void listUserInformation(){
        
            String newQuery = "SELECT * FROM userinfo;";
            SQLConnection.connectSQL(newQuery);
            
    }
    
    //Query to filter and order top 5 movies in the last 5 minutes
    
     public static void listTopRented(){
        
            String newQuery = "SELECT COUNT(movieTitle), movieTitle FROM rent WHERE rentPlusFive > sysdate() GROUP BY movieTitle ORDER BY COUNT(movieTitle) DESC;";
            SQLConnection.connectSQL3(newQuery);
            
    }
    
    //Comment 1 - Query to search if movie already exists in the database
    //Comment 2 - Approach changed, finding movies not necessary, record of every movie is stored in database
     
    public boolean returnMovieIsFound(int movieID){
        
            SQLConnection obj = new SQLConnection();
            String newQuery = "SELECT * FROM rent WHERE (`movieID` = '" + movieID + "');";
            boolean result = obj.connectSQL2(newQuery);
            return result;
            
    }
    
     public static void rentExpire(int recordID){
         
        String newQuery = "SELECT recordID, movieTitle, rentExpire FROM rent WHERE (`recordID` = '" + recordID + "');";
        SQLConnection.connectSQL4(newQuery);
        
    }
    
    public static void searchByEmail(String email){
        
            String newQuery = "SELECT * FROM userinfo WHERE (`email` = '" + email + "');";
            SQLConnection.connectSQL(newQuery);
            
    }
}
