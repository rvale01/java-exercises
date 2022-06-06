import java.util.*;
/**
 * Write a description of class sortList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sortList
{
   public void sort(ArrayList list, int from, int to) {
    if (from < to) {
        int pivot = from;
        int left = from + 1;
        int right = to;
        Person p = (Person)list.get(pivot);
        int pivotValue = p.getId();
        
        Person l = (Person)list.get(left);
        Person r = (Person)list.get(right);
        while (left <= right) {
            // left <= to -> limit protection
            while (left <= to && pivotValue >= l.getId()) {
                left++;
            }
            // right > from -> limit protection
            while (right > from && pivotValue < r.getId()) {
                right--;
            }
            if (left < right) {
                Person temp = new Person();
                temp = (Person)list.get(right); 
                Person p4 = new Person();
                list.set(left,l); 
                list.set(right,r);
            }
        }
        Collections.swap(list, pivot, left - 1);
        sort(list, from, right - 1); // <-- pivot was wrong!
        sort(list, right + 1, to);   // <-- pivot was wrong!
    }
}
}
