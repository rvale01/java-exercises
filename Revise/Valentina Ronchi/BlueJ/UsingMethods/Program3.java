import java.util.Scanner;
/**
 * Write a description of class Program3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * Create a program that fills an array with numbers, the use a method to display its content.
 */
public class Program3
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[5];
        int x;
        int search=0;
        char[] ch = new char[5];
        
        for (x= 0; x<arr.length;x++){
            arr[x] = (int)(Math.random()*(90-65)+65);
        }
        displayArray(arr);
        
        System.out.print("Search a number");
        search = scn.nextInt();
        
        searchArray(arr, search);
        
        convertArray(arr,ch);
        
        displayChar(ch);
    }
    
    public static void displayArray(int[] arr){
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+"\n");
        }
    }
    
    public static void searchArray(int[]arr, int search){
        Scanner scn = new Scanner(System.in);
        boolean b = false;
        
          for(int x = 0; x<arr.length;x++){
            if(search == arr[x]){
                b = true;
            } 
        }
        
        if(b == true){
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        
    }
    
    public static void convertArray(int[] arr, char[] ch){
        char c ;
        for(int x=0;x<5;x++){
           ch[x] = (char)arr[x];
           // System.out.println(arr[x]);
          // System.out.println(ch[x]);
          
        }             
  
    }
    
    public static void displayChar(char[] ch){
        for(int x=4;x>=0;x--){
       System.out.println(ch[x]);
    }
    }
}
