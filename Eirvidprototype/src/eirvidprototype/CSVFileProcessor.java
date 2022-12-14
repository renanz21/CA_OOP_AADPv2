/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Amanda Lima
 */
public class CSVFileProcessor {
    public void ProcessTrades() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        String inputFile = "Movie_Metadata_Edited_2.csv";
        DataImport dataImport = new DataImport();
        DataParser dataParser = new DataParser();
               
        List<String> lines = dataImport.InputData(inputFile);
        List<MoviesRecord> movies = dataParser.ParseData(lines);
        
    }
}

class MoviesRecord { 
        String originalLanguage;
        String originalTitle;
        String overview;
        double popularity;
        //find how to get date
        int runtime;
        String tagline;
        String title;
        double voteAverage;
        int voteCount;
        double price;

    public MoviesRecord(String originalLanguage, String originalTitle, String overview, double popularity, int runtime, String tagline, String title, double voteAverage, int voteCount, double price) {
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.overview = overview;
        this.popularity = popularity;
        this.runtime = runtime;
        this.tagline = tagline;
        this.title = title;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.price = price;
    }
    
    
    
}
