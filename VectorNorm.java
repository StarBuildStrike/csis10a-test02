
/**
 * Write a description of class VectorNorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VectorNorm
{
    public static void main (String [] args) {
        System.out.println("\f");

        double x = 2;
        double y = 3;
        double z = 4;
         
        
       double n =  norm (x,y,z);
       System.out.println ("The Magnitude is " + n);
    }

    public static double norm (double x, double y, double z) {
        double v = Math.sqrt(Math.pow (x,2)+ Math.pow(y,2) + Math.pow (z,2));  
        return v; 
    }

}
