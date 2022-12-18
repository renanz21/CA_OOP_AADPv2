/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

import java.util.Scanner;
import ConnectMySQL.InsertClass;
import ConnectMySQL.ReturnClass;
import eirvidprototype.CSVFileProcessor;
import eirvidprototype.PasswordGenerator;

/**
 *
 * @author Lucresse Pearle Tchatchoua Mbakop- 2021404
 * @Adjustment Renan Gomes - 2020295
 * Merge of UI class from Carol with registrationData class.
 * 
 */
public class registrationData {
     public static void menu()  {
         try{
         System.out.println("Welcome to RTE Rental System");
         System.out.println("Please select One option");
         System.out.println("1-Register");
         System.out.println("2-Log in");
         System.out.println("0-Exit");
          Scanner scan = new Scanner(System.in);
          int option= scan.nextInt();
          
          switch (option) {
              case 0:
                  System.out.println("Bye");
                  break;
              case 1:
                  register();
                  break;
              case 2:
                  logIn();
                  break;
          }
         }
         catch (Exception e) {
            System.out.println("please choose one of the option above ");
        }
         
    
    }
   
     public static void logIn()  {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("Welcome dear Customer");
            System.out.println("----------------------------------------");
            System.out.println("Enter your email ");
            String email = scan.next();
            System.out.println("Enter your Password ");
           String password = scan.next();
           ReturnClass.searchByEmail(email);
           
        } catch (Exception e) {
            System.out.println(" Your informations are not found in our system");

        }
    }
     
      public static void register() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("Welcome  to RTE");
            System.out.println("----------------------------------------");
            System.out.println("Enter your name ");
            String name = scan.next();
            System.out.println("Enter your email ");
            String email = scan.next();
            
            String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
             
            Boolean e = email.matches(EMAIL_REGEX);
             
            int selectedMovieId = 1000000000;
            
            if(e==true){
                
                String password = PasswordGenerator.createPassword(8);
                System.out.println("Welcome to EirVid! Your password is: " + password );
                InsertClass.insertInformation(name, email, password);
                
                boolean movieLocate = false;
                while(selectedMovieId != 0 && !movieLocate){
                    System.out.println("Choose a movie from our list. Put the Id movie or 0 for cancel");
                    CSVFileProcessor csv = new CSVFileProcessor();                 
                    csv.CSVFileProcessor();                 
                    System.out.println("Type the movie ID or 0 for cancel");
                    selectedMovieId = scan.nextInt();
                    movieLocate = csv.FindMovieById(selectedMovieId);
                    System.out.println("User: " + name); 
                    
                    
                }
                 
                if(selectedMovieId == 0){
                    System.out.println("See you soon!");
                }
                else{
                    
                }
               }
//            System.out.println("Enter your Password ");
//           String password = scan.next();           
//           System.out.println("Retype  your Password ");
//           String password1 = scan.next();
//            if(password1.equals(password)){
//             System.out.println(" similar");
//             
//                System.out.println(name);
//                System.out.println(email);
//                System.out.println(password);
//                
//                InsertClass.insertInformation(name, email, password);
//               //logIn();
//            }else{
//            System.out.println("not  similar");
//            }
           
        } catch (Exception e) {
            System.out.println(" Your informations are not found in our system");

        }
    }
    
}
