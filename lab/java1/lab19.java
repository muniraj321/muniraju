class student
{
	int rno;
	String name;
	student(int r,String n)
	{
		rno=r; 
		name=n;

	}
	void disp()
	{
		System.out.println("rollno="+rno);
		System.out.println("name="+name);
	}
}
class marks extends student
{
	int t,m1,m2,m3;
	marks(int r,String n,int m1,int m2,int m3)
	{
		super(r,n);
		t=m1+m2+m3;
	}
	void disp()
	{
		super.disp();
		System.out.println("total="+t);
	}
}
class percent extends marks
{
	double p;
	percent(int r,String n,int m1,int m2,int m3)
	{
		super(r,n,m1,m2,m3);
		p=t/3;
	}
	void disp()
	{
		super.disp();
		System.out.println("percentage="+p);
	}
}
class multilevel
{
	public static void main(String[] args)
	 {
		percent str=new percent(123,"hari",56,39,92);
		str.disp();
	}
}