class Area {
	static void area(double a, double b, double height){
		double area = ((a + b) * height) / 2;
		System.out.println("--From the Area class--");
        System.out.println("The Area of Trapezoid is: " +area);
	}
}
class Trapezoid
{
    public static void main(String[] args) {
        Area.area(5.2,4.4,9 );
    }
}
