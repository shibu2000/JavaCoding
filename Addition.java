class Calculation
{
	static int a=10;
	static int add(int x){
		int res=a+x;
		return res;
	}
}
class Addition
{
	static int add2(int y){
		int c = Calculation.a+y;
		int res2=Calculation.add(c);
		return res2;
	}
	public static void main(String[]args){
		int res3=add2(10);
		System.out.println("Addition is : "+res3);
	}

}