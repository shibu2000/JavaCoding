class Demo
{
	int a=10;
	int b=20;
}
class Mainclass2
{
	public static void main(String[] args){
		Demo d1=new Demo();
		System.out.println(d1.a);
		Demo d2=d1;
		d2.a=100;
		d1.a=1000;
		System.out.println("d1: "+d1.a);
		System.out.println("d2: "+d2.a);
		
		
	}
}