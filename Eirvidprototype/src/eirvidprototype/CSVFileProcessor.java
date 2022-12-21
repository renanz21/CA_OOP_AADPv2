/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

import ConnectMySQL.InsertClass;
import ConnectMySQL.ReturnClass;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Amanda Lima
 * Student number:2020304
 * 
 * @author Carolina Franco do Prado (from line 33 to 69)
 * Student number:2020354
 */
public class CSVFileProcessor {
    /* This class was created based on Algorithms, architecture design patterns classes
    */
    //this method is responsable for putting everything together in the process of reading the csv file 
    public void CSVFileProcessor() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        String inputFile = "Movie_Metadata_Edited_2_Small.csv";

        DataImport dataImport = new DataImport();
        DataParser dataParser = new DataParser();
        //this line initiate the class test
        ClassTest test = new ClassTest();
        List<String> lines = dataImport.InputData(inputFile);
        List<MoviesRecord> movies = dataParser.ParseData(lines);
        //this parser the list as a paramenter using the variable movies that was created here
        test.outputData(movies);
    }

    
    public boolean FindMovieById(int Id) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String inputFile = "Movie_Metadata_Edited_2_Small.csv";
        DataImport dataImport = new DataImport();
        DataParser dataParser = new DataParser();
        //this line initiate the class test
        List<String> lines = dataImport.InputData(inputFile);
        List<MoviesRecord> movies = dataParser.ParseData(lines);
        //this parser the list as a paramenter using the variable movies that was created here
        
        
        
        boolean locate = false;
        for (MoviesRecord movie : movies) {
         //If movie Id is found will output the movie and the price   
            if(Id == movie.id){
                locate = true;
                System.out.println("Movie: " + movie.title + " Price: " + movie.price);
                
                //Inserts the record of movie picked in the database
                InsertClass.insertMovie(movie.title, movie.price);
                
            }
        }        
        if(!locate){
            System.out.println("Movie not found.");
        }  
        return locate;
    }

}



class MoviesRecord { 
    //this class receive and classify all the data
        int id;
        String originalLanguage;
        String originalTitle;
        String overview;
        double popularity;
        int runtime;
        String tagline;
        String title;
        double voteAverage;
        int voteCount;
        double price;

    public MoviesRecord(int id, String originalLanguage, String originalTitle, String overview, double popularity, int runtime, String tagline, String title, double voteAverage, int voteCount, double price) {
        this.id = id;
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
        
        //for testing only
        //System.out.println(this.price + " " + this.title);
    }
        
}
