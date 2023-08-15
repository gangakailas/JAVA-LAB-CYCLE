/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Account;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class AccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("**** WELCOME TO THE BANK SERVICE *****");
        System.out.println("Enter your name: ");
        String nm=sc.nextLine();
        
        SavingAccount ac1=new SavingAccount(nm, 1002654, 0.0);
        CurrentAccount ac2=new CurrentAccount(nm, 1002655, 0.0);
        
        char status='y';
        do {    
            
            System.out.println("Welcome customer!");
            System.out.println("1. Deposit amount to Savings Account");
            System.out.println("2. Withdraw amount from Savings Account");
            System.out.println("3. Deposit amount to Current Account");
            System.out.println("4. Withdraw amount from Current Account");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the amount to be deposited: ");
                    double dep=sc.nextDouble();
                    ac1.deposit(dep);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the amount to be withdrawn: ");
                    double w=sc.nextDouble();
                    ac1.withdraw(w);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the amount to be deposited: ");
                    double dep=sc.nextDouble();
                    ac2.deposit(dep);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the amount to be withdrawn: ");
                    double w=sc.nextDouble();
                    ac2.withdraw(w);
                    break;
                }
                case 5:
                {
                    System.out.println("You've opted to exit from the service");
                    break;
                }
                
               
            }
           
            System.out.println("Do you want to continue(y/n)");
            status=sc.next().charAt(0);
            
            
        } while (status=='y' || status=='Y');
    
        System.out.println("Thank You!");
        System.out.println("Exiting...");
        
        sc.close();
                
          
        
    }
    
}
