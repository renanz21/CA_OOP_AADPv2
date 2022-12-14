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
    
    Receipt(double price, String name, String title){
       this.price = price;
       this.name= name;
       this.title = title;
    }
    
    @Override
    public void print(){
        System.out.println("_________________________________________________________");
        System.out.println("---------------------RECEIPT-----------------------------");
        System.out.println("_________________________________________________________");
        
        System.out.println("Name: "+ name);
        System.out.println("Title: "+ title);
        System.out.println("Price: $"+price);
        saveData.saveData(title, 0, price, name);
    }
}
