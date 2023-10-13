package InterviewQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberToWord {
//	Creating integer list
	static ArrayList<Integer> num = new ArrayList<Integer>();
//	Creating string list
	static ArrayList<String> str1 = new ArrayList<String>();
	static ArrayList<String> str2 = new ArrayList<String>();
	static ArrayList<Integer> num2 =  new ArrayList<Integer>();
	
	// added reversed number into the ArrayList
	static ArrayList<Integer> num3 =  new ArrayList<Integer>();
	static String[] hunThous= {"Hundred", "Thousand"};
	
	static String res="";
	
	static void initialization() {
		for(int i=1;i<20;i++) {
			num.add(i);
		}
//		Adding element into str1 list ||ArrayList_num is linked with str1 ArrayList
		Collections.addAll(str1, "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen","Fifteen","Sixteen","Seventeen","Eignteen","Nineteen");

//		Adding element into str2 list || ArrayList_num2 is linked with str2 ArrayList
		Collections.addAll(str2, "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Nintey");
		
//		Adding one to nine into num2
		for(int i=2;i<=9;i++) {
			num2.add(i);
		}
	}
//=========================================================================================
	
//=========================================================================================
	static void getWordForLength2() {
		Boolean f=false;
		int rev=0;
		
		for(int i=(num3.size()-1);i>=0;i--) {
			rev=rev*10+num3.get(i);
		}
		
		for(int i=0;i<str1.size();i++) {
			if(num.get(i)==rev) {
				res = res+str1.get(i);
				f=true;
				break;
			}
		}
		
		if(f==false) {
			for(int i=0;i<num2.size();i++) {
				if(num3.get(num3.size()-1) == num2.get(i)) {
					res=res+str2.get(i);
					break;
				}
			}
			for(int i=0;i<num.size();i++) {
				if(num3.get(0) == num.get(i)) {
					res=res+" "+str1.get(i);
					break;
				}
			}
		}
		
	}
//=============================================================================================
	
	static void getWordForLength3() {
		if(num3.get(num3.size()-1)==0) {
			 num3.remove(num3.size()-1);
			 getWordForLength2();
		}else {
			for(int i=0;i<num.size();i++) {
				if(num3.get(num3.size()-1) == num.get(i)) {
					res = res + str1.get(i) +" "+hunThous[0]+ " ";
					num3.remove(num3.size()-1);
					getWordForLength2();
					break;
				}
			}
		}
		
	}
//=============================================================================================
	static void getWordForLength4() {
			for(int i=0;i<10;i++) {
				if(num3.get(num3.size()-1)==num.get(i)) {
					res=res+" "+str1.get(i)+" "+hunThous[1]+" ";
					num3.remove(num3.size()-1);
					getWordForLength3();
					break;
				}
			}
	}
//============================================================================================
	static void getWordForLength5() {
		boolean f=false;
		int rev=0;
		for(int i=(num3.size()-1);i>2;i--) {
			rev=rev*10+num3.get(i);
		}
		for(int i=0;i<num.size();i++) {
			if(num.get(i)==rev) {
				res = res+str1.get(i)+" "+hunThous[1]+" ";
				num3.remove(num3.size()-1);
				num3.remove(num3.size()-1);
				f=true;
				getWordForLength3();
				break;
			}
		}
		if(f == false) {
			for(int i=0;i<num2.size();i++) {
				if(num3.get(num3.size()-1) == num2.get(i)) {
					res = res + str2.get(i) +" ";
					num3.remove(num3.size()-1);
					getWordForLength4();
					break;
				}
			}
		}

	}
	
//=============================================================================================
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		initialization();
//		Taking input from user
		System.out.println("Enter the number: ");
		int key = sc.nextInt();
		Boolean f=false;
		
		for(int i=0;i<str1.size();i++) {
			
			if(num.get(i)==key) {
				f=true;
				System.out.println(str1.get(i));
				break;
			}
		}
		
		int len=0;
		
		if(f==false) {
			int tmp=key;
			while(tmp>0) {
				int rem=tmp%10;
				// added reversed number into the ArrayList
				num3.add(rem);
				tmp=tmp/10;
				len+=1;
			}
		}
//		System.out.println(len);
//		--------------------------------------------
		
		switch (len) {
		case 2:
			getWordForLength2();
			System.out.println(res);
			break;
			
		case 3:
//			System.out.println("pass 1");
			getWordForLength3();
			System.out.println(res);
			break;
		case 4:
			getWordForLength4();
			System.out.println(res);
			break;
		case 5:
			getWordForLength5();
			System.out.println(res);
			break;

		default:
//			System.out.print("Lacs module is under development period");
//			for(int i=0;i<5;i++) {
//				System.out.print(".");
//				Thread.sleep(500);
//			}
			break;
		}
		
		sc.close();
	}

}
