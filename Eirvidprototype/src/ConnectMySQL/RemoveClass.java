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
public class RemoveClass {
    
    public static void removeInformation(){
            String newQuery = "DELETE FROM `test`.`mytable` WHERE (`id` = '1'))";
            SQLConnection.connectSQL(newQuery);
    }    
}
