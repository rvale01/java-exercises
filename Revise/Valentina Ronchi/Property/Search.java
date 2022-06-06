import java.util.*;
/**
 * Write a description of class Search here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Search
{
    //create two methods by id and by type. when the search is by id return the position of the item found else return -1. 
    //the second method is search by type. it will return a list of properties atching the type. 

    public int searchIdSale(ArrayList arr, int value){
        int pos = -1; 
        Sale s = new Sale();
        Rent r = new Rent();
        ShortRent sr = new ShortRent();
        for(int x = 0; x<arr.size(); x++){
            if(arr.get(x) instanceof Sale){
                s = (Sale)arr.get(x);
                if(s.getId() == value){
                    pos = x;
                }

            }else if(arr.get(x) instanceof Rent){
                r=(Rent)arr.get(x);
                if(r.getId() == value){
                    pos = x;
                }
            }else if(arr.get(x) instanceof ShortRent){
                sr=(ShortRent)arr.get(x);
                if(r.getId() == value){
                    pos = x;
                }
            }
        }

        return pos;
    }

    public ArrayList searchByType(ArrayList arr, String type){
        ArrayList found = new ArrayList();
        Sale s= new Sale();
        Rent r = new Rent();
        ShortRent sr = new ShortRent();

        for(int x = 0; x<arr.size(); x++){
            if(arr.get(x) instanceof Sale){
                s = (Sale)arr.get(x);
                if(s.getType().equalsIgnoreCase(type)){
                    found.add(s);
                }
            }else if(arr.get(x) instanceof Rent){
                r = (Rent)arr.get(x);
                if(r.getType().equalsIgnoreCase(type)){
                    found.add(r);
                }
            }else if(arr.get(x) instanceof ShortRent){
                sr = (ShortRent)arr.get(x);
                if(s.getType().equalsIgnoreCase(type)){
                    found.add(sr);
                }
            }
        }

        return found;
    }

}
