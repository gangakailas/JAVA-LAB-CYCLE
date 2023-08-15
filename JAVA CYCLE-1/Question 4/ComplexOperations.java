/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complex;
import Complex.Complex;
import java.lang.Math;

/**
 *
 * @author ganga
 */
class ComplexOperations {
    public static Complex add(Complex c1, Complex c2)
    {
        Complex c3=new Complex();
        c3.setReal(c1.getReal()+c2.getReal());
        c3.setImag(c1.getImag()+c2.getImag());
        return c3;
    }
    
    public static Complex multiply(Complex c1, Complex c2)
    {
        Complex c3=new Complex();
        c3.setReal((c1.getReal()*c2.getReal())-(c1.getImag()*c2.getImag()));
        c3.setImag((c1.getReal()*c2.getImag())+(c2.getReal()*c1.getImag()));
        return c3;
    }
    
    public static double mod(Complex c)
    {
        double modulus=0.0;
        modulus=(c.getReal()*c.getReal())+(c.getImag()*c.getImag());
        modulus=Math.sqrt(modulus);
        return modulus;
    }
    
}    

