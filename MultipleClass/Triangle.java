class Area {
	//static double base = 5;
	//static double height = 3.2;
	
	static void area(int base, double height){
		double area = (base * height) / 2;
        // area = area * base * height;
        System.out.println("The Area of Triangle is: " +area);
	}
}
class Triangle
{
    public static void main(String[] args) {
        Area.area(5,3.2);
    }
}
