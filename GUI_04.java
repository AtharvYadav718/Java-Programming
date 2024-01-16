import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(300,600);  //(W,H)
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListener());
    }  
}

class MarvellousListener extends WindowAdapter
{
   
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    
}

class GUI_04
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA49");   
    }
}
   