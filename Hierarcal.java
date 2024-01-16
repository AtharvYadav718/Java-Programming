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
class DerivedX extends Base
{
    int P,Q;
    public DerivedX()
    {
        System.out.println("DerivedX Constructor");
    }
}
class Hierarcal
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        DerivedX dobj2 = new DerivedX();
    }
}