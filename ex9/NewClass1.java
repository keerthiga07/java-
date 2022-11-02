
package ex9;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class NewClass1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s[]=new String[10];
      int i;
      for(i=0;i<10;i++)
      {
          System.out.println("Enter Student"+(i+1)+"name:");
          s[i]=sc.next();
      }

    try {
      File myObj = new File("C:\\Users\\Dell\\Desktop\\New Text Document.txt");
      File myObj1 = new File("C:\\Users\\Dell\\Desktop\\abc.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } 
      else {
        System.out.println("File already exists.");
      }
      if (myObj1.createNewFile()) {
       System.out.println("File created: " + myObj1.getName());
      } 
      else {
       System.out.println("File already exists.");
      }
     FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Desktop\\New Text Document.txt");
     for(i=0;i<10;i++)
     {
      myWriter.write(s[i]+"\n");
     }
      myWriter.close();
      FileWriter myWriter1 = new FileWriter("C:\\Users\\Dell\\Desktop\\abc.txt");
      Scanner read=new Scanner(myObj);
      while(read.hasNextLine())
      {
          String data=read.nextLine();
          myWriter1.write(data.toLowerCase()+"\n");
      }
      read.close();
      myWriter1.close();

     System.out.println("Successfully wrote to the file.");
    } 
    catch (IOException e) {
     System.out.println("An error occurred.");
     e.printStackTrace();
   }
  }
}
