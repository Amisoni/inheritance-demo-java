class abc
{
	void sum(int a, int b)
	{
		system.out.println("Sum Is:"+(a+b));
	}
}
class pqr extends abc
{
	void sub(int a, int b)
	{
		system.out.println("Sub Is:"+(a-b));
	}
}
class xyz
{
	public static void main(String args[])
	{
		pqr a= new pqr();
		a.sum(15,5);
	}
}