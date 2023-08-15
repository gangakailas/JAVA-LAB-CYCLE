/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class Student {
    String name;
    int rollNo;
    int marks[]=new int[5];
    int total;
    
    public void create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name: ");
        name=sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo=sc.nextInt();
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter mark for subject "+(i+1));
            marks[i]=sc.nextInt();
        }
    }
    
    public void findTotal()
    {
        total=0;
        for(int i=0; i<5; i++)
        {
            total=total+marks[i];
        }
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        for(int i=0; i<5; i++)
        {
            System.out.println("Mark "+(i+1)+"="+marks[i]);
        }
        
    }
    
    
    
    
}
