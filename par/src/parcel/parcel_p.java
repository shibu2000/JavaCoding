package parcel;

public class parcel_p {
	public static void main(String[] args) {
		
		for(int i=0;i<6;i++) 
		{
			for(int j=1;j<6-i;j++)
			{
				System.out.print(" ");
			}
			int n=1;
			for(int k=0;k<i;k++) 
			{
				
				System.out.print(n +" ");
				n=n*(i-k)/(k+1);

			
			}
			System.out.println(  );
			
		}
	}

}
