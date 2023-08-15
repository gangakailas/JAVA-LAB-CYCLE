/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rectangle;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class RectangleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("RECTANGLE 1");
        System.out.println("Enter the length of the rectangle: ");
        int length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth=sc.nextInt();
        
        Rectangle r1=new Rectangle(length, breadth);
        System.out.println("The area of Rectangle 1="+r1.getArea());
        
        System.out.println("RECTANGLE 2");
        System.out.println("Enter the length of the rectangle: ");
        int length1=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth1=sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height1=sc.nextInt();
        
        Box b=new Box(length1, breadth1, height1);
        System.out.println("The area of Rectangle 2="+b.getArea());
        System.out.println("The volume of Rectangle 2="+b.getVolume());
        
        
        
    }
    
}
