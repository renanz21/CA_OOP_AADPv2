/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eirvidprototype;

import ConnectMySQL.*;
import eirvidprototype.IssueReceipt;

/**
 *
 * @author Z
 */
public class Eirvidprototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
      /*  
        String name = "Aaron Goodman";
        String email = "cc@email.com";
        int id = 2;

        String value = "gg2@email.com";
            //ReturnClass.listInformation();

        String value = "gg2@email.com";
      
        int price = 56;
        String original_title = null;
        String original_language = null;
        double popularity = 0;
        String tagline = null;
        String title = null;
        String overview = null;*/
       String user ="Carol";  
       String film = "ToyStory";
       Double value = 20.00;
       interfaceReceipt inter = new Receipt(value ,user, film);
       inter.print();
            //ReturnClass.searchByName(name);
            //InsertClass.insertInformation(name, email); 
            //DeleteClass.removeInformation();
           // InsertClass.updateEmail(id, value);
          
    }

   
    
}
