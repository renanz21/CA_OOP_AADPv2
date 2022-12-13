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
    
    public static void listInformation(){
            String newQuery = "SELECT * FROM admin;";
            SQLConnection.connectSQL(newQuery);
            
    }
    
    public static void searchByName(String name){
            String newQuery = "SELECT * FROM mytable WHERE (`name` = '" + name + "');";
            SQLConnection.connectSQL(newQuery);
            
    }
    
    public static void searchByEmail(String email){
            String newQuery = "SELECT * FROM mycadb WHERE (`email` = '" + email + "');";
            SQLConnection.connectSQL(newQuery);
            
    }
}
