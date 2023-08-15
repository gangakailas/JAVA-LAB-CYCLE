/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Box;
import Box.Box;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class BoxMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter side for cube: ");
        int s=sc.nextInt();
        Box b1=new Box(s);
        
        System.out.println("Enter side for square prism: ");
        int s2=sc.nextInt();
        System.out.println("Enter height for square prism: ");
        int h=sc.nextInt();
        Box b2=new Box(s2,h);
        
        System.out.println("Enter length for rectangular prism: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth for rectangular prism: ");
        int b=sc.nextInt();
        System.out.println("Enter height for rectangular prism: ");
        int h1=sc.nextInt();
        Box b3=new Box(l, b, h1);
        
        System.out.println("AREAS");
        System.out.println("The cube="+b1.findArea());
        System.out.println("The square prism="+b2.findArea());
        System.out.println("The rectangular prism="+b3.findArea());
        
        System.out.println("VOLUMES");
        System.out.println("The cube="+b1.findVolume());
        System.out.println("The square prism="+b2.findVolume());
        System.out.println("The rectangular prism="+b3.findVolume());
        
        
        
        
        
        
    }
    
}
