
package javaapplication31;
import java.io.*;
import java.util.Scanner;
class thrdask1 implements Runnable
{
    Thread th;
    String s1;
    thrdask1(String name,String path)
    {
        th=new Thread(this,name);
        s1=path;
        th.start();
    }
    @Override
    public void run()
    {
        try{
            File file = new File(s1);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
            String line;
            int wordCount = 0; 
            while ((line = bufferedReader.readLine()) != null) 
            {
                String words[] = line.split("\\s+");
                wordCount += words.length;
            } 
            System.out.println(th.getName()+":"+wordCount);
        }
        catch(IOException e){
            System.out.println(e);
        }
            
        }
    }

public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of file 1:");
        String n1=sc.next();
        System.out.println("Enter full path of text file 1 without Quotes:");
        String path1=sc.next();
        System.out.println("Enter name of file 2:");
        String n2=sc.next();
        System.out.println("Enter full path of text file 2 without Quotes:");
        String path2=sc.next();
        System.out.println("Enter name of file 3:");
        String n3=sc.next();
        System.out.println("Enter full path of text file 3 without Quotes:");
        String path3=sc.next();
        try{
        thrdask1 t1=new thrdask1(n1,path1);
        thrdask1 t2=new thrdask1(n2,path2);
        thrdask1 t3=new thrdask1(n3,path3);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
}
}