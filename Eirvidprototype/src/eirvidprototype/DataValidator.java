/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

/**
 * @author Amanda Lima
 * Student Number: 2020304
 */
public class DataValidator {
    /* This class was created based on Algorithms, architecture design patterns classes
    This class is responsable for checking if all the columns in the cvs file is in the correct format and output a boolean variable.
    */
     public boolean ValidateData(String[] columns) {
//      check if all the columns are incluided in the file
//System.out.println(columns.length);
        if (columns.length != 12) {
            System.out.println("Warning: Incorrect file format");
            return false;
        }
        
//      this check if the price is in the right format      
//        try {
//            Double.parseDouble(columns[11]);
//        } 
//        catch (Exception e) {
//             System.out.println("Warning: Movie price not a valid decimal");
//             return false;
//        }      
        return true;
    }
    
}
