/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccsw.assignment2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ysasm
 */
public class CCSWAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double[][][] t = {
            {
                {8.8, 5.5, 9.0},
                {8.8, 5.5, 9.0},
                {8.8, 5.5, 9.0}
            }
        };
     
        double[][] te = {
            {8.8, 5.5, 9.0},
            {8.8, 5.5, 9.0},
            {8.8, 5.5, 9.0}};
        SensorDataProcessor test = new SensorDataProcessor(t,te);
        
        test.calculate(5.0);
        
    }
    
}
