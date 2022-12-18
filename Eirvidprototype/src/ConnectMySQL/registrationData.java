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
         // THIS CODE , ASK THE SOME INPUTS TO THE USER
          Scanner scan = new Scanner(System.in);// CREATE A SCANNER TO BE ABLE TO STORE THE USER SELECTION
          int option= scan.nextInt();// PARSE THE USER SELECTION INTO A VARIABLE
          
          switch (option) {
              case 0:
                  System.out.println("Bye");// IN CASE THE USER WANT TO EXIT THE PROGRAM
                  break;// BREAK IS USE TO STOP THE IMPLEMENTATION OF THE PROGRAM
              case 1:
                  register();// THE REGISTER METHOD IS CALLED
                  break;
              case 2:
                  logIn();// THE LOGIN METHOD IS CALL TO TAKE IN THE USER INFORMATION
                  break;
          }
         }
         catch (Exception e) {
            System.out.println("please choose one of the option above ");// THE ExceptION ,IN THE CASE NO SELECTION IS MADE BY THE USER
        }
         
    
    }
   
     public static void logIn()  {// THE LOGIN METHOD IS CREATED 
        try {
            Scanner scan = new Scanner(System.in);// CREATE A SCANNER TO TAKE THE USER INPUT 
            System.out.println("----------------------------------------");
            System.out.println("Welcome dear Customer");//
            System.out.println("----------------------------------------");
            System.out.println("Enter your email ");
            String email = scan.next();// STORE THE USER EMAIL INTO A VARIABLE
            System.out.println("Enter your Password ");
           String password = scan.next();// 
           ReturnClass.searchByEmail(email);// RETURN THE USER HISTORY 
           
        } catch (Exception e) {
            System.out.println(" Your informations are not found in our system");

        }
    }
     
      public static void register() {// CREATE A METHOD 
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("Welcome  to RTE");
            System.out.println("----------------------------------------");
            System.out.println("Enter your name ");
            String name = scan.next();// STORE THE USER INPUT INTO A VARIABLE
            System.out.println("Enter your email ");
            String email = scan.next();// STORE THE USER EMAIL INTO THE A VARIABLE 
            String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";// A REGEX IS IMPLEMENTED ON THE EMAIL FOR THE USER TO INPUT AND EMAIL FORMAT "@" IS REQUIRED
             
            Boolean e = email.matches(EMAIL_REGEX);// A VARIABLE e IS CREATED
             
            int selectedMovieId = 1000000000;
            
            if(e==true){// CONDITION IF THE e FORMAT IS EQUAL TO THE USER INPUT
                
                String password = PasswordGenerator.createPassword(8);// THE PROGRAM GENERATES A PASSWORD (BASE ON THE PASSEWORDGENERETOR CLASS)
                System.out.println("Welcome to EirVid! Your password is: " + password );// OUT PUT THE PASSWORD GENERATED TO THE USER
                InsertClass.insertInformation(name, email, password);// STORED , THE SAVE DATA INTO THE DATABASE
                
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
