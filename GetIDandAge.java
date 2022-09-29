import java.util.Scanner;
import java.lang.Exception;

public class GetIDandAge {
    public static void main(String args[]){
     int age=1;
 int id=1;
 while(age!=0 && id!=0)
       {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter age:");
        age=sc.nextInt();
       System.out.println("Enter id:");
       id=sc.nextInt();
       
        try{
            if( id<=999 && age<=119)
           
                System.out.println("valid data");
            else
                throw new Exception("Invalid data ");
        }
       
    catch(Exception GetIDandAge)
    {
        StackTraceElement[] stackTrace = GetIDandAge.getStackTrace();
        System.out.println(GetIDandAge);
        System.out.println(" InputMismatchException");
    }
     }
DataEntryException obj=new DataEntryException();
     
         DataEntryException.GetMessage();
    }

}

 class DataEntryException {
     public static void GetMessage(){
       try{
           throw new Exception("valid data ");
       }
       catch(Exception DataEntryException)
       {
     System.out.println("Zero is entered!!");}
     
     }
}1