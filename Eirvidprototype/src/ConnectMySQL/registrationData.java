/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;

import java.util.Scanner;
import ConnectMySQL.InsertClass;
import ConnectMySQL.ReturnClass;

/**
 *
 * @author Lucresse Pearle Tchatchoua Mbakop- 2021404
 */
public class registrationData {
     static  void menu( )  {
         try{
         System.out.println("Welcome to RTE Rental System");
         System.out.println("Please select One option");
         System.out.println("1-Register");
         System.out.println("2-Log in");
          Scanner scan = new Scanner(System.in);
          int option= scan.nextInt();
          if (option == 1){
              logIn();
          }else if (option == 2){
              register();
          }
         }
         catch (Exception e) {
            System.out.println("please choose one of the option above ");
        }
         
    
    }
   
     static void logIn()  {
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
     
      static void register() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("Welcome  to RTE");
            System.out.println("----------------------------------------");
            System.out.println("Enter your name ");
            String name = scan.next();
            System.out.println("Enter your email ");
            String email = scan.next();
            System.out.println("Enter your Password ");
           String password = scan.next();
           InsertClass.insertInformation(name, email, password);
           System.out.println("Retype  your Password ");
           String password1 = scan.next();
            if(password1 != password){
             System.out.println("error not similar");
            }else{
            logIn();
            }
           
        } catch (Exception e) {
            System.out.println(" Your informations are not found in our system");

        }
    }
    
}
