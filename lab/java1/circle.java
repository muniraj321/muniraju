package shape;
public class circle implements area
{
int r;
public circle(int a)
{
r=a;
}
public void getarea()
{
System.out.println("Area of circle with radius" +r +"is" +3.14*r*r);
}
}
