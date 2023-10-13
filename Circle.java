class Area{
	static void area(int r){
		double area=Circle.pi*r*r;
		System.out.println("The area of circle is: "+area);
	}
}
class Circle
{
	static double pi=3.142;
	public static void main(String[] args){
		Area.area(5);
	}
}