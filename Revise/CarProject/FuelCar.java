
/**
 * Write a description of class FuelCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FuelCar extends Car
{
    private int fuelLevel;
    
    public FuelCar(){
        super();
        fuelLevel = 0;
    }
    
    public FuelCar(String model, String make, int id, int fuelLevel){
        super(model,make,id);
        this.fuelLevel = fuelLevel;
    }
    
    public void setFuelLevel(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }
    
    public int getFuelLevel(){
        return fuelLevel;
    }
    
    public void drive(){
        System.out.println("It is driving");
    }

    public void fillFuel(){
        System.out.println("You need to fill the fuel");
    }
    
    public String toString(){
        return super.toString()+" "+ Integer.toString(fuelLevel);
    }

}
