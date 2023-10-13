class Addition
{
	int z;
	void add(){
		int x=10;
		int y=20;
		z=x+y;
		System.out.println("The addition is: "+z);
	}
	public static void main(String[] args){
		new Addition().add();
		System.out.println("After constructor eexecuted");
		System.out.println(new Addition().z);
	}
}