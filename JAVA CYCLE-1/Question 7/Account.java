/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author ganga
 */
abstract public class Account {
    
    String name;
    int accNo;
    double balance;
    
    public Account(String name, int accNo, double balance)
    {
        this.name=name;
        this.accNo=accNo;
        this.balance=balance;
    }
    public void deposit(double x)
    {
        balance=balance+x;
        System.out.println("You've succesfully deposited an amount "+x+" to your account");
        System.out.println("The currect balance: "+balance);
    }
    
    abstract void withdraw(double w);
   
}
