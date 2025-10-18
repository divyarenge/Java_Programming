
class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        try
        {
        for(i = 1; i <= 5; i++)
        {
            Thread.sleep(1000);                         //value is in mili seconds
            System.out.println("Inside run() method of: "+Thread.currentThread().getName());
        }
        }
        catch(InterruptedException iobj)
        {}
    }
}

class ThreadUserDefinedSynchronised
{
    public static void main(String A[])
    {
        
       
    }
}