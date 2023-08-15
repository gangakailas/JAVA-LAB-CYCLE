/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Shapes;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class ShapesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("CYLINDER");
        System.out.println("Enter the radius for the cylinder");
        double r1=sc.nextDouble();
        System.out.println("Enter the height for the Cylinder");
        double h=sc.nextDouble();
        
        System.out.println("SPHERE");
        System.out.println("Enter the radius for the sphere");
        double r2=sc.nextDouble();
        
        Cylinder c=new Cylinder(r1, h);
        Sphere s=new Sphere(r2);
        
        System.out.println("The volume of the Cylinder: "+c.printVolume());
        System.out.println("The area of the Cylinder: "+c.printArea());
        
        System.out.println("The volume of the Sphere: "+s.printVolume());
        System.out.println("The area of the Sphere: "+s.printArea());
        
        
    }
    
}
