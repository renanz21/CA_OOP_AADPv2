/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvidprototype;

import java.util.Scanner;
import eirvidprototype.PasswordGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
        

public class UI {
    
     public void UI() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{ 
         
         Scanner userInput = new Scanner (System.in);
        
         System.out.println("Do you want to Register on EirVid?");
         
         System.out.println("Type 1 for YES or 2 for NO:");
         
         int opreg = userInput.nextInt();
         

//Register the user         
         if(opreg==1){
             
             Scanner userinput2 = new Scanner(System.in);
                   
             System.out.println("NAME: ");
             
             String name = userinput2.nextLine();
                
             System.out.println("E-MAIL: ");
             
             String email = userinput2.nextLine();
             
             String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
             
             Boolean e = email.matches(EMAIL_REGEX);
             
             int selectedMovieId = 1000000000;
             
             if(e==true){
                                 
                 System.out.println("Welcome to EirVid! Your password is: " + PasswordGenerator.createPassword(8) );
                 
                
                boolean movieLocate = false;
                while(selectedMovieId != 0 && !movieLocate){
                    System.out.println("Choose a movie from our list. Put the Id movie or 0 for cancel");
                    CSVFileProcessor csv = new CSVFileProcessor();                 
                    csv.CSVFileProcessor();                 
                    System.out.println("Type the movie ID or 0 for cancel");
                    selectedMovieId = userInput.nextInt();
                    movieLocate = csv.FindMovieById(selectedMovieId);
                    System.out.println("User: " + name); 
                    
                    //Method to record the movie piked in the database
                    
                    
                }
                 
                if(selectedMovieId == 0){
                    System.out.println("See you soon!");
                }
                else{
                    
                }
             }
             else{
                 
                 System.out.println("Type a valid e-mail.");
             }
             
             
         }else if(opreg==2){
             
             System.out.println("See you soon!");
             
         }else{
             System.out.println("Please type only numerical data between 1 to 2.");
         }
         
    }
     
       
       
      
}
