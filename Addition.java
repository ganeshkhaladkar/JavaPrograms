class Addition
{
	public static void main(String args[])
	{
		System.out.println("I am in Main method");
		
		Addition a = new Addition();
		
		a.myName();
		a.add();
	}
	public void myName()
	{
		System.out.println("Ganesh Khaladkar");
	}
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.print(c);
	}
}