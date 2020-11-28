class StaticMethod
{
	public static void myNameDisplay()
	{
		System.out.println("JAVA");
	}	

	public static void main(String args[])
	{
		System.out.println("I am In Main Method");
		
		StaticMethod sm = new StaticMethod();
		
		StaticMethod.myNameDisplay();

		sm.myNameDisplay();
	}
}
