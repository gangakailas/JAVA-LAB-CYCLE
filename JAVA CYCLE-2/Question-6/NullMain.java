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
public class NullMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here {
        Scanner sc= new Scanner(System.in);
        String[] strAr= new String[2];
        System.out.println("Enter an element: ");
        strAr[0]=sc.next();
        
        for(int i=0; i<2; i++)
        {
            try
            {
                int strLength = strAr[i].length(); 
                System.out.println("String Length: " + strLength);
            } 
            catch (NullPointerException e) 
            {
                System.out.println("NullPointerException caught: " + e.getMessage());
            }
        }
        
    }
    
}
