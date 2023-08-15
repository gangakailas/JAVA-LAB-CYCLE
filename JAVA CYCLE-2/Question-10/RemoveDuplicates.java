/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Duplicate;
import java.util.*; 
/**
 *
 * @author ganga
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] inputArray = {"apple", "banana", "mango", "apple", "grape","mango"};
        
        Set<String> uniqueElements = new TreeSet<>(Arrays.asList(inputArray));
        
        String[] resultArray = uniqueElements.toArray(new String[uniqueElements.size()]);
        
        System.out.println("Unique elements: ");
        for(String element:resultArray)
        {
            System.out.println(element);
        }
    }
    
}
