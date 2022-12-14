/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eirvidprototype;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Amanda Lima
 * Student Number: 2020304
 */
public class DataImport {
    /* This class was created based on Algorithms, architecture design patterns classes,
    This create a BufferedReader, read the lines from the file into a String list and return the lines.
    */
    public List<String> InputData(String InputFile) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(InputFile));
        List<String> lines = new ArrayList<>();
        String inputLine = bf.readLine();
        
        while ((inputLine = bf.readLine()) != null) {
            lines.add(inputLine);
        }     
        return lines;
    }
}
