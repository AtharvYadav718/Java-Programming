class CommandLine_01
{
    public static void main(String arg[])
    {
        System.out.println("Number of command line argument are : "+arg.length);

        System.out.println("Command line are : ");

        for(int i = 0; i < arg.length; i++)
        {
            System.out.println(arg[i]);
        }
    }
}

//javac CommandLine.java
//java CommandLine 11 21 51