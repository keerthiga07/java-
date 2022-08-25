/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.Scanner;

/**
 *
 * @author test05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bill sc=new bill();
       sc.domestic();
       sc.com();
    }
    
}
class bill
{
 int cnumber;
 String cname;
 double preading;
 double creading;
 void domestic()
 {
   int unit=0;
   Scanner obj=new Scanner(System.in);
     System.out.println("enter ur units");
     unit=obj.nextInt();
   if(unit==100)
   {
       System.out.println("rs 1.5");
   }
   
       else if(unit<200 && unit>=100)
          {
            System.out.println("rs 3"); 
          }
       else if(unit<500 && unit>=200)
       {
           System.out.println(" rs 4.50");
       }
   else
       {
           System.out.println("rs 7");
       }
 }
 void com()
 {
     int unitc=0;
     Scanner obj=new Scanner(System.in);
     System.out.println("enter ur units");
     unitc=obj.nextInt();
     
     if(unitc==100)
     {
         System.out.println("rs2.5");
     }
     else if(unitc>=100 && unitc<200)
             {
                 System.out.println("rs 5");
             }
     else if(unitc>=200 && unitc<500)
     {
         System.out.println("rs 6.50");
     }
     else
     {
         System.out.println("rs9");
     }
         
 }
}



