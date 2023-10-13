class Area
{
	static void shape(double a, double b)
	{
		double d=a*b;
		System.out.println("From the Area class");
		System.out.println("The rectangle areais"+d);
	}
}
class RectangleWithArgs
{
	public static void main(String[] args)
	{
		Area.shape(4.5,10);
	}

}