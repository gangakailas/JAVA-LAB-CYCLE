/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MyException;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class MyExceptionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        
        try
        {
            if(age<0)
            {
                throw new MyException("Age cannot be negative!!");
            }
            System.out.println("Age: "+age);
        }
        catch(MyException ex)
        {
            System.out.println("Exception caught: "+ex.getMessage());
        }
    }
    
}
