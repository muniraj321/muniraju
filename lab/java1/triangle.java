package shape;
public class triangle implements area
{
int l,b;
public triangle(int x, int y)
{
l=x;
b=y;
}
public void getarea()
{
System.out.println("Area of triangle" +l*b);
}
}