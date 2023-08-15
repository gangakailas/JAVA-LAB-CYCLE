/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicArray;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ganga
 */
public class DynamicArray {
    private ArrayList<Integer> array;

    public DynamicArray()
    {
        this.array=new ArrayList<>();
    }
    public void printArray()
    {
        System.out.print("[");
        for (int i = 0; i < array.size(); ++i) {
            System.out.print(array.get(i));
            if (i < array.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public void add(int element)
    {
        array.add(element);
    }
    public void add(int element, int place)
    {
        if(place>=0 && place<array.size())
        {
            array.add(place, element);
        }
        else
        {
            System.out.println("Invalid index value, element being added to end");
            array.add(element);
        }
    }
    public void remove(int element)
    {
        if(array.contains(element))
        {
            array.remove(Integer.valueOf(element));
        }
        else
        {
            System.out.println("Element not found in the array");
        }
    }
    public int search(int element)
    {
        if(array.contains(element))
        {
            return (array.indexOf(element));
        }
        else
        {
            return -1;
        }
    }


}
