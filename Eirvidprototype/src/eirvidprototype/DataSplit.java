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
public class DataSplit {
    /* This class was created based on Algorithms, architecture design patterns classes
    This break the file apart everytime that there is a ",".
    */
    public String[] Seperate(String line) {
        return line.split(",");        
    }
}
