
/**
 * Write a description of class ElectricCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricCar extends Car
{   

    private int batteryLevel;

    public ElectricCar(){
        super();
        batteryLevel = 0;
    }

    public ElectricCar(String model, String make, int id, int batteryLevel){
        super(model,make,id);
        this.batteryLevel = batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void drive(){
        System.out.println("It is driving");
    }

    public void charge(){
        System.out.println("You need to charge it!");
    }
    
    public String toString(){
        return super.toString()+" "+ Integer.toString(batteryLevel);
    }

}
