package newpackage;
import java.util.*;


public class JavaApplication1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={1,6,5,9,0};
        sample s=new sample();
        s.min(num);
       
                                                                                                               
    }
   
}
class sample{
    < T extends Comparable<T>> void min(T[]y)
    {
        T min;
        min=y[0];
        for(int i=1;i<y.length;i++ )
        {
         if(min.compareTo(y[i])>0){
         
             
         
             min=y[i];
         }
         
        }
        System.out.println(min);
   
   
    }
}

