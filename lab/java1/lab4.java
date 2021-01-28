import java.util.*;
class string
{
	public static void main(String args[])
	{
	 Scanner inp = new Scanner(System.in);
	 System.out.println("enter 2 strings");
	 String s1=inp.next();
	 String s2=inp.next();
	 System.out.println("the strinng are  "+ s1 + "  and" + s2);
	 int len1 = s1.length();
	 int len2 = s2.length();
	 System.out.println("the length of  "+ s1 + " is:" + len1);
	 System.out.println("the length of "+ s2 + " is:" + len2);

	 System.out.println("the concatenation of two strings : "+ s1.concat(s2));
	 System.out.println("first character of : " + s1 + " :" + s1.charAt(0));

	 System.out.println("the uppercase of : " + s1 + " :" + s1.toUpperCase());

	 System.out.println("the lowercase of : " + s2 + " :" + s2.toLowerCase());

	 int i = s1.indexOf("e");
	 if(i!=-1)
	 System.out.println("the letter e occurs at position " + i + " in " + s1);
	 else
	  System.out.println("the letter e is not found in " + s1);

	  System.out.println("substring of  " + s1 + " stsrting from index 2 and ending at 4 " + s1.substring(2,4));
	  if(i!=-1)
	  System.out.println("replacing 'e with ' o' in  " + s1 + " :" + s1.replace('e','o'));
	  else
	  System.out.println("the letter e not found in  " + s1 + "  to replace with letter o" );

	  boolean check = s1.equals(s2);
	  if(check==false)
	  System.out.println("" + s1 + " and " + s2 + " are not same");
	  else
	  System.out.println("" + s1 + " and " + s2 + " are same");
	}
}