class EllipseArgs
{
	double pi=3.14;
	void area(double a,double b)
	{
		System.out.println("Object created :)");
		double area=pi*a*b;
		System.out.println("---From the Area class---");
		System.out.println("area of Ellipse: "+area);
	}
	public static void main(String[]args)
	{
		new EllipseArgs().area(10.3,20.5);
	}
}