
/**
 * Write a description of class Example1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example1
{
   public static void main(String [] args){
       Vehicle v = new Vehicle();
       v.run();
       
       Bike b = new Bike();
       b.run();
       
       Vehicle v2 = new Bike();
       v2.run();
    }
}

class Vehicle{
    void run(){
        System.out.println("The Vehicle is running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("The bike is running");
    }
}
