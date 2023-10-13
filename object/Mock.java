class Mock
{
	static String inst="QSpider";
	String name;
	int mock_r;
	public static void main(String[] args)
	{
		Mock dinga=new Mock();
		Mock dingi=new Mock();
		//=============dinga's Details===============
		dinga.name="Dinga";
		dinga.mock_r=1;
		//============dingi's Details================
		dingi.name="Dingi";
		dingi.mock_r=3;
		System.out.println("----------Mock Rating----------");
		System.out.println("Name: "+dinga.name+"\nMock Rating: "+dinga.mock_r);
		System.out.println("\nName: "+dingi.name+"\nMock Rating: "+dingi.mock_r);
		System.out.println("-----------After Re-mock---------");
		dingi.mock_r=1;
		System.out.println("Name: "+dingi.name+"\nMock Rating: "+dingi.mock_r+" (Updated)");
	}
}