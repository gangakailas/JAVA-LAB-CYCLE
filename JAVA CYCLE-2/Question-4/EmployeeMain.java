/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ganga
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n=sc.nextInt();
        EmployeeList emplist=new EmployeeList(n);
        emplist.readList();
        emplist.dsort();
        System.out.println("The Employee details in descending order of Salary:");
        emplist.displayList();
        
    }
    
}
