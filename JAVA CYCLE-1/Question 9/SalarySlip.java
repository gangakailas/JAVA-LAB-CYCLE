/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author ganga
 */
public class SalarySlip extends Employee implements Salary 
{
    double netSal;
    double deduction;
    
    public SalarySlip(String nm, int c, double bp, double ded)
    {
        super(nm, c, bp);
        netSal=0.0;
        deduction=ded;
    }
    
    @Override
    public void salaryCalc()
    {
        netSal=basicPay-deduction;
        System.out.println(netSal);
    }
    
    public void printSlip()
    {
        System.out.println("Employee Salary: "+netSal);
    }
}
