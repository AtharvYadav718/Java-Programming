import java.awt.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(300,600);  //(W,H)
        fobj.setVisible(true);
    }
    
}
    
class GUI_02
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA49");   
    }
}
   