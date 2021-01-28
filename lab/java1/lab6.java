import java.util.*;
class box
{
	int l,b,h;
	box()
	{
	l=b=h=2;
	System.out.println("intialised with default constructor");
	}

	box(int x,int y,int z)
	{
	l=x;
	b=y;
	h=z;
	System.out.println("intialised with parameterised constructor");
	}

	box(box ob)
	{
	l=ob.l;
	b=ob.b;
	h=ob.h;
	System.out.println("intialised with copy constructor");
	}

	

	int getvolume()
	{
	return l*b*h;
	}
}
class lab6
{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int ch,l,b,h;
	box ob1,ob2,ob3;
	do
	{
	System.out.println("1.default constructor");
	System.out.println("3.copy constructor");
	System.out.println("2.parameterised constructor");
	System.out.println("4.exit");
	System.out.println("enter your choice");
	ch=s.nextInt();
	switch(ch)
	     {
	     	case 1 :
	     		ob1=new box();
	     		System.out.println("volume= " + ob1.getvolume());
	     		break;

		case 2 :
	     		System.out.println("enter l,b,h for parameterised constructor");
	     		l=s.nextInt();
	     		b=s.nextInt();
	     		h=s.nextInt();
	     		ob2=new box(l,b,h);
	     		System.out.println("volume= " + ob2.getvolume());
			break;

	     	case 3 :
	     		System.out.println("enter l,b,h for copy constructor");
			ob2=new box();
	     		ob2.l=s.nextInt();
	     		ob2.b=s.nextInt();
	     		ob2.h=s.nextInt();
	     		ob3=new box(ob2);
	     		System.out.println("volume= " + ob3.getvolume());
	     		break;
	     	

	     }
	  }
	  while(ch!=4);
	}
}

