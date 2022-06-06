import java.util.*;
/**
 * Write a description of class UsingAnimal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingAnimal
{
   public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
       Animal a = new Animal();
       a.setFood("cat Food");
       a.setNofLegs(6);
       Animal b = new Animal("Meat",4);
       Animal c = new Animal();
       
       System.out.println("Input the number of legs: ");
       int n = scn.nextInt();
       c.setNofLegs(n);
       
       System.out.println("Input the food: ");
       String f = scn.next();
       c.setFood(f);
       
       System.out.println("First animal: "+ a.getFood() +" "+ a.getNofLegs());
       System.out.println("Second animal: "+ b.getFood()+" "+ b.getNofLegs());
       System.out.println("Third animal: "+ c.getFood() +" "+ c.getNofLegs());
       
       //ArrayList
       ArrayList arr = new ArrayList();
       
       arr.add(a);
       arr.add(b);
       arr.add(c);
       
       for(int x = 0; x<arr.size(); x++){
           Animal s = new Animal();
            s= (Animal)arr.get(x);
            System.out.println("All animals n: "+(x+1)+ s.getFood() +" "+ s.getNofLegs());
        }
       
       //search
       
       System.out.print("Input the food you want to search: ");
       String value = scn.next();
        boolean bo = false;
       for(int x = 0; x<arr.size(); x++){
           Animal s = new Animal();
            s= (Animal)arr.get(x);
            if(value.equals(s.getFood())){
                System.out.print("Value found");
                System.out.print(s.getNofLegs());
                bo = true;
            }else{
                bo = false;
            }
            
        }
        if(bo == false){
                System.out.println("Value not found");
            }
            
            //sorting
            Animal s,t = new Animal();
            for(int x = 0; x<arr.size(); x++){
                for(int y = 1; y<(arr.size())-x; y++){
                     s= (Animal)arr.get(x);
                     t= (Animal)arr.get(y);
                    if(t.getNofLegs()<s.getNofLegs()){
                        int temp = t.getNofLegs();
                        t.setNofLegs(s.getNofLegs());
                        s.setNofLegs(temp);
                    }
                }
            }
            
           for(int x = 0; x<arr.size(); x++){
            Animal ani = new Animal();
            ani= (Animal)arr.get(x);
            System.out.println("All animals after sorting: "+ ani.getFood() +" "+ ani.getNofLegs());
        }
   }
}
