import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponce res) throws ServletException,IOException
    {
        res.setContentType("text/html"); //Setting the content type
        PrintWriter pw=res.getWriter(); //get the stream to write the data

        //Writing html in the stream
        pw.println("<html><body>");
        pw.println("JAy Ganesh...");
        pw.println("</body></html>");

        pw.close(); //Closing the stream
    }
}