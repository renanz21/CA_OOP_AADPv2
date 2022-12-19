/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

/**
 *
 * @author Amanda Lima
 * Student Number: 2020304
 */
public class ColumnsMap {
    /* This class was created based on Algorithms, architecture design patterns classes
    
    */
    public MoviesRecord Map(String[] columns) {
        int id = Integer.parseInt(columns[0]);
        String originalLanguage = columns[1];
        String originalTitle = columns[2];
        String overview = columns[3];
        double popularity = Double.parseDouble(columns[4]);
        //find how to get date
        int runtime = Integer.parseInt(columns[6]);
        String tagline = columns[7];
        String title = columns[8];
        double voteAverage = Double.parseDouble(columns[9]);
        int voteCount = Integer.parseInt(columns[10]);
        double price = Double.parseDouble(columns[11]);
        
        return new MoviesRecord(
                id,
                originalLanguage,
                originalTitle,
                overview,
                popularity,
                runtime,
                tagline,
                title,
                voteAverage,
                voteCount,
                price
        );  
}
}