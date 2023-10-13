class Sample
{
	int x=100;
	void add(){
		System.out.println("Hello");
	}
	public static void main(String[] args){
		System.out.println(new Sample().x);
		new Sample().add();
	}
}