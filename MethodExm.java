class MethodExm
{
	public static void FirstNameDisplay()
	{
		System.out.println("Ganesh");
		//middelNameDisplay();
		//lastNameDisplay();
	}

	public void middelNameDisplay()
	{
		FirstNameDisplay();
		System.out.println("Prabhakar");
		lastNameDisplay();
	}
	
	public static void lastNameDisplay()
	{

		System.out.println("Khaladkar");
	}

	public static void main(String args[])
	{

		System.out.println("I am in Main");
		
		MethodExm m= new MethodExm();
		m.middelNameDisplay();
		
		//MethodExm.FirstNameDisplay();
	}
}