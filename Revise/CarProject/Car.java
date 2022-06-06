
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Car
{
    private String model;
    private String make;
    private int id;

    public Car(){
        model= "";
        make = "";
        id=0;
    }

    public Car(String model, String make, int id){
        this.model = model;
        this.make = make;
        this.id = id;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getId(){
        return id;
    }
    
    public abstract void drive();
    
    public String toString(){
        return model+ " "+ make+" "+ id;
    }
}
