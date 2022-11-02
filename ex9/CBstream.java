
package ex9;
  import java.io.*;



   
public class CBstream {
    public static void main(String[] args)throws IOException
    {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:\\Users\\Dell\\Desktop\\abc.txt");
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
            if (sourceStream != null)
                sourceStream.close();
            System.out.println("\nCharacter Stream Over\n===================================");
        }
        FileInputStream sourceStream1 = null;
        FileOutputStream targetStream1 = null;
        try {
            sourceStream1 = new FileInputStream("C:\\Users\\Dell\\Desktop\\abc.txt");
            targetStream1 = new FileOutputStream("C:\\Users\\Dell\\Desktop\\abc.txt");
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
  
    

