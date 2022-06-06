/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SECPC106
 */
public class IncDec {

    /**
     * Using different increments
     * @param args
     */
    public static void main(String[] args) {
        int e = 8;
        System.out.println("First value: " + e);
        
        e++;
        System.out.println(e);
        
        e= e+1;
        System.out.println(e);
        
        System.out.println(++e);
        System.out.println(e++);
        
        
        //dec
        int y = 10; 
        System.out.println("Fist value: " + y);
        y--;
        System.out.println(y);
        
        y= y-1;
        System.out.println(y);
        
        System.out.println(--y);
        System.out.println(y--);



                
    }
    
}
