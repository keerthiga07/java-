/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author keert
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal obj=new animal("gaganame");
        System.out.println(obj);
        animal obj1;
        obj1 = new mamall("mamaml");
        System.out.println(obj1);
        cat ob2=new cat("cattty");
        System.out.println(ob2);
        ob2.display();
        dog ob3=new dog("doggy");
        System.out.println(ob3);
        ob3.wow();
        
        ob3.weow();
    }
    
}
class animal
{
    String name;
    animal(String aname)
    {
        name=aname;
    }
    @Override
    public String toString()
    {
        return name;
    }
        
}
class mamall extends animal
{
    String mamallname;
    mamall(String mname )
    {
        mamallname=mname;
    }
    @Override
    public String toString()
    {
        return mamallname ;
    }
        
    
}
class cat extends mamall
{
    String catn;
    cat(String cname )
    {
        catn=cname;
    }
    @Override
    public String toString()
    {
        return name+mamallname+catn ;
    }
    void display()
    {
        System.out.println("meow");
    }
    
}
class dog extends mamall
{
    String dogname;
    dog(String dname)
    {
        dogname=dname;
    }
    void wow()
    {
       System.out.println("woff");
    }
    void weow()
    {
        System.out.println("wooff");
    }
    @Override
     public String toString()
    {
        return  dogname;
    }
    
}