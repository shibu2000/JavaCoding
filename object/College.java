class College
{
	String s;
	char g;
	public static void main(String[] args){
		College c1=new College();
		c1.s="BBIT";
		c1.g='B';
		System.out.println("----OLD COLLEGE DETAILS----");
		System.out.println("College Name: "+c1.s);
		System.out.println("College Grade: "+c1.g);
		System.out.println("==========================");
		System.out.println("----NEW COLLEGE DETAILS");
		c1.s="QSpider";
		c1.g='A';
		System.out.println("College Name: "+c1.s);
		System.out.println("College Grade: "+c1.g);

	}
}