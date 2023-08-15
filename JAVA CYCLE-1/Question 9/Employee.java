/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author ganga
 */
class Employee 
{
    protected String name;
    protected int code;
    protected double basicPay;
    
    public Employee(String nm, int c, double bp)
    {
        name=nm;
        code=c;
        basicPay=bp;
    }
    public void printInfo()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Code: "+code);
        System.out.println("Employee Basic Pay: "+basicPay);
    }
    
}
