class newt implements Runnable
{
	int tm;
	String msg;
	Thread t;
	newt(String m,int x)
	{
		msg = m;
		t = new Thread(this,msg);
		tm = x;
		t.start();

	}
	public void run()
	{
		try
		{
			for(;;)
			{
				System.out.println(msg);
				Thread.sleep(tm);

			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class multithread
{
	public static void main(String[] args) 
	{
		new newt("good morning darling",1000);
		new newt("good evening darling",2000);
		new newt("good night darling",3000);
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}