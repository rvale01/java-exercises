import java.util.*;
/**
 * Write a description of class Sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sort
{
    public void sortSale(ArrayList list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            Sale p = (Sale)list.get(pivot);
            int pivotValue = p.getId();

            Sale l = (Sale)list.get(left);
            Sale r = (Sale)list.get(right);
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
                    Sale temp = new Sale();
                    temp = (Sale)list.get(right); 
                    Sale p4 = new Sale();
                    list.set(left,l); 
                    list.set(right,r);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sortSale(list, from, right - 1); // <-- pivot was wrong!
            sortSale(list, right + 1, to);   // <-- pivot was wrong!
        }
    }

    public void sortRent(ArrayList list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            Rent p = (Rent)list.get(pivot);
            int pivotValue = p.getId();

            Rent l = (Rent)list.get(left);
            Rent r = (Rent)list.get(right);
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
                    Rent temp = new Rent();
                    temp = (Rent)list.get(right); 
                    Rent p4 = new Rent();
                    list.set(left,l); 
                    list.set(right,r);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sortRent(list, from, right - 1); // <-- pivot was wrong!
            sortRent(list, right + 1, to);   // <-- pivot was wrong!
        }
    }
    
    public void sortShortRent(ArrayList list, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            Rent p = (ShortRent)list.get(pivot);
            int pivotValue = p.getId();

            ShortRent l = (ShortRent)list.get(left);
            ShortRent r = (ShortRent)list.get(right);
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
                    ShortRent temp = new ShortRent();
                    temp = (ShortRent)list.get(right); 
                    ShortRent p4 = new ShortRent();
                    list.set(left,l); 
                    list.set(right,r);
                }
            }
            Collections.swap(list, pivot, left - 1);
            sortShortRent(list, from, right - 1); // <-- pivot was wrong!
            sortShortRent(list, right + 1, to);   // <-- pivot was wrong!
        }
    }
}
