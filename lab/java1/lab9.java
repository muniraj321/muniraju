import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="lab9" width=300 height=400>
</applet>
*/
public class lab9 extends Applet implements KeyListener, MouseListener, MouseMotionListener
{
int x=20,y=30;
String msg=" ";
public void init()
{
addKeyListener(this);
addMouseListener(this);
addMouseMotionListener(this);
}
public void keyPressed(KeyEvent k)
{
showStatus("Key Down");
int key=k.getKeyCode();
msg+=key;
repaint();
}
public void keyReleased(KeyEvent k)
{
showStatus("Key up");
}
public void keyTyped(KeyEvent k)
{
msg+=k.getKeyChar();
repaint();
}
public void mousePressed(MouseEvent me)
{
msg="Mouse Pressed";
repaint();
}
public void mouseClicked(MouseEvent me)
{
msg="Mouse Clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
msg="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
msg="Mouse Exited";
repaint();
}
public void mouseReleased(MouseEvent me)
{
msg="Mouse Released";
repaint();
}
public void mouseMoved(MouseEvent me)
{
msg="Mouse Moved";
repaint();
}
public void mouseDragged(MouseEvent me)
{
msg="Mouse Dragged";
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,x,y);
}
}
