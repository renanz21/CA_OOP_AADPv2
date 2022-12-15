/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvidprototype;
import ConnectMySQL.saveData;

/**
 *
 * @author ca_ro
 */
class Receipt implements interfaceReceipt {
    
    String name;
    String title;
    double price;
    
   
    
    @Override
    public void print(){
       CSVFileProcessor csv = new CSVFileProcessor();
       try{
        
        csv.CSVFileProcessor();
       
      
        
        System.out.println("_________________________________________________________");
        System.out.println("---------------------RECEIPT-----------------------------");
        System.out.println("_________________________________________________________");
        
        System.out.println("Name: "+ csv.equals(name));
        System.out.println("Title: "+ csv.equals(title));
        System.out.println("Price: $"+csv.equals(price));
        saveData.saveData(title, 0, price, name);
       }catch(Exception e){
           
       }
    }
}
