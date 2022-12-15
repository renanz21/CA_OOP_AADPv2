/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eirvidprototype;

import ConnectMySQL.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Z
 */
public class Eirvidprototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
       
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
           
           
// before getting any variable from the cvs classes, use this two lines, you need to call the class and start it
//this lines needs to be initiated preferable at the top
           CSVFileProcessor csv = new CSVFileProcessor();
           csv.CSVFileProcessor();
            }
           
    }

   
    

