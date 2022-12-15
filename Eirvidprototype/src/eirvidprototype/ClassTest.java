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
 */
public class ClassTest {
    
    //this class receive the list of movies as a parameter, I used so you guys could see it how to get information from the CVSFileProcessor, pls go to the CVSFileProcessor to see the final step 
    public void outputData(List<MoviesRecord> movies) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
           //this loop read all the lines
            for (MoviesRecord movie : movies) {
               //here all the code needed for the other classes can be used to parser the information on the list for the database or any other use 
               //when you use "movie." all the variable available are going to show up and you can just use what you need 
              System.out.println("Title: " + movie.title + " - £" + movie.price);
            }            
    
    
}
}
