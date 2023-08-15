/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complex;

/**
 *
 * @author ganga
 */
class Complex {
    private double real;
    private double imag;
    
    public void setReal(double real)
    {
        this.real=real;
    }
    public void setImag(double imag)
    {
        this.imag=imag;
    }
    public double getReal()
    {
        return real;
    }
    public double getImag()
    {
        return imag;
    }
    public void printNo()
    {
        if(imag>0)
        {
            System.out.println(real+"+"+imag+"i");
        }
        else
        {
            System.out.print(real);
            System.out.println(imag+"i");
        }
        
    }
    @Override
    public String toString() 
    {
        if (imag >= 0) 
        {
            return real + " + " + imag + "i";
        } 
        else 
        {
            return real + " - " + Math.abs(imag) + "i";
        }
    }
    
    
}
