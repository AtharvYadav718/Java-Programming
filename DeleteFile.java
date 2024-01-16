import java.io.*;

class DeleteFile
{
    public static void main(String arg[]) throws Exception
    {
        try
        {
         File fobj = new File("PPA.txt");
         fobj.delete();
        }
        catch(Exception obj)
        {

        }    
    }
}