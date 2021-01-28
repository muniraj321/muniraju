import java.util.*;
class lab2
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int m,n,f;
    System.out.println("Enter two integers limits");
    m=s.nextInt();
    n=s.nextInt();
    System.out.println("prime numbers:");
    for(int i=m;i<=n;i++)
    {
      f=0;
      for(int j=2;j<=i/2;j++)
      if (i%j==0)
{
f=1;
break;
}
if(f==0)
System.out.println(i);
}
}
}
