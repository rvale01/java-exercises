
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    public String breed;
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public Dog(){
        super();
        breed = "";
    }
    
    public Dog(String food, int nofLegs, String name, String colour, String breed, int id){
        super(food, nofLegs,name,colour, id);
        this.breed = breed;
    }
    
    public void makeSound(){
        System.out.print("bark");
    }
    
    public String toString(){
        return breed+ " "+ super.toString();
    }
}
