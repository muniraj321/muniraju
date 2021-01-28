import java.util.*;
class student
{
	int rno,m1,m2;
	student(int r,int a, int b)
	{
		rno = r;
		m1 = a;
		m2 = b;

	}
}
	interface sports
	{
		int sm = 10;

	}
	class test extends student implements sports
	{
		int t,sp;
		test(int rno,int m1,int m2,int sp)
		{
			super(rno,m1,m2);
			if(sp == 1)
				t = m1+m2+sm;
			else
				t = m1+m2;
		}
		void report()
		{
			System.out.println("rno"+rno);
			System.out.println("total:"+t);
		}
	}
	class multiple
	{
		public static void main(String args[])
		{
			test ob1 = new test(1,55,65,1);
			test ob2 = new test(2,60,70,6);
			ob1.report();
			ob2.report();
		}
		
	}
