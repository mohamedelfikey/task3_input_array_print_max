/*
 * Modify so that the user input the array from keyboard.
 * mohamed ahmed elsayed elfikey
 * id 1900306
 */
package lab2_task1_input_array_print_max;
import java.util.Scanner;


public class Lab2_task1_input_array_print_max {
   static Scanner input = new Scanner (System.in);
    

   
    public static void main(String[] args) {
        int size=0,max=0;
        System.out.println("please enter the size of array");
        size=input.nextInt();
         int [] array =new int [size];
        fill_array(array,size);
        max=find_max_number(array);
        System.out.println ("the max number in array is "+max);
        
        
        
        
    }
    public static void fill_array(int [] array,int size) // function to fil array from user
    {
        for (int i=0; i<size;i++)
        {
            System.out.println("please enter the number of index = "+i);
            array[i]=input.nextInt();
        }
    }
    public static int find_max_number(int [] array) // function to find the max number from array
    {
        int max=array[0];
        for (int i=0; i<array.length;i++)
        {
            if (max<array[i])
            {
                 max=array[i];
            }
        }
        return max;
    }
    
    
}
