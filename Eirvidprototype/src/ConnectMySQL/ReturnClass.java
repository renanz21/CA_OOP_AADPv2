/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

/**
 *
 * @author Z
 */
public class ReturnClass {
    
    public static void listInformation(){
            String newQuery = "SELECT * FROM mytable";
            SQLConnection.connectSQL(newQuery);
            
    }
}
