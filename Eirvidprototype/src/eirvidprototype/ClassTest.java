/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

import java.util.List;

/**
 *
 * @author Amanda Lima
 *  Student number:2020304
 */
public class ClassTest {
    /* This class was created based on Algorithms, architecture design patterns classes
    */
    
    //this class receive the list of movies as a parameter, I used so you guys could see it how to get information from the CVSFileProcessor, pls go to the CVSFileProcessor to see the final step 
    public void outputData(List<MoviesRecord> movies) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //this loop read all the lines
         for (MoviesRecord movie : movies) {
            //here all the code needed for the other classes can be used to parser the information on the list for the database or any other use 
           System.out.println("Id:" + movie.id + " - Title: " + movie.title + " - $" + movie.price);
         }            
    }
}
