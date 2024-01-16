import java.sql.*;      //1

class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL ="jdbc:mysql://localhost:3306/PPA";
        String Username = "root";
        String Password = "root";
        String Query = "Select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);       //2

        Statement sobj = cobj.createStatement();        //3

        ResultSet robj = sobj.executeQuery(Query);      //4

        while(robj.next())      //5
        {
            System.out.println("RID : "+robj.getInt("rno"));
            System.out.println("Name : "+robj.getInt("name"));
            System.out.println("Address : "+robj.getInt("Address"));
            System.out.println("Marks : "+robj.getInt("marks"));

        }
    }
}