import java.io.*;

class CreatFile
{
    public static void main(String arg[]) throws Exception
    {
        try
        {
            File fobj = new File("PPA.txt");
            fobj.createNewFile();
        }
        catch(Exception obj)
        {

        }    

    }
}