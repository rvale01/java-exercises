
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSortClass
{
    int [] a;
    
    public BubbleSortClass(){
        a = null;
       
    }
    
    public BubbleSortClass(int [] a){
        this.a = a;
        
    }
    
    
    
    public int [] getArray(){
        return a;
    }
       
    
    public void setArray(int []a){
        this.a = a;
    }
    
    
    
    public int[] BubbleSort(int [] a){
         int temp;
        
        for(int y = 0; y<a.length-1; y++){
            for(int x = 1; x<a.length;x++){
                if(a[x-1]>a[x]){
                    
                    temp = a[x-1];
                    a[x-1]= a[x];
                    a[x] = temp;
                }
            }
        }
        
        return a;
    } 
    
    
    public static String[] BubbleSorString(String [] str){
        String temp;                                    

        for (int j = 0; j < str.length; j++) {
         for (int i = j + 1; i < str.length; i++) {
            // comparing strings
            if (str[i].compareTo(str[j]) < 0) {
               temp = str[j];
               str[j] = str[i];
               str[i] = temp;
            }
         }
         System.out.println(str[j]);
      }


        return str;
    }
  }
