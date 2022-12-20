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
        
/*
@Carolina Franco do Prado
Student ID: 2020354
*/
public class UI {
    
     public void UI() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{ 
   
         
         do {
             Scanner userInput = new Scanner (System.in);
             System.out.println("Do you want to Register on EirVid?");
             System.out.println("TYPE ONLY NUMERICAL DATA! ");
             System.out.println("1 for YES or 2 for NO:");
             String opreg = userInput.nextLine();
            
//REGISTER USER
            
                 switch (opreg) {
    //If the user type 1 the registration will be done 
                     case "1":
                         Scanner userinput2 = new Scanner(System.in);
                         System.out.println("NAME: ");
                         String name = userinput2.nextLine();
                         System.out.println("E-MAIL: ");
                         String email = userinput2.nextLine();
                         String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    //Verify if it is a valid email input
                         Boolean e = email.matches(EMAIL_REGEX);
                         int selectedMovieId = 1000000000;
                         
   //If it is a valid email input the system will generate a random password                        
                         if(e==true){
   //Output the password generated by the PasswordGenerator class                         
                             System.out.println("Welcome to EirVid! Your password is: " + PasswordGenerator.createPassword(8) );
                             
                             boolean movieLocate = false;
                             
                             while(selectedMovieId != 0 && !movieLocate){
                                 System.out.println("Choose a movie from our list typing the ID:");
   //Display the movie list                              
                                 CSVFileProcessor csv = new CSVFileProcessor();
                                 csv.CSVFileProcessor();
                                 
                                 System.out.println("Type the movie ID:");
                                
                                 selectedMovieId = userInput.nextInt();
    //If the input for select a movie ID is not 0 or a movie that is not on the list the system will display the receipt                             
                                 System.out.println("----------------------RECEIPT--------------------");
                                 movieLocate = csv.FindMovieById(selectedMovieId);
                                 System.out.println("User: " + name);
                                 System.out.println("-------------------------------------------------");
   

                              
                             }
                                                         
                        }else{
   //If the email chose by the user doesn't follow an e-mail pattern system will out put the following                   
                             System.out.println("Type a valid e-mail.");
                             UI();// THIS IMPLEMENTS THE METHOD AGAIN , IN CASE THE INPUT DOES NOT MATCH THE PROGRAM EXPECTED VALUES
                         }           
                     case "2":
                         System.out.println("See you soon!");
                         break;
                         
                     default:
                         System.out.println("Please type only numerical data between 1 to 2.");
                         break;
                               }
        }while (false);
     }
}

         


