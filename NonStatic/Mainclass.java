class College
{
	String s1="BBIT";
	int f1=27300;
	char g1='A';
}
class Mobile
{
	String s2="Infinix";
	int p1=13000;
	char g2='B';
}
class Mainclass
{
	public static void main(String[] args){
		College c1=new College();
		Mobile m1=new Mobile();
		System.out.println("-----College Details-----");
		System.out.println(c1.s1);
		System.out.println(c1.f1);
		System.out.println(c1.g1);

		System.out.println("-----Mobile Details-----");
		System.out.println(m1.s2);
		System.out.println(m1.p1);
		System.out.println(m1.g2);
	}
}