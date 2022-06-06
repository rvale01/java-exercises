import java.util.*;
/**
 * Write a description of class Example1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * create a program that uses an ArrayList of type String to store car names
 * methids: add, add at specific pos, replace a value, remove a value using index and value, size of ArrayList, 
 * find the position of a value and the clear method.
 */
public class Example1
{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        ArrayList <String> cars= new  <String> ArrayList();
        boolean b = true;
        do{
            System.out.println("1.Add value");
            System.out.println("2.Add at a specif index");
            System.out.println("3.Replace a value");
            System.out.println("4.Remove a value using index");
            System.out.println("5.Remove a value with another value");
            System.out.println("6.Get the size of the ArrayList");
            System.out.println("7.Find the pos of a value");
            System.out.println("8.Clear");
            System.out.println("9.Display list");
            System.out.println("10.Get a particular item");
            System.out.println("11.Sort item");
            System.out.println("12.Exit");
            int option = scn.nextInt();
            
            switch(option){
                case 1:cars = add(cars);break;
                case 2:cars = addAtIndex(cars);break;
                case 3:cars = replace(cars);break;
                case 4:cars = remove(cars);break;
                case 5:cars = removeIndex(cars);break;
                case 6:size(cars);break;
                case 7:index(cars);break;
                case 8:cars.clear();break;
                case 9:display(cars);break;
                case 10:partItem(cars);break;
                case 11:cars = sort(cars);
                case 12:b = false;break;
            }
        }while(b == true);

        //add
        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Land Rover");

        // //add at a specific value
        // cars.add(1, "Mercedes");
        // System.out.println(cars);

        // //replace a value
        // cars.set(2, "Ferrari");
        // System.out.println(cars);

        // //remove at a specif index
        // cars.remove(0);
        // System.out.println(cars);

        // //remove using value
        // cars.remove("Land Rover");
        // System.out.println(cars);

        // //size of arrayList
        // System.out.println(cars.size());

        // //position of a value
        // System.out.println(cars.indexOf("Ferrari"));

        // //clear
        // cars.clear();
        // System.out.println(cars);
    }

    public static ArrayList<String> add(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value you want to add: ");        
        cars.add(scn.next());
        return cars;
    }

    public static ArrayList<String> addAtIndex(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the index at where you want to add the value: ");
        int index = scn.nextInt();

        System.out.println("Input the value you want to add: ");
        String value = scn.next();

        cars.add(index, value);

        return cars;
    }

    public static ArrayList<String> replace(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value you want to add");
        String value = scn.next();

        System.out.println("Input the index you want to replace");
        int index = scn.nextInt();

        cars.set(index,value);
        return cars;
    }

    public static ArrayList<String> remove(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value you want to remove");
        String value = scn.next();

        cars.remove(value);
        return cars;
    }

    public static ArrayList<String> removeIndex(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the index of the value you want to remove");
        int index = scn.nextInt();

        cars.remove(index);
        return cars;
    }

    public static void size(ArrayList<String> cars){

        System.out.println("The size of the arry is "+ cars.size());

    }

    public static void index(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value you are looking for");
        String value = scn.next();

        if(cars.indexOf(value)==-1){
            System.out.println("Value not found");
        }else{
            System.out.println("The index of the item is : " + cars.indexOf(value));
        }

    }

    public static void partItem(ArrayList<String> cars){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the index of the value you are looking for");
        int value = scn.nextInt();

        System.out.println("The value is : "+ cars.get(value));
    }
    
    public static ArrayList<String> sort(ArrayList<String> cars){
        Collections.sort(cars);
        for(String st: cars){
            System.out.println(st);
        }
        return cars;
    }

    public static void display(ArrayList<String> cars){
        if(cars == null){
            System.out.println("The lis is empty");
        }else{
            for( String str: cars){
                System.out.println(str);
            }
        }

    }
}
