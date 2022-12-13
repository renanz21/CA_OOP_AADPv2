/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvidprototype;

import eirvidprototype.Receipt;



/**
 *
 * @author ca_ro
 */
class IssueReceipt extends Receipt {
        
    IssueReceipt(String name, String title, double price){
        this.printname = name;
        this.title=title;
        this.price=price;
    }
     /*
        Output example:
            Name: Jack
            Movie title: Harry Potter
            Rent price: $20.99
        
        */

    @Override
   public void issue(){
           
        System.out.println("Name: "+ printname);
        System.out.println("Title: "+ title);
        System.out.println("Price: $"+ price);   
          
           
    }
    }

