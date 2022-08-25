
package javaapplication1;

import static java.awt.Color.red;
import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle obj=new circle();
        circle obj1=new circle(1.0);
        
        
        obj.getarea();
        
    }
   
    
}
class circle
{
    double radius=1.0;
     String color= "red"; 
    
    circle(double radius)
    
    {
     
        System.out.println("radius--"+radius);
             
         
     }
    circle()
    {
       System.out.println("string"+color);
    }
    void getarea()
    {
        
        double area;
        area=3.14*radius*radius;
        System.out.println("ur area--"+area);
        
    }
            
}