class CircleParameter{
	static void area(double r){
		double pi=3.142;
		double area=pi*r*r;
		System.out.println("The area of circle is= "+area);
	}
	public static void main(String[] args){
		area(3.14);
	}
}