/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amanda Lima
 * Student Number: 2020304
 */
public class DataParser {
    /* This class was created based on Algorithms, architecture design patterns classes
   
    */
    public List<MoviesRecord> ParseData(List<String> lines) {
        List<MoviesRecord> movies = new ArrayList<>();
        DataSplit dataSplit = new DataSplit();
        DataValidator dataValidator = new DataValidator();
        ColumnsMap columnsMap = new ColumnsMap();
        
        lines.forEach(line -> {
            // Splitting
            String[] columns = dataSplit.Seperate(line);
            
            // Validating
            if (dataValidator.ValidateData(columns)) {
                // Mapping
            movies.add(columnsMap.Map(columns));
            //}
        });   
        return movies;
    }

}
