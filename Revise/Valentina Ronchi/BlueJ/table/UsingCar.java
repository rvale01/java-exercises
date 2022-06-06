
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * First: Door 5, bhp 90; brand VW, engine 1.4, ac Yes
 *Second: AC no; doors 3, bhp200; brand fiat, engine 2.0
 *Third: AC yes; doors 5 bhp 190, mercedes, engine 4.0
 *
 *hw. Create a class called computer with the following attributes 
 * double CPU, int RAM, int Hard disk size, String Hard disk type
 */
public class UsingCar
{
   public static void main(String args[]){ 
       Car c = new Car();
       
       c.setDoors(5);
       c.setBhp(90);
       c.setBrand("VW");
       c.setEngine(1.4);
       c.setAc(true);
       
       Car a = new Car();
       a.setDoors(3);
       a.setAc(false);
       a.setBrand("Fiat");
       a.setBhp(200);
       a.setEngine(2.0);
       
       Car b = new Car();
       b.setAc(true);
       b.setBhp(190);
       b.setBrand("Mercedes");
       b.setDoors(5);
       b.setEngine(4.0);
       
       System.out.print("This is the bhp of the first car" + c.getBhp());
       System.out.print("This is the n. of doors of the first car" + c.getDoors());
       System.out.print("This is the brand of the first car"+c.getBrand());
       System.out.print("This is the engne of the first cra"+ c.getEngine());
       System.out.print("");
       
    }
}
