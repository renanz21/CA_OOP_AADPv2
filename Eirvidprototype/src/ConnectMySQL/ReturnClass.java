/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

/**
 *
 * @author Renan Gomes
 * @SN 2020295
 */
public class ReturnClass {
    
    public static void listUserInformation(){
        
            String newQuery = "SELECT * FROM userinfo;";
            SQLConnection.connectSQL(newQuery);
            
    }
    
     public static void listTopRented(){
        
            String newQuery = "SELECT * FROM rent ORDER BY counter DESC LIMIT 5;";
            SQLConnection.connectSQL3(newQuery);
            
    }
    
    public boolean returnMovieIsFound(int movieID){
        
            SQLConnection obj = new SQLConnection();
            String newQuery = "SELECT * FROM rent WHERE (`movieID` = '" + movieID + "');";
            boolean result = obj.connectSQL2(newQuery);
            return result;
            
    }
    
    public static void searchByEmail(String email){
        
            String newQuery = "SELECT * FROM userinfo WHERE (`email` = '" + email + "');";
            SQLConnection.connectSQL(newQuery);
            
    }
}
