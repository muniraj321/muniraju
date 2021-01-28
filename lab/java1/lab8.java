abstract class Department
{
	double salary ,bonus, totalsalary;
	public abstract void calBonus(double salary);

	public void display(String dept)
	{
	 System.out.println(dept + "\t" + salary + "\t\t" + bonus + "\t" + totalsalary);
	}
}
class accounts extends Department
{
	public void calBonus(double sal)
	{
	  salary = sal;
	  bonus = sal * 0.2;
	  totalsalary = salary + bonus;
	}
}


class sales extends Department
{
	public void calBonus(double sal)
	{
	  salary = sal;
	  bonus = sal * 0.3;
	  totalsalary = salary + bonus;
	}
}


class marketing extends Department
{
	public void calBonus(double sal)
	{
	  salary = sal;
	  bonus = sal * 0.30;
	  totalsalary = salary + bonus;
	}
}


class Bonus
{
	public static void main(String args[])
	{
	Department d;
	accounts a = new accounts();
	sales s = new sales();
	marketing m = new marketing();

	System.out.println("Department \t basicsalary \t bonus \t totalsalary \t");
	System.out.println("------------------------------------------------------");

	d = a;
	d.calBonus(10000);
	d.display("Account dept");

	d = s;
	d.calBonus(20000);
	d.display("Sales dept");


	d = m;
	d.calBonus(15000);
	d.display("Marketing dept");

    System.out.println("------------------------------------------------------");

	}
}