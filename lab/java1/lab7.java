import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="stu" width=500 height=500>
</applet>
*/
public class stu extends Applet implements ActionListener
{
TextField t2,t3,t4,t5,t6,t7,tt,ta;
String s1,s2,s3;
Button tot,avg;
Panel p1,p2,p3;
public void init()
{
((Frame)this.getParent().getParent()).setTitle("Student Report");
s3=" ";
setBackground(Color.cyan);
tot=new Button("Total");
avg=new Button("Average");
p1=new Panel();
p1.setLayout(new GridLayout(7,7));
p1.add(new Label("Regno"));
p1.add(new TextField(5));
p1.add(new Label("Name"));
p1.add(new TextField(10));
p1.add(new Label("DCN"));
t2=new TextField(5);
p1.add(t2);
p1.add(new Label("SE"));
t3=new TextField(5);
p1.add(t3);
p1.add(new Label("CA"));
t4=new TextField(5);
p1.add(t4);
p1.add(new Label("JAVA"));
t5=new TextField(5);
p1.add(t5);
p1.add(new Label("MP"));
t6=new TextField(5);
p1.add(t6);
add(p1);
p2=new Panel();
p2.setLayout(new GridLayout(2,2));
p2.add(new Label("Total"));
tt=new TextField(10);
p2.add(tt);
p2.add(new Label("Average"));
ta=new TextField(10);
p2.add(ta);
add(p2);
Panel p3=new Panel();
p3.setLayout(new GridLayout(1,2));
p3.add(tot);
p3.add(avg);
add(p3);
tot.addActionListener(this);
avg.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)
{

int m3,m4,m5,m6,m7,t=0;
float a=0.0f;
m3=m4=m5=m6=m7=0;
try
{
m3=Integer.parseInt(t2.getText());
m4=Integer.parseInt(t3.getText());
m5=Integer.parseInt(t4.getText());
m6=Integer.parseInt(t5.getText());
m7=Integer.parseInt(t6.getText());
}
catch(Exception e)
{
showStatus(e.toString());
}
t=m3+m4+m5+m6+m7;
a=t/5;
s1=String.valueOf(t);
s2=String.valueOf(a);
s3=ae.getActionCommand();
if(s3.equals("Total"))
tt.setText(s1);
if(s3.equals("Average"))
ta.setText(s2);
repaint();
}
}
