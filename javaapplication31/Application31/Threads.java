package Application31 ;
class temp implements Runnable 
{
 Thread Th;
 boolean suspend_flag, stop_flag;
 temp(String tN)
{
 Th=new Thread(this, tN);
 suspend_flag=false;
 stop_flag=false;
 Th.start();
}
 @Override
 public void run()
{
 try
{
  int j=1;
  while(++j<20)
{
 synchronized(this)
{
 while(suspend_flag)
{ wait();}
 if(stop_flag)
{ break;}
}
}
}
catch(InterruptedException IE)
{
 System.out.println("Thread Interrupted");
}
}
synchronized void my_suspend()
{
 suspend_flag=true;
}
synchronized void my_resume()
{
 suspend_flag=false;
 notify();
}
 synchronized void my_stop()
{
 suspend_flag=false;
 stop_flag=true;
 notify();
}
}
public class Threads
{
 public static void main(String args[])
{
 try
{
 temp t1=new temp("oops");
 System.out.println("Thread oops is Created and Started");
 Thread.sleep(1000);
 t1.my_suspend();
 System.out.println("Thread oops is Suspended");
 Thread.sleep(2000);
 temp t2=new temp("java");
 System.out.println("Thread java is Created and Started");
 Thread.sleep(1000);
 t2.my_suspend();
 System.out.println("Thread java is Suspended");
 Thread.sleep(1000);
 t1.my_resume();
 System.out.println("Thread oops is Resumed");
 Thread.sleep(2000);
 t2.my_resume();
 System.out.println("Thread java is Resumed");
 Thread.sleep(1000);
 t1.my_stop();
 System.out.println("Thread oops is Stopped");
 Thread.sleep(1000);
 t2.my_stop();
 System.out.println("Thread java is Stopped");
}
catch(InterruptedException IE)
{
 System.out.println("Generated interrupted exception");
}
}
}
