
/**
 * Write a description of class Example2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example2
{
    public static void main(String args[]){
        int a = Add(8,5);
        int b = Add(8,5,4);
        int c = Add(8.3,9);
        int d = Add(4.1,42);
        System.out.println("A: "+a+" B: "+ b+ " C: "+c+" D: "+d);
    }

    public static int Add(int a, int b){
        return a + b;
    }

    public static int Add(int a, int b, int c){
        return a+b+c;
    }

    public static int Add(double a, int b){
        return (int)a+b;
    }

    public static int Add(int a, double b){
        return a+(int)b;
    }
}

class PolymorphismClass{
    int add(int a, int b){
        return a+b;
    }
}
