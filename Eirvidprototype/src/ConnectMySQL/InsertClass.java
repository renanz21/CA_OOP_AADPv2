/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

/**
 *
 * @author Z
 */
public class InsertClass {
    
    static void insertInformation(){
            String newQuery = "INSERT INTO `myTable` (`name`)\n" + "VALUES\n" + "  (\"Example name\")";
            SQLConnection.connectSQL(newQuery);
    }
    
}

