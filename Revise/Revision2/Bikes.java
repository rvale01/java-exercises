
/**
 * Write a description of class bikes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bikes
{
    private int frameNumber;
    private int gear;
    private double speed;
    
    public Bikes(){
        frameNumber = 0;
        gear = 0;
        speed = 0.0;
    }
    
    public Bikes(int frameNumber, int gear, double speed){
        this.frameNumber = frameNumber;
        this.gear = gear;
        this.speed = speed;
    }
    
    public void setFrameNumber(int frameNumber){
        this.frameNumber = frameNumber;
    }
    
    public void setGear(int gear){
        this.gear = gear;
    }
    
    public void setSpeed(double speed){
        this.speed = speed;
    }
    
    public double getSpeed(){
        return speed;
    }
    
    public int getGear(){
        return gear;
    }
    
    public int getFrameNumber(){
        return frameNumber;
    }
    
    public String toString(){
        return gear+ " "+ frameNumber;
    }
    
    public void applyBrake(int decrement){
        speed = speed - decrement;
    }
    
    public void speedUp (int increment){
        speed = speed + increment;
    }
}
