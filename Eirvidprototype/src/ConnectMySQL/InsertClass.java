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
public class InsertClass {
    
    //Query for adding a new user information in the database
    
    public static void insertInformation(String name, String email, String password){
            String newQuery = "INSERT INTO `ca_oop_aadp`.`userinfo` (`email`, `password`, `name`) VALUES ('" + email + "', '" + password + "', '" + name + "');";
            SQLConnection.connectSQL(newQuery);
    }
    
    //Query to add a record of all movies picked from any user
    
     public static void insertMovie(String title, double price){
        
            String newQuery = "INSERT INTO `ca_oop_aadp`.`rent` (`movieTitle`, `price`, `rentTime`, `rentExpire`, `rentPlusFive`) VALUES ('" + title + "', '" + price + "', sysdate(), sysdate() + interval '1' minute, sysdate() + interval '5' minute);";
            //String newQuery = "INSERT INTO `ca_oop_aadp`.`rent` (`movieID`, `title`, `price`, `counter`) VALUES ('" + movieID + "', '" + title + "', '" + price + "', '" + counter + "');";
            SQLConnection.connectSQL(newQuery);
    }
}
    


