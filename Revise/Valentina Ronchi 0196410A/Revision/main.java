import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        
        Dog d = new Dog();
        String name="";
        int legs=0;
        String breed ="";
        String colour="";
        String food = "";
        try{
            System.out.println("Input the name of the dog: ");
            name = scn.next();
        if(name.length()< 4){
           throw new Exception();
        }
        }catch(Exception e)
       {
        System.out.print("The length of the name has to be bigger!");
       }
       d.setName(name);
        
        
        
        try{
            System.out.println("Input the breed: ");
             breed = scn.next();
            if(breed.length()< 4){
           throw new Exception();
        }
        }catch(Exception e)
       {
        System.out.print("The length of the breed has to be bigger!");
       }
       d.setBreed(breed);
        
        
        try{
            System.out.println("Input the colour: ");
             colour = scn.next();
            if(colour.length()< 2){
           throw new Exception();
        }
        }catch(Exception e)
       {
        System.out.print("The length of the colour has to be bigger!");
       }
       d.setColour(colour);
        
       try{
            System.out.println("Input the food: ");
             food = scn.next();
            if(food.length()< 3){
           throw new Exception();
        }
        }catch(Exception e)
       {
        System.out.print("The length of the food has to be bigger!");
       }
       
       d.setFood(food);    
        
        
        try{
            System.out.print("Input the number of legs: ");
            legs = scn.nextInt();
            if(legs>4){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.print("The legs cannot be more than 4!");
        }
        
        d.setNofLegs(4);
    }
}
