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
    This create a BufferedReader, read the lines in the file into a Arraylist and return the lines
    */
    public List<MovieRecord> ParseData(List<String> lines) {
        List<MovieRecord> trades = new ArrayList<>();
        DataSplit dataSplit = new DataSplit();
        //DataValidator dataValidator = new DataValidator();
        ColumnsMap columnsMap = new ColumnsMap();
        
        lines.forEach(line -> {
            // Splitting
            String[] fields = dataSplit.Seperate(line);
            
            // Validating
            //if (dataValidator.ValidateData(fields)) {
                // Mapping
            trades.add(dataMapper.Map(fields));
            //}
        });   
        return trades;
    }

}
