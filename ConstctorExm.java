class ConstctorExm
{
	public ConstctorExm()
	{
		this(5,8);
		System.out.println("Default Constructor");
	
	}

	public ConstctorExm(int a,int b)
	{	this(7,"JAVA");
		System.out.println(a);
		System.out.println(b);
	
	
	}
	
	public ConstctorExm(int a ,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String args[])
	{
		System.out.println("I Am in Main Method");
		ConstctorExm c = new ConstctorExm();
	}
}