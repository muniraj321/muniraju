class negexception extends Exception
{
	int a;
	negexception(int x)
	{
		a=x;
	}
	public String toString()
	{
		return "negative input"+a;
	}
}
class test
{
	static void meth(int a) throws negexception
	{
		if(a>0)
			System.out.println("positive input="+a);
		else
			throw new negexception(a);
	}
	public static void main(String[] args) 

	{
		try
		{
			meth(10);
			meth(-20);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}