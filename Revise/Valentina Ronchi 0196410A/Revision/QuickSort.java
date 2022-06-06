import java.util.*;
/**
 * Write a description of class QuickSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSort
{
    public int partition(ArrayList arr, int low, int high) 
    { 
        Person p = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p = (Person)arr.get(high);
        
        
        int pivot = p.getId();  
        int i = (low); // index of smaller element 
        p3 = (Person)arr.get(i);
        for (int j=low; j<high; j++) 
        { 
            p2 = (Person)arr.get(j);
            // If current element is smaller than the pivot 
            if (p.getId() < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                Person temp = new Person();
                temp = (Person)arr.get(i); 
                Person p4 = new Person();
                p4 =(Person)arr.get(j);
                arr.set(i,p4); 
                arr.set(j,temp);
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        Person temp = new Person();
        temp = (Person)arr.get(i+1);
        Person p4 = new Person();
        p4 =(Person)arr.get(high);
        arr.set(i+1,p4); 
        arr.set(high,temp);
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
   public  void sort(ArrayList arr, int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
        
    } 
}
