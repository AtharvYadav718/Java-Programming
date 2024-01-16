class Demo extends Thread
{
    public void run()   //Running state
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current thread is :"+Thread.currentThread().getName());
        for(int i =1; i<1000; i++)
        {
            System.out.println("Name of thread is :"+name+" with counter :"+i);
        }
    }
}

class Multi_03
{
    public static void main(String arg[])
    {
        System.out.println("Current thread is :"+Thread.currentThread().getName());

        Demo obj1 = new Demo(); //New state
        Demo obj2 = new Demo(); //New state

        obj1.setName("First_Thread");
        obj2.setName("second_Thread");


        obj1.start();   //Runnable state
        obj2.start();   //Runnable state


    }
}