/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvidprototype;

import java.util.Scanner;
import eirvidprototype.PasswordGenerator;
import java.io.IOException;
        

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
             
             if(e==true){
                                 
                 System.out.println("Welcome to EirVid! Your password is: " + PasswordGenerator.createPassword(8) );
                 
                 System.out.println("Choose a movie from our list typing only the number.");
                 
                 CSVFileProcessor csv = new CSVFileProcessor();
                 
                 csv.CSVFileProcessor();
                 
                 String chmovie = userinput2.nextLine();
                 
                 String numberRegex = "[0-9]+";
                
                 Boolean m = chmovie.matches(numberRegex);
                 
                  
                  
                  
                  
                 if(m==true){
                     
                 }else{
                     
                     System.out.println("Please type only numerical data.");
                 }
                 
             }else{
                 
                 System.out.println("Type a valid e-mail.");
                 
             }
            
               
         }else if(opreg==2){
             
             System.out.println("See you soon!");
             
         }else{
             System.out.println("Please type only numerical data between 1 to 2.");
         }
         
    }
     
       
       
      
}
