/*s
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Complex;
import Complex.ComplexOperations;
import Complex.Complex;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class ComplexMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("COMPLEX NUMBER 1");
        Complex c1=new Complex();
        
        System.out.println("Enter the real part: ");
        double r1=sc.nextDouble();
        c1.setReal(r1);
        
        System.out.println("Enter the imaginary part: ");
        double i1=sc.nextDouble();
        c1.setImag(i1);
        
        c1.printNo();
        
        System.out.println("COMPLEX NUMBER 2");
        Complex c2=new Complex();
        
        System.out.println("Enter the real part: ");
        double r2=sc.nextDouble();
        c2.setReal(r2);
        
        System.out.println("Enter the imaginary part: ");
        double i2=sc.nextDouble();
        c2.setImag(i2);
        
        c2.printNo();
        
        Complex c3=ComplexOperations.add(c1, c2);
        System.out.println("Sum of the complex numbers: "+c3);
        
        Complex c4=ComplexOperations.multiply(c1, c2);
        System.out.println("Product of the complex numbers: "+c4);
        
        double m1=ComplexOperations.mod(c1);
        double m2=ComplexOperations.mod(c2);
        
        System.out.println("Modulus of complex number 1="+m1);
        System.out.println("Modulus of complex number 2="+m2);  
        
        sc.close();
        
        
    }
    
}
