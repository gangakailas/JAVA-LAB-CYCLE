/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author ganga
 */
class SavingAccount extends Account
{
    public SavingAccount(String n, int a, double b)
    {
        super(n, a, b);
    }
    
    @Override
    public void withdraw(double w)
    {
        if(balance<1000)
        {
            System.out.println("Insufficient balance for withdrawal!");
        }
        else
        {
            if((balance-w)<1000)
            {
                System.out.println("Withdrawal declined as it will reduce balance to less than minimum");
            }
            else
            {
                balance=balance-w;
                System.out.println("You've successfully withdrawn amount "+w+" from the account");
                System.out.println("The currect balance: "+balance);
            }
        }
    }
    
}
