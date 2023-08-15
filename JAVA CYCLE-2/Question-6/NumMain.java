/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumNull;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class NumMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] strAr= new String[2];
        for(int i=0; i<2; i++)
        {
            System.out.println("Enter a string: ");
            strAr[i]=sc.next();
        }
        
        for(int i=0; i<2; i++)
        {
            try 
            {
                int parsedNumber = Integer.parseInt(strAr[i]);
                System.out.println("Parsed Number: " + parsedNumber);
            } 
            catch (java.lang.NumberFormatException e) 
            {
                System.out.println("NumberFormatException caught: " + e.getMessage());
            }  
        }
       
    }
    
}
