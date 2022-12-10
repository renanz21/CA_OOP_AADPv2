/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

/**
 *
 * @author Z
 */
public class RemoveClass {
    
    static void removeInformation(){
            String newQuery = "DELETE FROM `test`.`mytable` WHERE (`name` = 'Example name'))";
            SQLConnection.connectSQL(newQuery);
    }    
}
