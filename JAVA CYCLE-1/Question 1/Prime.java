/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prime;

/**
 *
 * @author ganga
 */
public class Prime {

    public static boolean isPrime(int no)
    {
        for(int i=2; i<=(no/2); i++)
        {
            if(no%i==0)
            {
                return false;
            }
            
        }
        return true;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length==0)
        {
            System.out.println("The array is empty");
            return;
        }
        int n=Integer.parseInt(args[0]);
        int no=2;
        int count=0;
        
        while(count<n)
        {
            if(isPrime(no))
            {
                System.out.print(no+" ");
                count++;
            }
            
            no++;
        }
          
        
    } 
    
}
