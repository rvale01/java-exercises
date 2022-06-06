
/**
 * Write a description of class usingTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class usingTable
{
    public static void main(String args[]){
        tableClass t = new tableClass();
        t.hight = 1.23;
        t.length = 1.56;
        t.width = 0.54;
        t.material= "Plastic";
        t.productID = "TB542";
        t.weight= 2.70;
        t.surfaceArea= 3.4;
        t.colour= "Green";
        t.numlegs= 2;
        t.drawers= true;
        
        System.out.println("The colour of table n.1 is: "+t.colour);
        System.out.println("The product ID of table n.1 is: " +t.productID);
        System.out.println("The weight of table n.1 is: "+t.weight);
        System.out.println("The material of table n.1 is: "+t.material+"\n");
        
        tableClass t2 = new tableClass();
        t2.hight = 2.10;
        t2.length = 2.04;
        t2.width = 0.90;
        t2.colour= "Yellow";
        
        System.out.println("The colour of table n.2 is: "+t2.colour);
         System.out.println("The hight of table n.2 is: " +t2.hight);
        System.out.println("The width of table n.2 is: "+t2.width);
        System.out.println("The lenght of table n.2 is: "+t2.length);
    }
}
