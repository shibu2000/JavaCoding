class Cool
{
	static int x=100;
	void fo(){
		System.out.println("Fooooooo");
	}
	void mo(){
		System.out.println("Mooooooo");
	}
	public static void main(String[] args){
		Cool c1=new Cool();
		c1.fo();
		c1.mo();
		System.out.println(c1);
	}
}