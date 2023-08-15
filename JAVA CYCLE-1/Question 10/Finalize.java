/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finalize;

/**
 *
 * @author ganga
 */
public class Finalize {
    
    int x, y, z;
    public Finalize(int a, int b, int c)
    {
        x=a;
        y=b;
        z=c;
    }
    public void printAvg()
    {
        int avg=(x+y+z)/3;
        System.out.println("The average= "+avg);
    }
    public void finalize()
    {
        System.out.println("Garbage Collection Completed");
    }
    
}
