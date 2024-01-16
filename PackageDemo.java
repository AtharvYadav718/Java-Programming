import Marvellous.Maths;
import Marvellous.Infosystems.Arithmetic;

class PackageDemo
{
    public static void main(String arg[])
    {
        Maths mobj = new Maths();
        Arithmetic aobj = new Arithmetic();

        int iRet = 0;
        iRet = mobj.Addition(10,11);
        System.out.println("Addition is : "+iRet);
        iRet = aobj.Substraction(11,10);
        System.out.println("Substraction is : "+iRet);

    }
}

//javac PackageDemo.java
//java PackageDemo