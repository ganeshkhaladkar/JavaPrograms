class MethodContructor
{
	public MethodContructor()
	{
		middelNameDisplay();
		System.out.println("Default constroctor");
		lastNameDisplay();
		
			
	}
	
	public static void FirstNameDisplay()
	{
		//MethodContructor m= new MethodContructor();

		System.out.println("Ganesh");
		
	}

	public void middelNameDisplay()
	{
		System.out.println("Prabhakar");
		lastNameDisplay();
		
	}
	
	public static void lastNameDisplay()
	{

		System.out.println("Khaladkar");
		FirstNameDisplay();
	}

	public static void main(String args[])
	{

		System.out.println("I am in Main");
		
		//MethodExm m= new MethodExm();
		//m.middelNameDisplay();
		
		MethodExm.FirstNameDisplay();
		MethodContructor m= new MethodContructor();
	}
}