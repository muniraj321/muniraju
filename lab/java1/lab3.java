class Sorting
{
public static void main(String args[])
{
try
{
int n=args.length;
if(n==0)
throw new ArrayIndexOutOfBoundsException();
else
{
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=Integer.parseInt(args[i]);
System.out.println("Before sorting");
for(int i=0;i<n;i++)
System.out.println(" " +a[i]);
bubblesort(a,n);
System.out.println("\nAfter sorting");
System.out.println("Ascending order");
for(int i=0;i<n;i++)
System.out.print(" " +a[i]);
System.out.println("Descending order");
for(int i=n-1;i>=0;i--)
System.out.print(" " +a[i]);
}
}
catch(NumberFormatException e)
{
System.out.println("Enter only integers-Number Format Exception");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Enter few integers through command line - ArrayIndexOutOfBoundsException");
}
}
static void bubblesort(int arr[], int length)
{
int temp,i,j;
for(i=0;i<length-1;i++)
for(j=0;j<length-i-1;j++)
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
