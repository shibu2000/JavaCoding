package Encapsulation;

import java.util.Scanner;
class SecondHighest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int highest;
		System.out.println("Enter the array size: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter "+size+" numbers: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		highest=arr[0];
		for(int i=0;i<size;i++){
			while(i<size-1){
				if(highest < arr[i+1]){
					highest=arr[i+1];
				}
			}
		}
		System.out.println("The highest number is "+highest);
	}
}
