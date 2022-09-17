/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5.java;

/**
 *
 * @author keert
 */
public class Ex5Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conversion obj=new conversion();
     conversion obj1=new conversion();
     obj1.milestokm();
     obj.mtokm();

    }
 public void mtokm()
 {
     int m=5;
      int km=5000;
     System.out.println("Meter to km is:"+m*1000);
     System.out.println("km to meter is:"+km/1000);
 }
 public void milestokm()
 {
     int miles=5;
     int km=50;
     System.out.println("Miles to km is:"+miles*1.609);
     System.out.println("km to miles is:"+km/1.609);
 }
}

    
   

