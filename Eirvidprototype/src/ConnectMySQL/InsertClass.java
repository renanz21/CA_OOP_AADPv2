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
    
    public static void insertInformation(String name, String email){
            String newQuery = "INSERT INTO `test`.`mytable` (`name`, `email`) VALUES ('" + name + "', '" + email + "');";
            SQLConnection.connectSQL(newQuery);
    }
    
    public static void updateEmail(int id, String value){
            String newQuery = "UPDATE `test`.`mytable` SET `email` = '" + value + "' WHERE (`id` = '" + id + "');";
            SQLConnection.connectSQL(newQuery);        
    }
    
}

