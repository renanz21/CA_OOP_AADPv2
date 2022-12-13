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
            String newQuery = "INSERT INTO `mycadb`.`admin` (`name`, `email`, `password`) VALUES ('" + name + "', '" + email + ", '" + password + "');";
            SQLConnection.connectSQL(newQuery);
    }
    
    public static void updateEmail(int id, String value){
            String newQuery = "UPDATE `mycadb`.`admin` SET `email` = '" + value + "' WHERE (`id` = '" + id + "');";
            SQLConnection.connectSQL(newQuery);        
    }
    
   
    
}

