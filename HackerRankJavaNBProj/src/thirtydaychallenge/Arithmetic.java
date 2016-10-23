/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirtydaychallenge;

import java.util.Scanner;

/**
 *
 * @author Dominic
 */
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the meal price? : ");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.println("What is the tip percentage? : ");
        int tipPercent = scan.nextInt(); // tip percentage
        System.out.println("What is the tax percentage?: ");
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close(); //close intance of scan 
      
        // Write your calculation code here.
        
        ///create temporary areas for the bits to be added one
        double tempMealPerStore = (mealCost / 100) * tipPercent ;
        double tempTaxPerStore = (mealCost / 100) * taxPercent;
        
        //store amounts in double to ensure percision
        double storeAddAmounts = tempMealPerStore + tempTaxPerStore + mealCost;        
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(storeAddAmounts);
      
        // Print your result
        
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
