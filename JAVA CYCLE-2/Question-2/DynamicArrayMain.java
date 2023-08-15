/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DynamicArray;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class DynamicArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        DynamicArray dArray=new DynamicArray();
        char status='y';
        
        do {    
            
            System.out.println("1. Print the array");
            System.out.println("2. Add element to the array");
            System.out.println("3. Add element at specific location");
            System.out.println("4. Remove element");
            System.out.println("5. Search for an element");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    dArray.printArray();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter value to be appended to the array: ");
                    int n1=sc.nextInt();
                    dArray.add(n1);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter value to be appended to the array: ");
                    int n2=sc.nextInt();
                    System.out.println("Enter the position to append the value: ");
                    int p=sc.nextInt();
                    dArray.add(n2, p);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the element to be removed: ");
                    int el1=sc.nextInt();
                    dArray.remove(el1);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the element to be searched: ");
                    int el2=sc.nextInt();
                    int result=dArray.search(el2);
                    if(result>=0)
                    {
                        System.out.println("Element was found at index "+result);
                    }
                    else
                    {
                        System.out.println("Element not found in the array!");
                    }
                    break;
                }
                
               
            }
           
            System.out.println("Do you want to continue(y/n)");
            status=sc.next().charAt(0);
            
            
        } while (status=='y' || status=='Y');
        
        
    
            
    }
    
}
