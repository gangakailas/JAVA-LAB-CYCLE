/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;
import java.io.*;
import java.util.*;
/**
 *
 * @author ganga
 */
class Employee {
    
    private int empID;
    private String empName;
    private DateOfBirth dob;
    private DateOfJoining doj;
    private double salary;
    
   /* public Employee(int empID, String empName, DateOfBirth dob, DateOfJoining doj, double salary)
    {
        this.empID=empID;
        this.empName=empName;
        this.dob=dob;
        this.doj=doj;
        this.salary=salary;
    }*/
    public void read() throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        empID=sc.nextInt();
        System.out.println("Enter the Employee Name: ");
        empName=sc.next();
        System.out.println("Enter the Employee Salary: ");
        salary=sc.nextDouble();
      
    }
    @Override
    public String toString()
    {
        return "Employee ID: "+empID+" Employee Name: "+empName+" Date Of Birth: "+dob+" Date Of Joining: "+doj+" Salary: "+salary;
    }
    public double getSalary()
    {
        return salary;
    }
    static class DateOfBirth
    {
        private int dd;
        private int mm;
        private int yyyy;
        
        /*public DateOfBirth(int d, int m, int y)
        {
            dd=d;
            mm=m;
            yyyy=y;
        }*/
        public void read() throws IOException
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Date of Birth");
            System.out.println("Enter date: ");
            dd=sc.nextInt();
            System.out.println("Enter month: ");
            mm=sc.nextInt();
            System.out.println("Enter year: ");
            yyyy=sc.nextInt();
        }
        @Override
        public String toString()
        {
            return dd+"/"+mm+"/"+yyyy;
        } 
    }
    static class DateOfJoining
    {
        private int dd;
        private int mm;
        private int yyyy;
        /*public DateOfJoining(int d, int m, int y)
        {
            dd=d;
            mm=m;
            yyyy=y;
        }*/
        public void read() throws IOException
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Date of Joining");
            System.out.println("Enter date: ");
            dd=sc.nextInt();
            System.out.println("Enter month: ");
            mm=sc.nextInt();
            System.out.println("Enter year: ");
            yyyy=sc.nextInt();
        }
        @Override
        public String toString()
        {
            return dd+"/"+mm+"/"+yyyy;
        }
    }
    public void setDob(DateOfBirth obj){
        dob=obj;
    }
    public void setDoj(DateOfJoining obj1){
        doj=obj1;
    }
    
    
}

class EmployeeList
{
    int count;
    Employee[] employees;
    
    public EmployeeList(int c)
    {
        count=c;
        employees=new Employee[c];
    }
    public void readList()throws IOException{
        for(int i=0; i<count; i++)
        {
            Employee.DateOfBirth obj= new Employee.DateOfBirth();
            Employee.DateOfJoining obj1= new Employee.DateOfJoining();
            
            employees[i]=new Employee();
            employees[i].read();
            obj.read();
            obj1.read();
            employees[i].setDob(obj);
            employees[i].setDoj(obj1);
            System.out.println(employees[i].toString());
        }
    }
    public void dsort()
    {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    // Swap employees[j] and employees[j + 1]
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        /*for(int i=count-1; i>=0; i++)
        {
            Employee emp=employees[i];
            int k=i+1;
            while(k<count && emp.getSalary()>employees[k].getSalary())
            {
                employees[k-1]=employees[k];
                k++;
            }
            employees[k-1]=emp;
        }*/
    }
    public void displayList()
    {
        for(int i=0; i<count; i++)
        {
            System.out.println(employees[i].toString());
        }
    }
}
