import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        
        System.out.print("Input the size of the Array: ");
        int size = scn.nextInt();
        int[] a = new int[size];
        
        BubbleSortClass bs = new BubbleSortClass(a);
        
        
        for(int y = 0; y<a.length; y++){
            System.out.println("Input the number: ");
            a[y] = scn.nextInt();
        }
        
        for(int y = 0; y<a.length; y++){
            System.out.print(a[y]+" ");
        }
        
        a = bs.BubbleSort(a);
        
        System.out.println("List after sorting: ");
        for(int y = 0; y<a.length; y++){
            System.out.print(a[y]+" ");
        }
        
         System.out.print("Input the sentence : ");
         String str = scn.next();
        
         String strArr[]=str.split("(?!^)");
         strArr = bs.BubbleSorString(strArr);
         
         
                 
        //String str2[] = { "s", "k", "r", "v", "n"};
        //str2 = BubbleSorString(str2);
        
    }
    
    
    // public static int[] BubbleSor(int [] a){
        // int temp;
        
        // for(int y = 0; y<a.length; y++){
            // for(int x = 1; x<a.length-1;x++){
                // if(a[x]<a[x-1]){
                    
                    // temp = a[x];
                    // a[x]= a[x-1];
                    // a[x-1] = temp;
                // }
            // }
        // }
        
        // return a;
        
    // }
    
    // public static String[] BubbleSorString(String [] str){
        
        
        // String temp;                                    

        // for (int j = 0; j < str.length; j++) {
         // for (int i = j + 1; i < str.length; i++) {
            // // comparing strings
            // if (str[i].compareTo(str[j]) < 0) {
               // temp = str[j];
               // str[j] = str[i];
               // str[i] = temp;
            // }
         // }
         // System.out.println(str[j]);
      // }


        // return str;
    // }
}
