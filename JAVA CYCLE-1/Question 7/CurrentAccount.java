/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author ganga
 */
class CurrentAccount extends Account
{
    public CurrentAccount(String n, int a, double b)
    {
        super(n, a, b);
    }
    
    @Override
    public void withdraw(double w)
    {
        if(balance>w)
        {
            balance=balance-w;
            System.out.println("You've successfully withdrawn amount "+w+" from the account");
            System.out.println("The currect balance: "+balance);
        }
        else if(balance<w)
        {
            System.out.println("The payment denied due to lack of balance");
            System.out.println("Proceeding to withdrawal of overdraft amount");
            w=(0.05*balance);
            balance=balance-w;
            System.out.println("The currect balance: "+balance);
        }
    }
}
