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
        String originalLanguage = columns[0];
        String originalTitle = columns[1];
        String overview = columns[2];
        double popularity = Double.parseDouble(columns[3]);
        //find how to get date
        int runtime = Integer.parseInt(columns[5]);
        String tagline = columns[6];
        String title = columns[7];
        double voteAverage = Double.parseDouble(columns[8]);
        int voteCount = Integer.parseInt(columns[9]);
        double price = Double.parseDouble(columns[10]);
        
        return new MoviesRecord(
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
