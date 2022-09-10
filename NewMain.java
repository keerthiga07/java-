package newpackage2;
public class NewMain {
    public static void main(String[] args) {
        MyQueue obj=new MyQueue(4);
        
   
        System.out.println("Initial Queue:");
        obj.Display();  
        obj.Insert(10); 
        obj.Insert(30); 
        obj.Insert(50); 
        obj.Insert(70); 
        System.out.println("Queue after Enqueue Operation:");
        obj.Display(); 
        obj.Front();
        obj.Insert(90);
        obj.Display();
        obj.Remove();
        obj.Remove();
        System.out.printf("\nQueue after two dequeue operations:"); 
        obj.Display();
        obj.Front();
    
    }
    
}
interface QueueOperations
{
    void Insert(int a);
    void Remove();
    void Display();
    void Front();
}
class MyQueue implements QueueOperations
{
   private static int front, rear, capacity; 
    private static int queue[]; 
   
    MyQueue(int size) 
    { 
        front = rear = 0; 
        capacity = size; 
        queue = new int[capacity]; 
    }
   @Override
    public void Insert(int item)  { 
        if (capacity == rear) 
        { 
            System.out.printf("\nQueue is full\n"); 
        } 
        else 
        { 
            queue[rear] = item; 
            rear++; 
        } 
    } 
            @Override
    public void Remove()  
    { 
        if (front == rear) 
        { 
            System.out.printf("\nQueue is empty\n"); 
        }  
        else 
        { 
            for (int i = 0; i < rear - 1; i++)
            { 
                queue[i] = queue[i + 1]; 
            }
            if (rear < capacity) 
                queue[rear] = 0; 
            rear--; 
        } 
    } 
   @Override
    public void Display() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
        for (i = front; i < rear; i++) { 
            System.out.printf("--%d--", queue[i]); 
        } 
    } 
   @Override
    public void Front() 
    { 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element of the queue: %d", queue[front]); 
    } 
}
