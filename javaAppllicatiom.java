

public class javaAppllicatiom {
    public static void main(String[] args)
    {
        a1 obj=new a1(100,90,80) ;
    obj.perc();
    b1 obj1=new b1(100,90,80,70) ;
    obj1.perc1();
    }
}
abstract class marks1 {
    int perc; 
}
class a1 extends marks1 { 
    int m1,m2,m3;
    a1(int m1,int m2,int m3) 
    {
        this.m1=m1; 
        this.m2=m2; 
        this.m3=m3;
    }
    public void perc()
    {
        int per1;
        per1=(m1+m2+m3)/3; 
System.out.println("percentage:"+per1);
} 
}
class b1 extends marks1 { 
    int m1,m2,m3,m4;
    b1(int m1,int m2,int m3,int m4) 
    {
        this.m1=m1; 
        this.m2=m2; 
        this.m3=m3;
        this.m4=m4;
    }
    public void perc1()
    {
        int per2;
        per2=(m1+m2+m3+m4)/4; 
System.out.println("percentage:"+per2);
} 
}