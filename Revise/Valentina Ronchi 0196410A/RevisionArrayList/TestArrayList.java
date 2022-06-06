import java.util.*;
/**
 * Write a description of class TestArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestArrayList
{
    public static void main (String args[]){
        ArrayList arr = new ArrayList();
        arr.add(6);
        arr.add(34);
        arr.add(56);
        
        for(int x = 0; x<arr.size(); x++){
            System.out.println(arr.get(x));
        }
        
        // replace item a.set(pointer, item)
        arr.set(2,67);
        for(int x = 0; x<arr.size(); x++){
            System.out.println(arr.get(x));
        }
        //remove item
        arr.set(0,543);
        for(int x = 0; x<arr.size(); x++){
            System.out.println(arr.get(x));
        }
    }
}
