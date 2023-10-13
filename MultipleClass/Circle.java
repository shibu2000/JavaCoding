class Area
{
	static double pi=3.142;
	static void area(){
		int r=5;
		double area=pi*r*r;
		System.out.println("From another class");
		System.out.println("The area of circle is: "+area);
	}
}
class Circle
{
	public static void main(String[] args){
		System.out.println("(Area)PI value is: "+Area.pi);
		Area.area();
	}
}