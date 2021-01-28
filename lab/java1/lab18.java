import java.awt.*;
import java.applet.*;
/* <applet code="disp" width=500 height=500>
</applet> */

public class disp extends Applet
{
	String m;
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.red);
		m = "Inside init()";

	}
	public void start()
	{
		m += "Inside start()";
	}
	public void paint(Graphics g)
	{
		g.drawString(m,10,10);
		m += "Inside paint()";
		
	}
}