import java.util.*;
class area
{
	void circle(double radius)
	{
	System.out.println("Area of circle with radius  " +   radius  + " is " + Math.PI*radius*radius);
	}
	void square( double side )
	{
	System.out.println("Area of square with side  " +  side  + " is " + side*side);
	}
	void triangle( double base,double height )
	{
	System.out.println("Area of triangle with base " +  base + " and height " + height + " is " + 0.5*base*height);
	}
	
}
class lab5
{
	public static void main(String args[])
	{
		Double r,a,b,h;
		area ob=new area();
		Scanner s=new Scanner(System.in);
	

System.out.println("enter radius of circle");
r=s.nextDouble();
ob.circle(r);

System.out.println("enter side of square");
a=s.nextDouble();
ob.square(a);

System.out.println("enter base and height of triangle");
b=s.nextDouble();
h=s.nextDouble();
ob.triangle(b,h);
		

    }
}