/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PascalTriangle;

/**
 *
 * @author ganga
 */
public class PascalTriangle {
    
    public static void printTriangle(int row)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(binomialCoefficient(i, j)+" ");
            }
            System.out.println();
        }
    }
    
    public static int binomialCoefficient(int x, int y)
    {
        if(y==0 || y==x)
        {
            return 1;
        }
        else
        {
            return(binomialCoefficient(x-1, y-1)+binomialCoefficient(x-1, y));
        }
    }
    
    
    
    
    
}
