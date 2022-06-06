
/**
 * Write a description of class Mountain_bikes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MountainBikes extends Bikes
{
    private double seatHeight;
    
    public MountainBikes(){
        super();
        seatHeight = 0.0;
    }
    
    public MountainBikes(int frameNumber, int gear, double speed, double seatHeight){
        super(frameNumber, gear, speed);
        this.seatHeight = seatHeight;
    }
    
    public void setSeatHeight(double seatHeight){
        this.seatHeight = seatHeight;
    }
    
    public double getSeatHeight(){
        return seatHeight;
    }
    
    public String toString(){
        return super.toString()+" "+ seatHeight;
    }
}
