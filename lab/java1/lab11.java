import java.util.*;
class vector
{
	public static void main(String args[])
	{
	Vector v;
	int c,ch;
	String st;
	Scanner s = new Scanner(System.in);
	System.out.println("enter initial capacity");
	c = s.nextInt();
	v = new Vector();
	do
	{
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		System.out.println("4.exit");
		ch = s.nextInt();
		switch(ch)

		{
			case 1:
			System.out.println("enter element to push");
			st = s.next();
			v.addElement(st);
			System.out.println(st + "pushed into stsck of capacity " + v.capacity());
			break;

			case 2:
			if( v.size()!=0 )
			{
				System.out.println(v.lastElement() + " popped from stack of size " + v.size() );
				v.removeElementAt(v.size()-1);
			}
			else
				System.out.println("underflow");
			break;

			case 3:
			System.out.println("stack contents" + v);
			break;
		}

	}
	while(ch!=4);

	}
}