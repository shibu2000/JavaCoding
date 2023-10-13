class Mobile01
{
	static String mname="SAMSUNG";
	static double disp=6.95;
	String clr;
	int ram;
	int strg;
	char ser;
	public static void main(String[]args){
		Mobile01 m1=new Mobile01();
		m1.clr="Green";
		m1.ram=4;
		m1.strg=64;
		m1.ser='A';
		Mobile01 m2=new Mobile01();
		m2.clr="White";
		m2.ram=6;
		m2.strg=128;
		m2.ser='B';
		Mobile01 m3=new Mobile01();
		m3.clr="Black";
		m3.ram=8;
		m3.strg=256;
		m3.ser='C';

		System.out.println(mname+" "+m1.ser+" Series");
		System.out.println("Display: "+disp+" inch, RAM: "+m1.ram+", Storage:"+m1.strg);
		
		System.out.println(mname+" "+m2.ser+" Series");
		System.out.println("Display: "+disp+" inch, RAM: "+m2.ram+", Storage:"+m2.strg);

		System.out.println(mname+" "+m3.ser+" Series");
		System.out.println("Display: "+disp+" inch, RAM: "+m3.ram+", Storage:"+m3.strg);
	}
}