
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Animal
{
    int remainingLives;
    
    public Cat(){
        super();
        remainingLives= 0;
    }
    
    public Cat(String food, int nofLegs, String name, String colour, int remainingLives, int id){
        super(food, nofLegs,name,colour, id);
        this.remainingLives = remainingLives;
    }
    
    public void setRemaning(int remainingLives){
        this.remainingLives = remainingLives;
    }
    
    public int getRemaning(){
        return remainingLives;
    }
    
    public void makeSound(){
    }
    
    public String toString(){
        return remainingLives+ " "+ super.toString();
    }
}
