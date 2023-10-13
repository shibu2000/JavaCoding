class Area
{
	void area(int side)
	{
		System.out.println("Object created :)");
		int result = side*side;
		System.out.println("From the Area class");
		System.out.println("The Area of Square is "+result);
	}
}
class SquareArguments
{
	public static void main(String[]args)
	{
		new Area().area(5);
	}
}
			