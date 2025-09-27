class MyThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread using Thread class: " + i);
            try 
            {
                Thread.sleep(500); 
            }
             catch (InterruptedException e) 
             {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable implements Runnable
 {
    public void run() 
    {
        for (int i = 1; i <= 5; i++)
         {
            System.out.println("Thread using Runnable interface: " + i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}


public class MultithreadingExample 
{
    public static void main(String[] args) 
    {
        
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.start();
    }
}

