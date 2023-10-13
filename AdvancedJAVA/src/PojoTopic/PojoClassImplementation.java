package PojoTopic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import BeanClassTopic.Mobile;

public class PojoClassImplementation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Set<Mobile> mobiles = new HashSet<Mobile>();
	Mobile mobile = new Mobile();
	int generateId=99;
	boolean flag=true;
	while(flag) {
		mobile.setMobile_id(generateId+1);
		
		System.out.println("Enter brand name: ");
		mobile.setMobile_brand(sc.next());
		
		System.out.println("Enter model no: ");
		mobile.setModel_no(sc.next());
		
		mobiles.add(mobile);
		
		System.out.println("1 to continue, 0 to exit");
		if(sc.nextInt()==0) {
			flag=false;
		}
	}
	System.out.println(mobiles);
}
}
