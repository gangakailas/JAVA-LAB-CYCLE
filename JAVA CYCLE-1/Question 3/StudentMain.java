/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Student;

/**
 *
 * @author ganga
 */
public class StudentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        s1.create();
        s1.findTotal();
        
        Student s2=new Student();
        s2.create();
        s2.findTotal();
     
        if(s1.getTotal()>s2.getTotal())
        {
            System.out.println("The Student with greater Total:");
            s1.getDetails();
        }
        else
        {
            System.out.println("The Student with greater Total:");
            s2.getDetails();
        }
        
    }
    
}
