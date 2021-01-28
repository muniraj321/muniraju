import java.util.*;
class fibbo
{
	static int fibo(int n)
	{
		if(n==0 || n==1)
			return(0);
		else if(n==2)
			return(1);
		else
		return(fibo(n-1)+fibo(n-2));
	}
	public static void main(String[] args) 
	{
		System.out.println("enter a value");
		int i,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(fibo(i));
		}
	}
}