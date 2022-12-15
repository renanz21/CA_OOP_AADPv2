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
public class InsertClass {
    
    public static void insertInformation(String name, String email, String password){
            //String newQuery = "INSERT INTO `userinfo` (`name`, `email`, `password`) VALUES ('" + name + "', '" + email + ", '" + password + "');";
            String newQuery = "INSERT INTO `ca_oop_aadp`.`userinfo` (`email`, `password`, `name`) VALUES ('" + email + "', '" + password + "', '" + name + "');";
            SQLConnection.connectSQL(newQuery);
    }
    
    public static void updateEmail(int id, String value){
            String newQuery = "UPDATE `ca_oop_aadp`.`userinfo` SET `email` = '" + value + "' WHERE (`id` = '" + id + "');";
            SQLConnection.connectSQL(newQuery);        
    }
    
    public static void updateMovie(int movieID, String title, double price, int counter){
            String newQuery = "INSERT INTO `ca_oop_aadp`.`rent` (`movieID`, `title`, `price`, `counter`) VALUES ('" + movieID + "', '" + title + "', '" + price + "', '" + counter + "');";
            SQLConnection.connectSQL(newQuery);
    }
    
    public static void updateMovie(int movieID){
            String newQuery = "UPDATE `ca_oop_aadp`.`rent` SET `counter` = `counter`+1 WHERE (`movieID` = '" + movieID +"');";
            SQLConnection.connectSQL(newQuery);
    }
}
    


