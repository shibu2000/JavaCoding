class RectangleWithArgs
{
	void shape(double a, double b)
	{
		System.out.println("Object created :)");
		double d=a*b;
		System.out.println("From the Area class");
		System.out.println("The rectangle areais"+d);
	}
	public static void main(String[] args)
	{
		new RectangleWithArgs().shape(4.5,10);
	}

}