class Area
{
	static void shape(double a,double b)
	{
		double c=a*b;
		System.out.println("--From the Area class--");
		System.out.println("The Paralleogram areais"+c);
	}
}
class ParalleogramArgs
{
	public static void main(String[] args)
	{
		Area.shape(2.00,3.00);
	}

}