import java.sql.*;      //1

class Database_01
{
    public static void main(String arg[]) throws Exception
    {
       
        Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA","root","root");       //2

        Statement sobj = cobj.createStatement();        //3

        ResultSet robj = sobj.executeQuery("Select * from student");      //4

        while(robj.next())      //5
        {
            System.out.println("RID : "+robj.getInt("rno"));
            System.out.println("Name : "+robj.getInt("name"));
            System.out.println("Address : "+robj.getInt("Address"));
            System.out.println("Marks : "+robj.getInt("marks"));

        }
    }
}