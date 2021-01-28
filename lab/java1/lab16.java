import java.util.*;
class sumofdigits
{
	public static void main(String[] args) 
	{
		int num,sum=0,cp;
		System.out.println("enter an integer");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		cp=num;
		for(;num>0;num/=10)
			sum += (num%10);
		System.out.println("sum of digits of "+cp+" is:"+sum);
	}
}