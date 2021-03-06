
/**
 * Write a description of class RacerBikes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RacerBikes extends Bikes
{
   private double handleHeight ;
   
   public RacerBikes(){
       super();
       handleHeight = 0.0;
    }
    
    public RacerBikes(int frameNumber, int gear, double speed, double handleHeight){
        super(frameNumber, gear, speed);
        this.handleHeight = handleHeight;
    }
    
    public void setHandleHeight(double handleHeight){
        this.handleHeight = handleHeight;
    }
    
    public double getHandleheight(){
        return handleHeight;
    }
    
    public String toString(){
        return super.toString()+" "+ handleHeight;
    }
}
