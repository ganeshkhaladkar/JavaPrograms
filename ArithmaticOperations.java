class ArithmaticOperations
{
	public static void main(String args[])
	{
		ArithmaticOperations a= new ArithmaticOperations();
		
		System.out.println("I am in Main");
		a.addition();
		a.sub();
		a.multi();
		a.division();
	}
	public void addition()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.print("Addition:");
		System.out.println(c);
	}
	public void sub()
	{
		int a=40;
		int b=30;
		int c=a-b;
		System.out.print("Substraction:");
		System.out.println(c);
	}
	public void multi()
	{
		int a=20;
		int b=30;
		int c=a*b;
		System.out.print("Multification:");
		System.out.println(c);
	}
	public void division()
	{
		int a=60;
		int b=30;
		int c=a/b;
		System.out.print("Devistion:");
		System.out.println(c);
	}
}