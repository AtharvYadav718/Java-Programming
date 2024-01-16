class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base Constructor");
    }
    public void fun()
    {
        System.out.println("Base fun");
    }
}

class Derived extends Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived Constructor");
    }
    public void Gun()
    {
        System.out.println("Derived Gun");
    }
}

class Single
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        dobj.fun();
        dobj.Gun();
    }
}