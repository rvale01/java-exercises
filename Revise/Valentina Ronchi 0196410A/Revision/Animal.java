import java.util.*;
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Animal
{
   private int nofLegs;
   private String food;
   private String name;
   private String colour;
   
   public void setNofLegs(int nofLegs){
       this.nofLegs = nofLegs;
   }
   
   public void setFood(String food){
       this.food = food;
   }
   
   public void setName(String name){
       this.name = name;
   }
   
   public void setColour(String colour){
       this.colour = colour;
   }
   
   public int getNofLegs (){
       return nofLegs;
   }
   
   public String getFood(){
       return food;
   }
   
   public String getColour (){
       return colour;
   }
   
   public String getName(){
       return name;
   }
   
   public Animal(){
       food="";
       nofLegs=0;
       colour="";
       name="";
 
   }
   
   public Animal(String food, int nofLegs, String name, String colour){
       this.food= food;
       this.nofLegs = nofLegs;
       this.colour = colour;
       this.name = name;
    }
    
   public abstract void makeSound();
}
