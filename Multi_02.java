class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running...");
    }
}
class Multi_02
{
    public static void main(String arg[])
    {
        System.out.println("Inside main thread...");
        

        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1);
        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}