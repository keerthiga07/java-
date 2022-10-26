/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9;

/**
 *
 * @author keert
 */
import java.io.*;
public class CBstream {
    public static void main(String[] args)throws IOException
    {
        try (FileReader sourceStream = new FileReader("C:\\Users\\source\\OneDrive\\Desktop\\IN.txt")) {
            int temp;
            while ((temp = sourceStream.read()) != -1)
            {
            System.out.println((char)temp);
            Thread.sleep(100);
            }
            System.out.print("Program successfully executed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("\nCharacter Stream Over\n===================================");
        }
        FileInputStream sourceStream1 = null;
        FileOutputStream targetStream1 = null;
        try {
            sourceStream1 = new FileInputStream("C:\\Users\\source\\OneDrive\\Desktop\\OUT.txt");
            targetStream1 = new FileOutputStream("C:\\Users\\source\\OneDrive\\Desktop\\target.txt");
            int temp;
            while ((temp = sourceStream1.read()) != -1)
                targetStream1.write((byte)temp);
          System.out.print("Program successfully executed");
        }
        finally {
            if (sourceStream1 != null)
                sourceStream1.close();
 
            if (targetStream1 != null)
                targetStream1.close();
            System.out.println("\nByte Stream Over\n===================================");
        }
    } 
}