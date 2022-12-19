/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectMySQL;
import java.util.Scanner;

/**
 *
 * @author Lucresse Pearle Tchatchoua Mbakop- 2021404
 */
public class saveData {
     // save the data of the user into the database 
     public static void saveData(String title, int movieID ,double price, String name){
            String save ="INSERT INTO `ca_oop_aadp`.`rent` ('movieID', 'title', 'price','name') VALUES ('" + movieID+ "', '" + title + "','" + price + "','" + name + "');";
            SQLConnection.connectSQL(save);
            System.out.println("movie name have been save in our database");        
     }
     
     public static void deleteData(){
         // MYSQL QUERY THAT DELETE THE CODE FROM THE LIST
            System.out.println("Do you which to remove a movie from your history, type 1 for yes or 2 for no");
           Scanner scan = new Scanner(System.in);
            int YN = scan.nextInt();
                if(YN == 1){
             System.out.println("Please select the id of the movie");
             int id = scan.nextInt();
             String deleteData = "DELETE FROM `ca_oop_aadp`.`userinfo` WHERE (`id` = '"+id+"'))";
             SQLConnection.connectSQL(deleteData);
                }
                else if(YN == 2){
             System.out.println("your data remain unchange");   
                }
     } 
     
    /*public static void timeStamp(){
    String timeStamp = "SELECT 5 FROM `ca_oop_aadp`.`rent` ";
             SQLConnection.connectSQL(timeStamp);
             System.out.println(timeStamp); 
    
    }*/
    
     public static void mostRented(String [] args){
         // TH QUERRY THAT GET THE MOST RENTED MOVIE IN THE DATABASE
         String mostRented ="SELECT TOP 5 FROM `rent` WHERE MAX(countDown) ORDER BY movieID;";
         SQLConnection.connectSQL(mostRented);
         System.out.println(mostRented);   
     }
   
     
     
                
}
