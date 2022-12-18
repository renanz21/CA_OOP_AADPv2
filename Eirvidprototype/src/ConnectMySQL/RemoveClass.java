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
public class RemoveClass {
    
    //Query to remove the movie from the rented list
    
    public static void removeMovie(int id){
            String newQuery = "DELETE FROM `ca_oop_aadp`.`rent` WHERE (`id` = '" + id +"'))";
            SQLConnection.connectSQL(newQuery);
    }    
}
