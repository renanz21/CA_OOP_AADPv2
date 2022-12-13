/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvidprototype;




/**
 *
 * @author ca_ro
 */
abstract class Receipt {
   
               
        String printname = "";
        String title = "";
        double price=0;
        
        Receipt(String name, String movie,double value ){
            
            this.printname= name;
            this.title = movie;
            this.price = value;          
        }
        public void printReceipt(){
             
            System.out.println(this.printname+this.title+this.price);
        
        }
        abstract public void issue();
        
}
   

         

