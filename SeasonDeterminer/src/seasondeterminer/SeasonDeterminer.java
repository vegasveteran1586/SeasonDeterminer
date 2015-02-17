/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seasondeterminer;

import javax.swing.*;

/**
 *
 * @author Jonas
 */
   public class SeasonDeterminer {
    public static void main(String[] args) {
        int inputTemp;
        String response = JOptionPane.showInputDialog(null, "Enter the temperature" , "Probably season" ,1);
        inputTemp = Integer.parseInt(response);
        String message = "Based on the temperature of "
                + inputTemp + " it is most likely " + SeasonDeterminer(inputTemp);
        JOptionPane.showMessageDialog(null, message);
        
    }
    
    public static String SeasonDeterminer(int inputTemp){
        if (inputTemp > 130 | inputTemp < -20) {
                return "invalid";
            }   
            else if (inputTemp >= 90) {
                return "summer";
            }
            else if (inputTemp >= 70) {
                return "spring";
            }
            else if (inputTemp >= 50) {
                return "fall";
            }
            else if (inputTemp < 50) {
                return "winter";
            }
            else
                return "invalid";    
        
    }//ends main
}//ends the program
