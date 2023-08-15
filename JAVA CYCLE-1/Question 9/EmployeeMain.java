/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String nm=sc.nextLine();
        System.out.println("Enter Employee Code");
        int c=sc.nextInt();
        System.out.println("Enter Employee Basic Pay");
        double bp=sc.nextDouble();
        System.out.println("Enter Deduction percentage");
        int d=sc.nextInt();
        double ded=(d*bp)/100;
        
        SalarySlip s=new SalarySlip(nm, c, bp, ded);
        s.salaryCalc();
        s.printInfo();
        s.printSlip();
        
    }
    
}
