class lab1
{
  public static void main(String args[])
  {
    int num[]=new int[10];
    int i,j,fact=1;
    if (args.length==0)
    {
      System.out.println("Give arguments to find factorial");
      return;
    }
    for(i=0;i<args.length;i++)
    num[i]=Integer.parseInt(args[i]);
    for(i=0;i<args.length;i++)
    {
      fact=1;
      for(j=1;j<=num[i];j++)
      fact=fact*j;
      System.out.println("Factorial of" +num[i] +"is" +fact);
    }
  }
}