class Constructor01
{
	Constructor01(int a, int b){
		int c=a+b;
		System.out.println("The addition is: "+c);
		//Constructor01(a,b,c);
	}
	Constructor01(int a, int b, int c){
		//int c=a+b;
		System.out.println("Hello");
	}
	public static void main(String[] args){
		new Constructor01(10,5);
		new Constructor01(10,5,15);
	}
}